package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket Server
@JSImport("ws", "Server")
@js.native
class Server ()
  extends wsLib.wsMod.WebSocketNs.Server {
  def this(options: wsLib.wsMod.WebSocketNs.ServerOptions) = this()
  def this(options: wsLib.wsMod.WebSocketNs.ServerOptions, callback: js.Function0[scala.Unit]) = this()
}

