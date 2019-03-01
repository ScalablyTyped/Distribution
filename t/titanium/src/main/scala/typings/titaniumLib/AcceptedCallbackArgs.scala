package typings
package titaniumLib

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
  var inbound: js.UndefOr[titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP] = js.undefined
  /**
  	 * Socket which received the connection.
  	 */
  var socket: js.UndefOr[titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP] = js.undefined
}

object AcceptedCallbackArgs {
  @scala.inline
  def apply(
    inbound: titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP = null,
    socket: titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP = null
  ): AcceptedCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (inbound != null) __obj.updateDynamic("inbound")(inbound)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[AcceptedCallbackArgs]
  }
}

