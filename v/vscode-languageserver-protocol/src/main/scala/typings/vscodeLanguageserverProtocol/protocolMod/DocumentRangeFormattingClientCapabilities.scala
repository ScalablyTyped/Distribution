package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRangeFormattingClientCapabilities extends StObject {
  
  /**
    * Whether range formatting supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object DocumentRangeFormattingClientCapabilities {
  
  @scala.inline
  def apply(): DocumentRangeFormattingClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentRangeFormattingClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentRangeFormattingClientCapabilitiesMutableBuilder[Self <: DocumentRangeFormattingClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
  }
}
