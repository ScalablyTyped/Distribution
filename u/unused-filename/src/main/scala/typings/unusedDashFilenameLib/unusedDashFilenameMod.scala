package typings
package unusedDashFilenameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unused-filename", JSImport.Namespace)
@js.native
object unusedDashFilenameMod extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: unusedDashFilenameLib.Anon_Default = js.native
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  def apply(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  // TODO: Remove this for the next major release
  def default(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
  	Synchronously get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  def sync(filePath: java.lang.String): java.lang.String = js.native
}

