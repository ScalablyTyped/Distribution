package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrequestoptions}
  */
trait PublicKeyCredentialRequestOptions extends js.Object {
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var challenge: stdLib.BufferSource
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var userVerification: js.UndefOr[
    webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.required | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.preferred | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.discouraged
  ] = js.undefined
}

object PublicKeyCredentialRequestOptions {
  @scala.inline
  def apply(
    challenge: stdLib.BufferSource,
    allowCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    rpId: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    userVerification: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.required | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.preferred | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.discouraged = null
  ): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge)
    if (allowCredentials != null) __obj.updateDynamic("allowCredentials")(allowCredentials)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (rpId != null) __obj.updateDynamic("rpId")(rpId)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
}

