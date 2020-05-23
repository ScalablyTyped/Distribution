package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a closed event on a MessageWebSocket , StreamWebSocket , or IWebSocket object. */
trait WebSocketClosedEventArgs extends js.Object {
  /** Gets information about the reason that a WebSocket object was closed. */
  var code: Double
  /** Gets additional details about the reason that a WebSocket object was closed. */
  var reason: String
}

object WebSocketClosedEventArgs {
  @scala.inline
  def apply(code: Double, reason: String): WebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketClosedEventArgs]
  }
}

