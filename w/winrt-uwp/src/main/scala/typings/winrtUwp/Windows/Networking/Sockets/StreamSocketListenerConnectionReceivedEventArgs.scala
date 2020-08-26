package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
@js.native
trait StreamSocketListenerConnectionReceivedEventArgs extends js.Object {
  /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var socket: StreamSocket = js.native
}

object StreamSocketListenerConnectionReceivedEventArgs {
  @scala.inline
  def apply(socket: StreamSocket): StreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerConnectionReceivedEventArgs]
  }
  @scala.inline
  implicit class StreamSocketListenerConnectionReceivedEventArgsOps[Self <: StreamSocketListenerConnectionReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setSocket(value: StreamSocket): Self = this.set("socket", value.asInstanceOf[js.Any])
  }
  
}

