package typings.ws.wsMod

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ws", "createWebSocketStream")
@js.native
object createWebSocketStream extends js.Object {
  // WebSocket stream
  def apply(websocket: WebSocket, options: DuplexOptions): Duplex = js.native
}

