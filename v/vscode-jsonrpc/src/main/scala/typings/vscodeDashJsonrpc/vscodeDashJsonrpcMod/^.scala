package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import typings.vscodeDashJsonrpc.libPipeSupportMod.PipeTransport
import typings.vscodeDashJsonrpc.libSocketSupportMod.SocketTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val NullLogger: Logger = js.native
  def createClientPipeTransport(pipeName: String): Thenable[PipeTransport] = js.native
  def createClientPipeTransport(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
  def createClientSocketTransport(port: Double): Thenable[SocketTransport] = js.native
  def createClientSocketTransport(port: Double, encoding: String): Thenable[SocketTransport] = js.native
  def createMessageConnection(inputStream: ReadableStream, outputStream: WritableStream): MessageConnection = js.native
  def createMessageConnection(inputStream: ReadableStream, outputStream: WritableStream, logger: Logger): MessageConnection = js.native
  def createMessageConnection(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def createMessageConnection(reader: MessageReader, writer: MessageWriter): MessageConnection = js.native
  def createMessageConnection(reader: MessageReader, writer: MessageWriter, logger: Logger): MessageConnection = js.native
  def createMessageConnection(reader: MessageReader, writer: MessageWriter, logger: Logger, strategy: ConnectionStrategy): MessageConnection = js.native
  def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerPipeTransport(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def generateRandomPipeName(): String = js.native
}

