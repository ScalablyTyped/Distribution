package typings.wdioTypes

import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildClientsMod {
  
  trait Browser extends StObject
  
  trait Multiremote extends StObject {
    
    var capabilities: DesiredCapabilities
    
    var sessionId: js.UndefOr[String] = js.undefined
  }
  object Multiremote {
    
    inline def apply(capabilities: DesiredCapabilities): Multiremote = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Multiremote]
    }
    
    extension [Self <: Multiremote](x: Self) {
      
      inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    }
  }
}
