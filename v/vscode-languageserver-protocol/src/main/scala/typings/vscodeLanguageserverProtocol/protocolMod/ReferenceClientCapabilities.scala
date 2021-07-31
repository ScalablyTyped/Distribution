package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceClientCapabilities extends StObject {
  
  /**
    * Whether references supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object ReferenceClientCapabilities {
  
  @scala.inline
  def apply(): ReferenceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceClientCapabilities]
  }
  
  @scala.inline
  implicit class ReferenceClientCapabilitiesMutableBuilder[Self <: ReferenceClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
