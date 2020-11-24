package typings.webappsecCredentialManagement

import typings.std.AbortSignal
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.optional
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.required
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-credentialrequestoptions}
  */
@js.native
trait CredentialRequestOptions extends js.Object {
  
  /**
    * If set, the user agent will request {@link FederatedCredential} objects
    * for the providers and protocol types listed. Defaults to {@code null}.
    */
  var federated: js.UndefOr[FederatedCredentialRequestOptions] = js.native
  
  /**
    * This property specifies the mediation requirements for a given credential
    * request.
    */
  var mediation: js.UndefOr[silent | optional | required] = js.native
  
  /**
    * If set, the user agent will request {@link PasswordCredential} objects.
    * Defaults to {@code false}.
    */
  var password: js.UndefOr[Boolean] = js.native
  
  /**
    * This property specifies options for requesting a public-key signature.
    */
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.native
  
  /**
    * This property lets the developer abort an ongoing get() operation.
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * If {@code true}, the user agent will only attempt to provide a Credential
    * without user interaction. Defaults to {@code false}.
    *
    * @deprecated Use {@link mediation} instead.
    */
  var unmediated: js.UndefOr[Boolean] = js.native
}
object CredentialRequestOptions {
  
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  
  @scala.inline
  implicit class CredentialRequestOptionsOps[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setFederated(value: FederatedCredentialRequestOptions): Self = this.set("federated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFederated: Self = this.set("federated", js.undefined)
    
    @scala.inline
    def setMediation(value: silent | optional | required): Self = this.set("mediation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediation: Self = this.set("mediation", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setUnmediated(value: Boolean): Self = this.set("unmediated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmediated: Self = this.set("unmediated", js.undefined)
  }
}
