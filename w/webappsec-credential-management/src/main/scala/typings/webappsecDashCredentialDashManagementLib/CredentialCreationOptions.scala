package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-credentialcreationoptions}
  */
trait CredentialCreationOptions extends js.Object {
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dom-credentialcreationoptions-federated}
    */
  var federated: js.UndefOr[FederatedCredentialInit] = js.undefined
  /**
    * @see {@link https://www.w3.org/TR/2017/WD-credential-management-1-20170804/#dictdef-federatedcredentialinit}
    */
  var password: js.UndefOr[PasswordCredentialInit] = js.undefined
  /**
    * @see {@link https://w3c.github.io/webauthn/#dictionary-makecredentialoptions}
    */
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  /**
    * @see {@link https://w3c.github.io/webappsec-credential-management/#dom-credentialrequestoptions-signal}
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object CredentialCreationOptions {
  @scala.inline
  def apply(
    federated: FederatedCredentialInit = null,
    password: PasswordCredentialInit = null,
    publicKey: PublicKeyCredentialCreationOptions = null,
    signal: stdLib.AbortSignal = null
  ): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (federated != null) __obj.updateDynamic("federated")(federated)
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[CredentialCreationOptions]
  }
}

