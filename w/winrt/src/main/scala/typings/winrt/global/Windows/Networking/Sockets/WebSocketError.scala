package typings.winrt.global.Windows.Networking.Sockets

import typings.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
class WebSocketError ()
  extends typings.winrt.Windows.Networking.Sockets.WebSocketError

/* static members */
@JSGlobal("Windows.Networking.Sockets.WebSocketError")
@js.native
object WebSocketError extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus = js.native
}

