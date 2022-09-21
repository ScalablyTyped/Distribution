package typings.webpack.mod

import typings.webpack.anon.Readonlycontenttapoptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleTemplate extends StObject {
  
  var hooks: Readonlycontenttapoptions
  
  val runtimeTemplate: Any
  
  var `type`: String
}
object ModuleTemplate {
  
  inline def apply(hooks: Readonlycontenttapoptions, runtimeTemplate: Any, `type`: String): ModuleTemplate = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleTemplate]
  }
  
  extension [Self <: ModuleTemplate](x: Self) {
    
    inline def setHooks(value: Readonlycontenttapoptions): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: Any): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
