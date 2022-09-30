package typings.testcafeHammerhead.mod

import typings.testcafeHammerhead.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedProxyUrl extends StObject {
  
  var charset: js.UndefOr[String] = js.undefined
  
  var credentials: js.UndefOr[Double] = js.undefined
  
  var destResourceInfo: ParsedUrl
  
  var destUrl: String
  
  var partAfterHost: String
  
  var proxy: Port
  
  var reqOrigin: js.UndefOr[String] = js.undefined
  
  var resourceType: String
  
  var sessionId: String
  
  var windowId: js.UndefOr[String] = js.undefined
}
object ParsedProxyUrl {
  
  inline def apply(
    destResourceInfo: ParsedUrl,
    destUrl: String,
    partAfterHost: String,
    proxy: Port,
    resourceType: String,
    sessionId: String
  ): ParsedProxyUrl = {
    val __obj = js.Dynamic.literal(destResourceInfo = destResourceInfo.asInstanceOf[js.Any], destUrl = destUrl.asInstanceOf[js.Any], partAfterHost = partAfterHost.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedProxyUrl]
  }
  
  extension [Self <: ParsedProxyUrl](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setCredentials(value: Double): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDestResourceInfo(value: ParsedUrl): Self = StObject.set(x, "destResourceInfo", value.asInstanceOf[js.Any])
    
    inline def setDestUrl(value: String): Self = StObject.set(x, "destUrl", value.asInstanceOf[js.Any])
    
    inline def setPartAfterHost(value: String): Self = StObject.set(x, "partAfterHost", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: Port): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setReqOrigin(value: String): Self = StObject.set(x, "reqOrigin", value.asInstanceOf[js.Any])
    
    inline def setReqOriginUndefined: Self = StObject.set(x, "reqOrigin", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: String): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
