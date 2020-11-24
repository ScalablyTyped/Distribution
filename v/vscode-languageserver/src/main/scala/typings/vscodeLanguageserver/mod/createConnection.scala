package typings.vscodeLanguageserver.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): IConnection = js.native
  def apply(
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy): IConnection = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
    strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = js.native
}
