package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOnTypeFormattingClientCapabilities extends StObject {
  
  /**
    * Whether on type formatting supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}
object DocumentOnTypeFormattingClientCapabilities {
  
  @scala.inline
  def apply(): DocumentOnTypeFormattingClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOnTypeFormattingClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentOnTypeFormattingClientCapabilitiesMutableBuilder[Self <: DocumentOnTypeFormattingClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
