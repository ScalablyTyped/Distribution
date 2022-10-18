package typings.vueDevtoolsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: String
  
  var componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
}
object Code {
  
  inline def apply(code: String, componentInstance: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], componentInstance = componentInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComponentInstance(value: typings.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
  }
}
