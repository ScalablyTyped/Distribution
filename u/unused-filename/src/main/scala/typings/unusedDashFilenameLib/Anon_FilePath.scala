package typings
package unusedDashFilenameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FilePath extends js.Object {
  /**
  	 * Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	 *
  	 * @param filePath - The path to check for filename collision.
  	 * @returns Either the original `filename` or the `filename` appended with a number.
  	 */
  def apply(filePath: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
  	 * Synchronously get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	 *
  	 * @param filePath - The path to check for filename collision.
  	 * @returns Either the original `filename` or the `filename` appended with a number.
  	 */
  def sync(filePath: java.lang.String): java.lang.String = js.native
}

