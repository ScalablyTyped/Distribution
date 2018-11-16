package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", JSImport.Namespace)
@js.native
object vscodeDashJsonrpcModMembers extends js.Object {
  val NullLogger: Logger = js.native
  def createClientPipeTransport(pipeName: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientSocketTransport(port: scala.Double): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createClientSocketTransport(port: scala.Double, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createMessageConnection(inputStream: nodeLib.NodeJSNs.ReadableStream, outputStream: nodeLib.NodeJSNs.WritableStream): MessageConnection = js.native
  def createMessageConnection(
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    logger: Logger
  ): MessageConnection = js.native
  def createMessageConnection(
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def createMessageConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ): MessageConnection = js.native
  def createMessageConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: Logger
  ): MessageConnection = js.native
  def createMessageConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def createServerSocketTransport(port: scala.Double, encoding: java.lang.String): js.Tuple2[
    vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader, 
    vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ] = js.native
  def generateRandomPipeName(): java.lang.String = js.native
}

