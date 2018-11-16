package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.WebSocketClosedEventArgs")
@js.native
abstract class WebSocketClosedEventArgs () extends js.Object {
  /** Gets information about the reason that a WebSocket object was closed. */
  var code: scala.Double = js.native
  /** Gets additional details about the reason that a WebSocket object was closed. */
  var reason: java.lang.String = js.native
}

