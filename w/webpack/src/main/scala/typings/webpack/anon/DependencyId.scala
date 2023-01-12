package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.`accept-error-handler-errored`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyId
  extends StObject
     with HotEvent {
  
  /** the module id owning the accept handler. */
  var dependencyId: Double
  
  /** the thrown error */
  var error: js.Error
  
  /** The module in question. */
  var moduleId: Double
  
  /** the error thrown by the module before the error handler tried to handle it. */
  var originalError: js.Error
  
  var `type`: `accept-error-handler-errored`
}
object DependencyId {
  
  inline def apply(dependencyId: Double, error: js.Error, moduleId: Double, originalError: js.Error): DependencyId = {
    val __obj = js.Dynamic.literal(dependencyId = dependencyId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accept-error-handler-errored")
    __obj.asInstanceOf[DependencyId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependencyId] (val x: Self) extends AnyVal {
    
    inline def setDependencyId(value: Double): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setOriginalError(value: js.Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
    
    inline def setType(value: `accept-error-handler-errored`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
