package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedUrl extends StObject {
  
  var auth: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var partAfterHost: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
}
object ParsedUrl {
  
  inline def apply(): ParsedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedUrl]
  }
  
  extension [Self <: ParsedUrl](x: Self) {
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPartAfterHost(value: String): Self = StObject.set(x, "partAfterHost", value.asInstanceOf[js.Any])
    
    inline def setPartAfterHostUndefined: Self = StObject.set(x, "partAfterHost", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
