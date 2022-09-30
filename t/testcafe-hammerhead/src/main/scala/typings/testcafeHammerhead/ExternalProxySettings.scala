package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProxySettings extends StObject {
  
  var authHeader: js.UndefOr[String] = js.undefined
  
  var bypassRules: js.UndefOr[js.Array[String]] = js.undefined
  
  var host: String
  
  var hostname: String
  
  var port: js.UndefOr[String] = js.undefined
  
  var proxyAuth: js.UndefOr[String] = js.undefined
}
object ExternalProxySettings {
  
  inline def apply(host: String, hostname: String): ExternalProxySettings = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalProxySettings]
  }
  
  extension [Self <: ExternalProxySettings](x: Self) {
    
    inline def setAuthHeader(value: String): Self = StObject.set(x, "authHeader", value.asInstanceOf[js.Any])
    
    inline def setAuthHeaderUndefined: Self = StObject.set(x, "authHeader", js.undefined)
    
    inline def setBypassRules(value: js.Array[String]): Self = StObject.set(x, "bypassRules", value.asInstanceOf[js.Any])
    
    inline def setBypassRulesUndefined: Self = StObject.set(x, "bypassRules", js.undefined)
    
    inline def setBypassRulesVarargs(value: String*): Self = StObject.set(x, "bypassRules", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxyAuth(value: String): Self = StObject.set(x, "proxyAuth", value.asInstanceOf[js.Any])
    
    inline def setProxyAuthUndefined: Self = StObject.set(x, "proxyAuth", js.undefined)
  }
}
