package typings.wdioTypes.optionsMod

import typings.wdioTypes.capabilitiesMod.DesiredCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRemoteBrowserOptions extends StObject {
  
  var capabilities: DesiredCapabilities
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object MultiRemoteBrowserOptions {
  
  inline def apply(capabilities: DesiredCapabilities): MultiRemoteBrowserOptions = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiRemoteBrowserOptions]
  }
  
  extension [Self <: MultiRemoteBrowserOptions](x: Self) {
    
    inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
