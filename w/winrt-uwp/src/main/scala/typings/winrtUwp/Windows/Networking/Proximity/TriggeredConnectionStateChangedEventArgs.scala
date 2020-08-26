package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
@js.native
trait TriggeredConnectionStateChangedEventArgs extends js.Object {
  /** Gets the unique identifier for the connection in progress. */
  var id: Double = js.native
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket = js.native
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState = js.native
}

object TriggeredConnectionStateChangedEventArgs {
  @scala.inline
  def apply(id: Double, socket: StreamSocket, state: TriggeredConnectState): TriggeredConnectionStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredConnectionStateChangedEventArgs]
  }
  @scala.inline
  implicit class TriggeredConnectionStateChangedEventArgsOps[Self <: TriggeredConnectionStateChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: StreamSocket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TriggeredConnectState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

