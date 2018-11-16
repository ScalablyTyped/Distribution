package typings
package titaniumLib

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
  var socket: js.UndefOr[titaniumLib.TitaniumNs.NetworkNs.SocketNs.TCP] = js.undefined
}

