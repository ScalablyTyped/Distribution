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

