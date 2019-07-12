package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
  */
trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[
    webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.platform | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`cross-platform`
  ] = js.undefined
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined
  var userVerification: js.UndefOr[
    webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.required | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.preferred | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.discouraged
  ] = js.undefined
}

object AuthenticatorSelectionCriteria {
  @scala.inline
  def apply(
    authenticatorAttachment: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.platform | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.`cross-platform` = null,
    requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined,
    userVerification: webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.required | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.preferred | webappsecDashCredentialDashManagementLib.webappsecDashCredentialDashManagementLibStrings.discouraged = null
  ): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (authenticatorAttachment != null) __obj.updateDynamic("authenticatorAttachment")(authenticatorAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(requireResidentKey)) __obj.updateDynamic("requireResidentKey")(requireResidentKey)
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
}

