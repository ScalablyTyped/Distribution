package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * @see {@link https://w3c.github.io/webauthn/#dictdef-makepublickeycredentialoptions}
 */

trait PublicKeyCredentialCreationOptions extends js.Object {
  var attestation: js.UndefOr[AttestationConveyancePreference] = js.undefined
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.undefined
  var challenge: stdLib.BufferSource
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters]
  var rp: PublicKeyCredentialRpEntity
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var user: PublicKeyCredentialUserEntity
}

