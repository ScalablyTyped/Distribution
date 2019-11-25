package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): IConnection = js.native
  def apply(
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ): IConnection = js.native
  def apply(
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): IConnection = js.native
  def apply(strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy): IConnection = js.native
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
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typings.vscodeDashJsonrpc.libMessageReaderMod.MessageReader,
    writer: typings.vscodeDashJsonrpc.libMessageWriterMod.MessageWriter,
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
}

