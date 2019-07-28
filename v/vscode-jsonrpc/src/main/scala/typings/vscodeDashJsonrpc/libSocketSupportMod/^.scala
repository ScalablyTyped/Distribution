package typings.vscodeDashJsonrpc.libSocketSupportMod

import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/socketSupport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClientSocketTransport(port: Double): Thenable[SocketTransport] = js.native
  def createClientSocketTransport(port: Double, encoding: String): Thenable[SocketTransport] = js.native
  def createServerSocketTransport(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
}

