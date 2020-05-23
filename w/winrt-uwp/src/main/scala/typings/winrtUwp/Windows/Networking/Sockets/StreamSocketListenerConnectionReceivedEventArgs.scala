package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
trait StreamSocketListenerConnectionReceivedEventArgs extends js.Object {
  /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var socket: StreamSocket
}

object StreamSocketListenerConnectionReceivedEventArgs {
  @scala.inline
  def apply(socket: StreamSocket): StreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerConnectionReceivedEventArgs]
  }
}

