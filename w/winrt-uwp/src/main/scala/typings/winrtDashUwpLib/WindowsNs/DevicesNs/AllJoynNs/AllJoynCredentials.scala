package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

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
  var certificate: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate = js.native
  /** The user name, if any, and password used for authentication. */
  var passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** The period of time before provided credentials expire. */
  var timeout: scala.Double = js.native
}

