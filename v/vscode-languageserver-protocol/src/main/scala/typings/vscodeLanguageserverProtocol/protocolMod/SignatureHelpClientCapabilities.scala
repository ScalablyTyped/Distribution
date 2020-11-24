package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.DocumentationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpClientCapabilities extends js.Object {
  
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
  implicit class SignatureHelpClientCapabilitiesOps[Self <: SignatureHelpClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextSupport(value: Boolean): Self = this.set("contextSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextSupport: Self = this.set("contextSupport", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    
    @scala.inline
    def setSignatureInformation(value: DocumentationFormat): Self = this.set("signatureInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureInformation: Self = this.set("signatureInformation", js.undefined)
  }
}
