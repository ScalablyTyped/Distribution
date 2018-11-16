package typings
package vscodeDashJsonrpcLib.libMessageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "SocketMessageReader")
@js.native
class SocketMessageReader protected () extends StreamMessageReader {
  def this(socket: nodeLib.netMod.Socket) = this()
  def this(socket: nodeLib.netMod.Socket, encoding: java.lang.String) = this()
}

