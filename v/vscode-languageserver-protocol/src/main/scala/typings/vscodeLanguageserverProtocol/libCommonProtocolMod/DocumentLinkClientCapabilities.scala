package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLinkClientCapabilities extends StObject {
  
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the client supports the `tooltip` property on `DocumentLink`.
    *
    * @since 3.15.0
    */
  var tooltipSupport: js.UndefOr[Boolean] = js.undefined
}
object DocumentLinkClientCapabilities {
  
  inline def apply(): DocumentLinkClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkClientCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentLinkClientCapabilities] (val x: Self) extends AnyVal {
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setTooltipSupport(value: Boolean): Self = StObject.set(x, "tooltipSupport", value.asInstanceOf[js.Any])
    
    inline def setTooltipSupportUndefined: Self = StObject.set(x, "tooltipSupport", js.undefined)
  }
}
