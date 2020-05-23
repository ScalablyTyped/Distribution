package typings.winrtUwp.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a request for credentials in order to authenticate to a peer. */
trait AllJoynCredentialsRequestedEventArgs extends js.Object {
  /** The number of times the credential request has been tried. */
  var attemptCount: Double
  /** The authentication credentials to be filled in by the app. */
  var credentials: AllJoynCredentials
  /** The unique bus name of the remote app that provided the requested credentials. */
  var peerUniqueName: String
  /** A user name value used by mechanisms that accept a user name/password pair. */
  var requestedUserName: String
  /**
    * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
    * @return The credential request deferral.
    */
  def getDeferral(): Deferral
}

object AllJoynCredentialsRequestedEventArgs {
  @scala.inline
  def apply(
    attemptCount: Double,
    credentials: AllJoynCredentials,
    getDeferral: () => Deferral,
    peerUniqueName: String,
    requestedUserName: String
  ): AllJoynCredentialsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(attemptCount = attemptCount.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), peerUniqueName = peerUniqueName.asInstanceOf[js.Any], requestedUserName = requestedUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsRequestedEventArgs]
  }
}

