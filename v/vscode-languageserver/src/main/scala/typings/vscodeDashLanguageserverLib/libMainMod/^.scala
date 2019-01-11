package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/main", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: js.Array[java.lang.String] = js.native
  def combineClientFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.ClientFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.ClientFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.ClientFeature[O with T] = js.native
  def combineConsoleFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.ConsoleFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.ConsoleFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.ConsoleFeature[O with T] = js.native
  def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
    one: vscodeDashLanguageserverLib.libMainMod.Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace],
    two: vscodeDashLanguageserverLib.libMainMod.Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace]
  ): vscodeDashLanguageserverLib.libMainMod.Features[
    OConsole with TConsole, 
    OTracer with TTracer, 
    OTelemetry with TTelemetry, 
    OClient with TClient, 
    OWindow with TWindow, 
    OWorkspace with TWorkspace
  ] = js.native
  def combineTelemetryFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.TelemetryFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.TelemetryFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.TelemetryFeature[O with T] = js.native
  def combineTracerFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.TracerFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.TracerFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.TracerFeature[O with T] = js.native
  def combineWindowFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.WindowFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.WindowFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.WindowFeature[O with T] = js.native
  def combineWorkspaceFeatures[O, T](
    one: vscodeDashLanguageserverLib.libMainMod.WorkspaceFeature[O],
    two: vscodeDashLanguageserverLib.libMainMod.WorkspaceFeature[T]
  ): vscodeDashLanguageserverLib.libMainMod.WorkspaceFeature[O with T] = js.native
  def createClientPipeTransport(pipeName: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientPipeTransport(pipeName: java.lang.String, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libPipeSupportMod.PipeTransport] = js.native
  def createClientSocketTransport(port: scala.Double): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createClientSocketTransport(port: scala.Double, encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[vscodeDashJsonrpcLib.libSocketSupportMod.SocketTransport] = js.native
  def createConnection(): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection(inputStream: nodeLib.NodeJSNs.ReadableStream, outputStream: nodeLib.NodeJSNs.WritableStream): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection(
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection(strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy): vscodeDashLanguageserverLib.libMainMod.IConnection = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: nodeLib.NodeJSNs.ReadableStream,
    outputStream: nodeLib.NodeJSNs.WritableStream,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: vscodeDashLanguageserverLib.libMainMod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverLib.libMainMod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger
  ): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection = js.native
  def createProtocolConnection(
    reader: vscodeDashJsonrpcLib.libMessageReaderMod.MessageReader,
    writer: vscodeDashJsonrpcLib.libMessageWriterMod.MessageWriter,
    logger: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Logger,
    strategy: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.ConnectionStrategy
  ): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.ProtocolConnection = js.native
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

