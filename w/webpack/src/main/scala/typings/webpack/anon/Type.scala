package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.`accept-errored`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with HotEvent {
  
  /** the module id owning the accept handler. */
  var dependencyId: Double
  
  /** the thrown error */
  var error: js.Error
  
  /** The module in question. */
  var moduleId: Double
  
  var `type`: `accept-errored`
}
object Type {
  
  inline def apply(dependencyId: Double, error: js.Error, moduleId: Double): Type = {
    val __obj = js.Dynamic.literal(dependencyId = dependencyId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("accept-errored")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setDependencyId(value: Double): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `accept-errored`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
