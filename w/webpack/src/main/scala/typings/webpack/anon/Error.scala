package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.`self-accept-error-handler-errored`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with HotEvent {
  
  /** the thrown error */
  var error: js.Error
  
  /** The module in question. */
  var moduleId: Double
  
  /** the error thrown by the module before the error handler tried to handle it. */
  var originalError: js.Error
  
  var `type`: `self-accept-error-handler-errored`
}
object Error {
  
  inline def apply(error: js.Error, moduleId: Double, originalError: js.Error): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("self-accept-error-handler-errored")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setOriginalError(value: js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
    
    inline def setType(value: `self-accept-error-handler-errored`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
