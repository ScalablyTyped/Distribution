package typings.wdioTypes.buildOptionsMod

import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRemoteBrowserOptions] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
