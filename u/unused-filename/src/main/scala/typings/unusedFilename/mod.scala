package typings.unusedFilename

import typings.unusedFilename.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  @scala.inline
  def apply(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("unused-filename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("unused-filename", "default")
  @js.native
  def default: Call = js.native
  /**
  	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  // TODO: Remove this for the next major release
  @scala.inline
  def default(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Synchronously get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
  	@param filePath - The path to check for filename collision.
  	@returns Either the original `filename` or the `filename` appended with a number.
  	*/
  @scala.inline
  def sync(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
}
