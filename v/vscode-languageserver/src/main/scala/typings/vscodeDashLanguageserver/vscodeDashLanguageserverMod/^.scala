package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
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

@JSImport("vscode-languageserver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: js.Array[String] = js.native
  def combineClientFeatures[O, T](one: ClientFeature[O], two: ClientFeature[T]): ClientFeature[O with T] = js.native
  def combineConsoleFeatures[O, T](one: ConsoleFeature[O], two: ConsoleFeature[T]): ConsoleFeature[O with T] = js.native
  def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
    one: Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace],
    two: Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace]
  ): Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace
  ] = js.native
  def combineTelemetryFeatures[O, T](one: TelemetryFeature[O], two: TelemetryFeature[T]): TelemetryFeature[O with T] = js.native
  def combineTracerFeatures[O, T](one: TracerFeature[O], two: TracerFeature[T]): TracerFeature[O with T] = js.native
  def combineWindowFeatures[O, T](one: WindowFeature[O], two: WindowFeature[T]): WindowFeature[O with T] = js.native
  def combineWorkspaceFeatures[O, T](one: WorkspaceFeature[O], two: WorkspaceFeature[T]): WorkspaceFeature[O with T] = js.native
  def createClientPipeTransport(pipeName: String): typings.vscodeDashJsonrpc.Thenable[PipeTransport] = js.native
  def createClientPipeTransport(pipeName: String, encoding: String): typings.vscodeDashJsonrpc.Thenable[PipeTransport] = js.native
  def createClientSocketTransport(port: Double): typings.vscodeDashJsonrpc.Thenable[SocketTransport] = js.native
  def createClientSocketTransport(port: Double, encoding: String): typings.vscodeDashJsonrpc.Thenable[SocketTransport] = js.native
  def createConnection(): IConnection = js.native
  def createConnection(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def createConnection(inputStream: ReadableStream, outputStream: WritableStream, strategy: ConnectionStrategy): IConnection = js.native
  def createConnection(reader: MessageReader, writer: MessageWriter): IConnection = js.native
  def createConnection(reader: MessageReader, writer: MessageWriter, strategy: ConnectionStrategy): IConnection = js.native
  def createConnection(strategy: ConnectionStrategy): IConnection = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: MessageReader,
    writer: MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: MessageReader,
    writer: MessageWriter,
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createProtocolConnection(reader: MessageReader, writer: MessageWriter, logger: Logger): ProtocolConnection = js.native
  def createProtocolConnection(reader: MessageReader, writer: MessageWriter, logger: Logger, strategy: ConnectionStrategy): ProtocolConnection = js.native
  def createServerPipeTransport(pipeName: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerPipeTransport(pipeName: String, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def createServerSocketTransport(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
  def generateRandomPipeName(): String = js.native
}

