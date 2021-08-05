package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClient extends StObject {
  
  // assigned capabilities by the browser driver / WebDriver server
  var capabilities: DesiredCapabilities
  
  // true if mobile session runs on Android
  var isAndroid: Boolean
  
  // true if mobile session runs on iOS
  var isIOS: Boolean
  
  /**
    * browser flags
    */
  // true if session runs on a mobile device
  var isMobile: Boolean
  
  // original requested capabilities
  var requestedCapabilities: DesiredCapabilities
  
  // id of WebDriver session
  var sessionId: String
}
object BaseClient {
  
  inline def apply(
    capabilities: DesiredCapabilities,
    isAndroid: Boolean,
    isIOS: Boolean,
    isMobile: Boolean,
    requestedCapabilities: DesiredCapabilities,
    sessionId: String
  ): BaseClient = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], isAndroid = isAndroid.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], requestedCapabilities = requestedCapabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClient]
  }
  
  extension [Self <: BaseClient](x: Self) {
    
    inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
    
    inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
    
    inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    inline def setRequestedCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
