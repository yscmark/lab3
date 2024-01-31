import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests implements StringChecker {
	// checkString checks if the string contains an a
	public boolean checkString(String s) {
		return s.contains("a");
	}

	@Test 
	public void testFilter() {
		StringChecker sc = new ListTests();
		List<String> input = new ArrayList<>(Arrays.asList("cat", "dog", "rabbit"));
		List<String> output = new ArrayList<>(Arrays.asList("cat", "rabbit"));
		assertEquals(output, ListExamples.filter(input, sc));
	}

	@Test
	public void testMerge() {
		List<String> input1 = new ArrayList<>(Arrays.asList("a", "c", "e", "g"));
		List<String> input2 = new ArrayList<>(Arrays.asList("b", "d", "f"));
		List<String> output = new ArrayList<>(
			Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
		assertEquals(output, ListExamples.merge(input1, input2));
	}
}
