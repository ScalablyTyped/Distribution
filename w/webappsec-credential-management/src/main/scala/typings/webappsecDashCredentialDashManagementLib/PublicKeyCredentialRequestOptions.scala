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
  var extensions: js.UndefOr[js.Any] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}

