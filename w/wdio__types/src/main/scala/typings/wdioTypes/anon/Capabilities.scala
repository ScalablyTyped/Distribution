package typings.wdioTypes.anon

import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  var capabilities: RemoteCapability
  
  var isMultiremote: js.UndefOr[Boolean] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object Capabilities {
  
  inline def apply(capabilities: RemoteCapability): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setIsMultiremote(value: Boolean): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
    
    inline def setIsMultiremoteUndefined: Self = StObject.set(x, "isMultiremote", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
