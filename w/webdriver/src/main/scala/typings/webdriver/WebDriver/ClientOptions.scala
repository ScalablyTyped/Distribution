package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  var capabilities: DesiredCapabilities
  
  var isAndroid: Boolean
  
  var isChrome: Boolean
  
  var isDevTools: Boolean
  
  var isIOS: Boolean
  
  var isMobile: Boolean
  
  var isSauce: Boolean
  
  var isW3C: Boolean
  
  var sessionId: String
}
object ClientOptions {
  
  inline def apply(
    capabilities: DesiredCapabilities,
    isAndroid: Boolean,
    isChrome: Boolean,
    isDevTools: Boolean,
    isIOS: Boolean,
    isMobile: Boolean,
    isSauce: Boolean,
    isW3C: Boolean,
    sessionId: String
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isDevTools = isDevTools.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  extension [Self <: ClientOptions](x: Self) {
    
    inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
    
    inline def setIsDevTools(value: Boolean): Self = StObject.set(x, "isDevTools", value.asInstanceOf[js.Any])
    
    inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    
    inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
