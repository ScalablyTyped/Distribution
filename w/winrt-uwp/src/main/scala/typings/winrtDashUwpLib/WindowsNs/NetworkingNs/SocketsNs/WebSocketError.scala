package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket error status on a MessageWebSocket or StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
abstract class WebSocketError () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
object WebSocketError extends js.Object {
  /**
    * Gets a WebErrorStatus value based on an error encountered by a WebSocket operation.
    * @param hresult The error encountered by a WebSocket operation represented as an HRESULT.
    * @return The socket error status value for a WebSocket operation.
    */
  def getStatus(hresult: scala.Double): winrtDashUwpLib.WindowsNs.WebNs.WebErrorStatus = js.native
}

