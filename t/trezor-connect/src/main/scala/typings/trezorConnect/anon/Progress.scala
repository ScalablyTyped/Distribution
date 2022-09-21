package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress[R] extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var progress: Double
  
  var response: R
}
object Progress {
  
  inline def apply[R](progress: Double, response: R): Progress[R] = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress[R]]
  }
  
  extension [Self <: Progress[?], R](x: Self & Progress[R]) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: R): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
