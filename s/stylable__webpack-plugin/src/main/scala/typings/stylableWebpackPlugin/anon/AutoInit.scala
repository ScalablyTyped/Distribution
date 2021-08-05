package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoInit extends StObject {
  
  var autoInit: Boolean
  
  var getAutoInitModule: js.UndefOr[js.Any] = js.undefined
  
  var globalInjection: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
}
object AutoInit {
  
  inline def apply(autoInit: Boolean): AutoInit = {
    val __obj = js.Dynamic.literal(autoInit = autoInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoInit]
  }
  
  extension [Self <: AutoInit](x: Self) {
    
    inline def setAutoInit(value: Boolean): Self = StObject.set(x, "autoInit", value.asInstanceOf[js.Any])
    
    inline def setGetAutoInitModule(value: js.Any): Self = StObject.set(x, "getAutoInitModule", value.asInstanceOf[js.Any])
    
    inline def setGetAutoInitModuleUndefined: Self = StObject.set(x, "getAutoInitModule", js.undefined)
    
    inline def setGlobalInjection(value: /* p */ String => String): Self = StObject.set(x, "globalInjection", js.Any.fromFunction1(value))
    
    inline def setGlobalInjectionUndefined: Self = StObject.set(x, "globalInjection", js.undefined)
  }
}
