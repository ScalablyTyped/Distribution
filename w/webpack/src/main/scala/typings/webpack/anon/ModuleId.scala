package typings.webpack.anon

import typings.webpack.webpack.HotEvent
import typings.webpack.webpackStrings.disposed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleId
  extends StObject
     with HotEvent {
  
  /** The module in question. */
  var moduleId: Double
  
  var `type`: disposed
}
object ModuleId {
  
  inline def apply(moduleId: Double): ModuleId = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disposed")
    __obj.asInstanceOf[ModuleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleId] (val x: Self) extends AnyVal {
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: disposed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
