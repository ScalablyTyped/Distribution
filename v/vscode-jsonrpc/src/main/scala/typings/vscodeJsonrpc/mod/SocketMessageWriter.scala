package typings.vscodeJsonrpc.mod

import typings.node.BufferEncoding
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "SocketMessageWriter")
@js.native
class SocketMessageWriter protected ()
  extends typings.vscodeJsonrpc.messageWriterMod.SocketMessageWriter {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: BufferEncoding) = this()
}

