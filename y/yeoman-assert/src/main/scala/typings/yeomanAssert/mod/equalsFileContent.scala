package typings.yeomanAssert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-assert", "equalsFileContent")
@js.native
object equalsFileContent extends js.Object {
  /**
    * Assert that a file's content is the same as the given string
    * @param file path to a file
    * @param expectedContent the expected content of the file
    * @example
    * assert.equalsFileContent(
    *   'data.js',
    *   'const greeting = "Hello";\nexport default { greeting }'
    * );
    */
  def apply(file: String, expectedContent: String): Unit = js.native
  /**
    * Assert that each file in an array of file-string pairs equals its corresponding string
    * @param pairs an array of arrays, where each subarray is a [String, String] pair
    * @example
    * assert.equalsFileContent([
    *   ['data.js', 'const greeting = "Hello";\nexport default { greeting }'],
    *   ['user.js', 'export default {\n  name: 'Coleman',\n  age: 0\n}']
    * ]);
    */
  def apply(pairs: js.Array[js.Tuple2[String, String]]): Unit = js.native
}

