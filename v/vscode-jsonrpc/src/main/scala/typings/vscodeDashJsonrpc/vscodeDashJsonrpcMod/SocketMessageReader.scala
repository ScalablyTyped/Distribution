package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "SocketMessageReader")
@js.native
class SocketMessageReader protected ()
  extends typings.vscodeDashJsonrpc.libMessageReaderMod.SocketMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: String) = this()
}

