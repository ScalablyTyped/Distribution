package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ExceptionOptions assigns configuration options to a set of exceptions. */
trait ExceptionOptions extends StObject {
  
  /** Condition when a thrown exception should result in a break. */
  var breakMode: ExceptionBreakMode
  
  /** A path that selects a single or multiple exceptions in a tree. If `path` is missing, the whole tree is selected.
  			By convention the first segment of the path is a category that is used to group exceptions in the UI.
  		*/
  var path: js.UndefOr[js.Array[ExceptionPathSegment]] = js.undefined
}
object ExceptionOptions {
  
  inline def apply(breakMode: ExceptionBreakMode): ExceptionOptions = {
    val __obj = js.Dynamic.literal(breakMode = breakMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptions]
  }
  
  extension [Self <: ExceptionOptions](x: Self) {
    
    inline def setBreakMode(value: ExceptionBreakMode): Self = StObject.set(x, "breakMode", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[ExceptionPathSegment]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: ExceptionPathSegment*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
