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

object AuthenticatorSelectionCriteria {
  @scala.inline
  def apply(
    authenticatorAttachment: AuthenticatorAttachment = null,
    requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined,
    requireUserVerification: UserVerificationRequirement = null
  ): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (authenticatorAttachment != null) __obj.updateDynamic("authenticatorAttachment")(authenticatorAttachment)
    if (!js.isUndefined(requireResidentKey)) __obj.updateDynamic("requireResidentKey")(requireResidentKey)
    if (requireUserVerification != null) __obj.updateDynamic("requireUserVerification")(requireUserVerification)
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
}

