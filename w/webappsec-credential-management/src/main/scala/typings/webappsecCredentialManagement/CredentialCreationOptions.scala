package typings.webappsecCredentialManagement

import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-credentialcreationoptions}
  */
@js.native
trait CredentialCreationOptions extends js.Object {
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialcreationoptions-federated}
    */
  var federated: js.UndefOr[FederatedCredentialInit] = js.native
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  var password: js.UndefOr[PasswordCredentialInit] = js.native
  /**
    * @see {@link https://w3c.github.io/webauthn/#dictionary-makecredentialoptions}
    */
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.native
  /**
    * @see {@link https://w3c.github.io/webappsec-credential-management/#dom-credentialrequestoptions-signal}
    */
  var signal: js.UndefOr[AbortSignal] = js.native
}

object CredentialCreationOptions {
  @scala.inline
  def apply(): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialCreationOptions]
  }
  @scala.inline
  implicit class CredentialCreationOptionsOps[Self <: CredentialCreationOptions] (val x: Self) extends AnyVal {
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
    def setFederated(value: FederatedCredentialInit): Self = this.set("federated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFederated: Self = this.set("federated", js.undefined)
    @scala.inline
    def setPassword(value: PasswordCredentialInit): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialCreationOptions): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

