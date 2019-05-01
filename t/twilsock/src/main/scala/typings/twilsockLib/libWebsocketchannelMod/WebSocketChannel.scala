package typings
package twilsockLib.libWebsocketchannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/websocketchannel", "WebSocketChannel")
@js.native
class WebSocketChannel protected ()
  extends twilsockLib.libInterfacesChannelMod.Channel {
  def this(url: java.lang.String) = this()
  var WebSocket: js.Any = js.native
  var socket: js.Any = js.native
  val url: js.Any = js.native
  def close(): scala.Unit = js.native
  def connect(): scala.Unit = js.native
}

