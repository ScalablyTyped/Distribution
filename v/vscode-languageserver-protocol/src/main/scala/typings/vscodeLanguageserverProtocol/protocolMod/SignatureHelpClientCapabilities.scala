package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.DocumentationFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpClientCapabilities extends StObject {
  
  /**
    * The client supports to send additional context information for a
    * `textDocument/signatureHelp` request. A client that opts into
    * contextSupport will also support the `retriggerCharacters` on
    * `SignatureHelpOptions`.
    *
    * @since 3.15.0
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[DocumentationFormat] = js.undefined
}
object SignatureHelpClientCapabilities {
  
  inline def apply(): SignatureHelpClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpClientCapabilities]
  }
  
  extension [Self <: SignatureHelpClientCapabilities](x: Self) {
    
    inline def setContextSupport(value: Boolean): Self = StObject.set(x, "contextSupport", value.asInstanceOf[js.Any])
    
    inline def setContextSupportUndefined: Self = StObject.set(x, "contextSupport", js.undefined)
    
    inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    inline def setSignatureInformation(value: DocumentationFormat): Self = StObject.set(x, "signatureInformation", value.asInstanceOf[js.Any])
    
    inline def setSignatureInformationUndefined: Self = StObject.set(x, "signatureInformation", js.undefined)
  }
}
