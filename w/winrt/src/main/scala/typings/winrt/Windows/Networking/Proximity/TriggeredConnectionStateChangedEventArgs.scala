package typings.winrt.Windows.Networking.Proximity

import typings.winrt.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggeredConnectionStateChangedEventArgs extends ITriggeredConnectionStateChangedEventArgs

object TriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
}

