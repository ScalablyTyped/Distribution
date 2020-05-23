package typings.winrtUwp.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that are passed to an application with the ConnectionRequested event. */
trait ConnectionRequestedEventArgs extends js.Object {
  /** Gets the information for a peer that's requesting a connection. */
  var peerInformation: PeerInformation
}

object ConnectionRequestedEventArgs {
  @scala.inline
  def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRequestedEventArgs]
  }
}

