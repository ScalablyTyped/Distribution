package typings.unusedFilename

import typings.unusedFilename.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unused-filename", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  def apply(filePath: String): js.Promise[String] = js.native
  
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  // TODO: Remove this for the next major release
  def default(filePath: String): js.Promise[String] = js.native
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Call = js.native
  
  /**
  	Synchronously get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  def sync(filePath: String): String = js.native
}
