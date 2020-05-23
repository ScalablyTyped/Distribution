package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a successful or unsuccessful completion of an authentication operation. */
trait AllJoynAuthenticationCompleteEventArgs extends js.Object {
  /** The mechanism used during authentication. */
  var authenticationMechanism: AllJoynAuthenticationMechanism
  /** The unique bus name of the Consumer being authenticated. On the initiating side this will be the unique bus name of the remote app being authenticated. On the accepting side this will be the unique bus name for the remote app. */
  var peerUniqueName: String
  /** Indicates if the remote app was authenticated. */
  var succeeded: Boolean
}

object AllJoynAuthenticationCompleteEventArgs {
  @scala.inline
  def apply(
    authenticationMechanism: AllJoynAuthenticationMechanism,
    peerUniqueName: String,
    succeeded: Boolean
  ): AllJoynAuthenticationCompleteEventArgs = {
    val __obj = js.Dynamic.literal(authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], peerUniqueName = peerUniqueName.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAuthenticationCompleteEventArgs]
  }
}

