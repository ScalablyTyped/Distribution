package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-makepublickeycredentialoptions}
  */
trait PublicKeyCredentialCreationOptions extends js.Object {
  var attestation: js.UndefOr[
    webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.none | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.indirect | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.direct
  ] = js.undefined
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.undefined
  var challenge: stdLib.BufferSource
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters]
  var rp: PublicKeyCredentialRpEntity
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var user: PublicKeyCredentialUserEntity
}

object PublicKeyCredentialCreationOptions {
  @scala.inline
  def apply(
    challenge: stdLib.BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity,
    attestation: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.none | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.indirect | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.direct = null,
    authenticatorSelection: AuthenticatorSelectionCriteria = null,
    excludeCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    timeout: scala.Int | scala.Double = null
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge, pubKeyCredParams = pubKeyCredParams, rp = rp, user = user)
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (authenticatorSelection != null) __obj.updateDynamic("authenticatorSelection")(authenticatorSelection)
    if (excludeCredentials != null) __obj.updateDynamic("excludeCredentials")(excludeCredentials)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
}

