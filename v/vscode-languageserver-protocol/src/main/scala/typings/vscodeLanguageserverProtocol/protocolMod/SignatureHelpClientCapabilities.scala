package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.DocumentationFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpClientCapabilities extends StObject {
  
  /**
    * The client supports to send additional context information for a
    * `textDocument/signatureHelp` request. A client that opts into
    * contextSupport will also support the `retriggerCharacters` on
    * `SignatureHelpOptions`.
    *
    * @since 3.15.0
    */
  var contextSupport: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[DocumentationFormat] = js.native
}
object SignatureHelpClientCapabilities {
  
  @scala.inline
  def apply(): SignatureHelpClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpClientCapabilities]
  }
  
  @scala.inline
  implicit class SignatureHelpClientCapabilitiesMutableBuilder[Self <: SignatureHelpClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextSupport(value: Boolean): Self = StObject.set(x, "contextSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextSupportUndefined: Self = StObject.set(x, "contextSupport", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setSignatureInformation(value: DocumentationFormat): Self = StObject.set(x, "signatureInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInformationUndefined: Self = StObject.set(x, "signatureInformation", js.undefined)
  }
}
