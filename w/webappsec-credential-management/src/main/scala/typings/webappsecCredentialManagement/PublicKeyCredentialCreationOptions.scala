package typings.webappsecCredentialManagement

import typings.std.BufferSource
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.direct
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.indirect
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-makepublickeycredentialoptions}
  */
@js.native
trait PublicKeyCredentialCreationOptions extends js.Object {
  var attestation: js.UndefOr[none | indirect | direct] = js.native
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.native
  var challenge: BufferSource = js.native
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters] = js.native
  var rp: PublicKeyCredentialRpEntity = js.native
  var timeout: js.UndefOr[Double] = js.native
  var user: PublicKeyCredentialUserEntity = js.native
}

object PublicKeyCredentialCreationOptions {
  @scala.inline
  def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
  @scala.inline
  implicit class PublicKeyCredentialCreationOptionsOps[Self <: PublicKeyCredentialCreationOptions] (val x: Self) extends AnyVal {
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
    def setChallenge(value: BufferSource): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPubKeyCredParamsVarargs(value: PublicKeyCredentialParameters*): Self = this.set("pubKeyCredParams", js.Array(value :_*))
    @scala.inline
    def setPubKeyCredParams(value: js.Array[PublicKeyCredentialParameters]): Self = this.set("pubKeyCredParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setRp(value: PublicKeyCredentialRpEntity): Self = this.set("rp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: PublicKeyCredentialUserEntity): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttestation(value: none | indirect | direct): Self = this.set("attestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    @scala.inline
    def setAuthenticatorSelection(value: AuthenticatorSelectionCriteria): Self = this.set("authenticatorSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticatorSelection: Self = this.set("authenticatorSelection", js.undefined)
    @scala.inline
    def setExcludeCredentialsVarargs(value: PublicKeyCredentialDescriptor*): Self = this.set("excludeCredentials", js.Array(value :_*))
    @scala.inline
    def setExcludeCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = this.set("excludeCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeCredentials: Self = this.set("excludeCredentials", js.undefined)
    @scala.inline
    def setExtensions(value: AuthenticationExtensionsClientInputs): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

