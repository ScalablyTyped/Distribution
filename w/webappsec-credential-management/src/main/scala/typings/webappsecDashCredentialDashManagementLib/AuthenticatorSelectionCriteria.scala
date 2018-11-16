package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
 */

trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.undefined
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined
  var requireUserVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}

