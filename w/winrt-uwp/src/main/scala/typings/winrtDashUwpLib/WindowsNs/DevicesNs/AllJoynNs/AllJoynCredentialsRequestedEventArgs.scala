package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a request for credentials in order to authenticate to a peer. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynCredentialsRequestedEventArgs")
@js.native
abstract class AllJoynCredentialsRequestedEventArgs () extends js.Object {
  /** The number of times the credential request has been tried. */
  var attemptCount: scala.Double = js.native
  /** The authentication credentials to be filled in by the app. */
  var credentials: AllJoynCredentials = js.native
  /** The unique bus name of the remote app that provided the requested credentials. */
  var peerUniqueName: java.lang.String = js.native
  /** A user name value used by mechanisms that accept a user name/password pair. */
  var requestedUserName: java.lang.String = js.native
  /**
                   * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
                   * @return The credential request deferral.
                   */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

