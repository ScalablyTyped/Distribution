package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.`self-accept-errored`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorModuleId
  extends StObject
     with HotEvent {
  
  /** the thrown error */
  var error: js.Error
  
  /** The module in question. */
  var moduleId: Double
  
  var `type`: `self-accept-errored`
}
object ErrorModuleId {
  
  inline def apply(error: js.Error, moduleId: Double): ErrorModuleId = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("self-accept-errored")
    __obj.asInstanceOf[ErrorModuleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorModuleId] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `self-accept-errored`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
