package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines properties used when passing credentials during authentication. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentials")
@js.native
abstract class AllJoynCredentials () extends js.Object {
  /** The mechanism used for credential authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism = js.native
  /** The cryptography certificate used for the Rsa and EcdheEcdsa authentication mechanisms. */
  var certificate: Certificate = js.native
  /** The user name, if any, and password used for authentication. */
  var passwordCredential: PasswordCredential = js.native
  /** The period of time before provided credentials expire. */
  var timeout: Double = js.native
}

