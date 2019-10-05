package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader
import typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream, strategy: ConnectionStrategy): IConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter): IConnection = js.native
  def apply(reader: MessageReader, writer: MessageWriter, strategy: ConnectionStrategy): IConnection = js.native
  def apply(strategy: ConnectionStrategy): IConnection = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: MessageReader,
    writer: MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: MessageReader,
    writer: MessageWriter,
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
}

