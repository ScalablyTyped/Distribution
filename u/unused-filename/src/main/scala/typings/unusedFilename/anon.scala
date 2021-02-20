package typings.unusedFilename

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
    	@param filePath - The path to check for filename collision.
    	@returns Either the original `filename` or the `filename` appended with a number.
    	*/
    def apply(filePath: String): js.Promise[String] = js.native
    
    /**
    	Synchronously get an unused filename by appending a number if it exists: `file.txt` → `file (1).txt`.
    	@param filePath - The path to check for filename collision.
    	@returns Either the original `filename` or the `filename` appended with a number.
    	*/
    def sync(filePath: String): String = js.native
  }
}
