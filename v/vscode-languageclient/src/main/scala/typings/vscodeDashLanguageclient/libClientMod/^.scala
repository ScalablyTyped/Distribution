package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import typings.vscodeDashJsonrpc.libPipeSupportMod.PipeTransport
import typings.vscodeDashJsonrpc.libSocketSupportMod.SocketTransport
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Logger
import typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: js.Array[String] = js.native
  def createClientPipeTransport(pipeName: String): Thenable[PipeTransport] = js.native
  def createClientPipeTransport(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
  def createClientSocketTransport(port: Double): Thenable[SocketTransport] = js.native
  def createClientSocketTransport(port: Double, encoding: String): Thenable[SocketTransport] = js.native
  def createProtocolConnection(reader: MessageReader, writer: MessageWriter, logger: Logger): ProtocolConnection = js.native
  def createProtocolConnection(reader: MessageReader, writer: MessageWriter, logger: Logger, strategy: ConnectionStrategy): ProtocolConnection = js.native
  def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerPipeTransport(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def generateRandomPipeName(): String = js.native
}

