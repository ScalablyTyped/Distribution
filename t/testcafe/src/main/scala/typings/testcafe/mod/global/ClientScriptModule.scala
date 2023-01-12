package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScriptModule
  extends StObject
     with ClientScriptCommon
     with ClientScript {
  
  var module: js.UndefOr[String] = js.undefined
}
object ClientScriptModule {
  
  inline def apply(): ClientScriptModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScriptModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientScriptModule] (val x: Self) extends AnyVal {
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}
