package typings.winrtDashUwp.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that are passed to an application with the ConnectionRequested event. */
@JSGlobal("Windows.Networking.Proximity.ConnectionRequestedEventArgs")
@js.native
abstract class ConnectionRequestedEventArgs () extends js.Object {
  /** Gets the information for a peer that's requesting a connection. */
  var peerInformation: PeerInformation = js.native
}

