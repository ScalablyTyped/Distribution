package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "createMessageConnection")
@js.native
object createMessageConnection extends js.Object {
  def apply(inputStream: ReadableStream, outputStream: WritableStream): MessageConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream, logger: Logger): MessageConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter): MessageConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter, logger: Logger): MessageConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter, logger: Logger, strategy: ConnectionStrategy): MessageConnection = js.native
}

