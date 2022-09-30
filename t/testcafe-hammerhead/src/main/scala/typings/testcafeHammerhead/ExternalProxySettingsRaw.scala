package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProxySettingsRaw extends StObject {
  
  var bypassRules: js.UndefOr[js.Array[String]] = js.undefined
  
  var url: String
}
object ExternalProxySettingsRaw {
  
  inline def apply(url: String): ExternalProxySettingsRaw = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalProxySettingsRaw]
  }
  
  extension [Self <: ExternalProxySettingsRaw](x: Self) {
    
    inline def setBypassRules(value: js.Array[String]): Self = StObject.set(x, "bypassRules", value.asInstanceOf[js.Any])
    
    inline def setBypassRulesUndefined: Self = StObject.set(x, "bypassRules", js.undefined)
    
    inline def setBypassRulesVarargs(value: String*): Self = StObject.set(x, "bypassRules", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
