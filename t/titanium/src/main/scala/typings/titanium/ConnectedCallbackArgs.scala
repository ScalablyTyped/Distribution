package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument object passed to the [connected](Titanium.Network.Socket.TCP.connected) callback when the socket connects.
  */
trait ConnectedCallbackArgs extends js.Object {
  /**
  	 * Socket instance that has been connected.
  	 */
  var socket: js.UndefOr[TCP] = js.undefined
}

object ConnectedCallbackArgs {
  @scala.inline
  def apply(socket: TCP = null): ConnectedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedCallbackArgs]
  }
}

