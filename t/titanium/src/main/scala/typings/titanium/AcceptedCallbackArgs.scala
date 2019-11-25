package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument object passed to the [accepted](Titanium.Network.Socket.TCP.accepted)
  * callback when a listener accepts a connection.
  */
trait AcceptedCallbackArgs extends js.Object {
  /**
  	 * Socket which represents the inbound connection.
  	 */
  var inbound: js.UndefOr[TCP] = js.undefined
  /**
  	 * Socket which received the connection.
  	 */
  var socket: js.UndefOr[TCP] = js.undefined
}

object AcceptedCallbackArgs {
  @scala.inline
  def apply(inbound: TCP = null, socket: TCP = null): AcceptedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (inbound != null) __obj.updateDynamic("inbound")(inbound.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptedCallbackArgs]
  }
}

