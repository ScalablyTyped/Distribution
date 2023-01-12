package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
  var auth: js.UndefOr[AuthOptions] = js.undefined
  
  var bypassRules: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var host: String
  
  var port: Double | String
  
  var protocol: js.UndefOr[String] = js.undefined
}
object ProxyOptions {
  
  inline def apply(host: String, port: Double | String): ProxyOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBypassRules(value: String | js.Array[String]): Self = StObject.set(x, "bypassRules", value.asInstanceOf[js.Any])
    
    inline def setBypassRulesUndefined: Self = StObject.set(x, "bypassRules", js.undefined)
    
    inline def setBypassRulesVarargs(value: String*): Self = StObject.set(x, "bypassRules", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
