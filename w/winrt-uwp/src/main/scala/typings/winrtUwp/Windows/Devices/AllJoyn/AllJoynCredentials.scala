package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines properties used when passing credentials during authentication. */
@js.native
trait AllJoynCredentials extends js.Object {
  /** The mechanism used for credential authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  /** The cryptography certificate used for the Rsa and EcdheEcdsa authentication mechanisms. */
  var certificate: Certificate = js.native
  /** The user name, if any, and password used for authentication. */
  var passwordCredential: PasswordCredential = js.native
  /** The period of time before provided credentials expire. */
  var timeout: Double = js.native
}

object AllJoynCredentials {
  @scala.inline
  def apply(
    authenticationMechanism: AllJoynAuthenticationMechanism,
    certificate: Certificate,
    passwordCredential: PasswordCredential,
    timeout: Double
  ): AllJoynCredentials = {
    val __obj = js.Dynamic.literal(authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], passwordCredential = passwordCredential.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentials]
  }
  @scala.inline
  implicit class AllJoynCredentialsOps[Self <: AllJoynCredentials] (val x: Self) extends AnyVal {
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
    def setAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = this.set("authenticationMechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificate(value: Certificate): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordCredential(value: PasswordCredential): Self = this.set("passwordCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

