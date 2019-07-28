package typings.twilsock.libWebsocketchannelMod

import typings.twilsock.libInterfacesChannelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/websocketchannel", "WebSocketChannel")
@js.native
class WebSocketChannel protected () extends Channel {
  def this(url: String) = this()
  var WebSocket: js.Any = js.native
  var socket: js.Any = js.native
  val url: js.Any = js.native
  def close(): Unit = js.native
  def connect(): Unit = js.native
}

