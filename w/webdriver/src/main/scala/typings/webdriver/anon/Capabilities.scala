package typings.webdriver.anon

import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  var capabilities: DesiredCapabilities
  
  var sessionId: String
}
object Capabilities {
  
  inline def apply(capabilities: DesiredCapabilities, sessionId: String): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  extension [Self <: Capabilities](x: Self) {
    
    inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
