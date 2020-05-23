package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
trait TriggeredConnectionStateChangedEventArgs extends js.Object {
  /** Gets the unique identifier for the connection in progress. */
  var id: Double
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState
}

object TriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
}

