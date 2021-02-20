package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLinkClientCapabilities extends StObject {
  
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the client support the `tooltip` property on `DocumentLink`.
    *
    * @since 3.15.0
    */
  var tooltipSupport: js.UndefOr[Boolean] = js.native
}
object DocumentLinkClientCapabilities {
  
  @scala.inline
  def apply(): DocumentLinkClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentLinkClientCapabilitiesMutableBuilder[Self <: DocumentLinkClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setTooltipSupport(value: Boolean): Self = StObject.set(x, "tooltipSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipSupportUndefined: Self = StObject.set(x, "tooltipSupport", js.undefined)
  }
}
