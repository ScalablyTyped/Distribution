package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines properties used when passing credentials during authentication. */
trait AllJoynCredentials extends js.Object {
  /** The mechanism used for credential authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism
  /** The cryptography certificate used for the Rsa and EcdheEcdsa authentication mechanisms. */
  var certificate: Certificate
  /** The user name, if any, and password used for authentication. */
  var passwordCredential: PasswordCredential
  /** The period of time before provided credentials expire. */
  var timeout: Double
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
}

