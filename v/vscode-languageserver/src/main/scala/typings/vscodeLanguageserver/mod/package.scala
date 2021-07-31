package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def EOL: js.Array[java.lang.String] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def combineClientFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.ClientFeature[O],
  two: typings.vscodeLanguageserver.mod.ClientFeature[T]
): typings.vscodeLanguageserver.mod.ClientFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineClientFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.ClientFeature[O & T]]

@scala.inline
def combineConsoleFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.ConsoleFeature[O],
  two: typings.vscodeLanguageserver.mod.ConsoleFeature[T]
): typings.vscodeLanguageserver.mod.ConsoleFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineConsoleFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.ConsoleFeature[O & T]]

@scala.inline
def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace](
  one: typings.vscodeLanguageserver.mod.Features[
  OConsole, 
  OTracer, 
  OTelemetry, 
  OClient, 
  OWindow, 
  OWorkspace, 
  typings.vscodeLanguageserver.mod._underscore
],
  two: typings.vscodeLanguageserver.mod.Features[
  TConsole, 
  TTracer, 
  TTelemetry, 
  TClient, 
  TWindow, 
  TWorkspace, 
  typings.vscodeLanguageserver.mod._underscore
]
): typings.vscodeLanguageserver.mod.Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
typings.vscodeLanguageserver.mod._underscore] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
typings.vscodeLanguageserver.mod._underscore]]

@scala.inline
def combineLanguagesFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.LanguagesFeature[O],
  two: typings.vscodeLanguageserver.mod.LanguagesFeature[T]
): typings.vscodeLanguageserver.mod.LanguagesFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineLanguagesFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.LanguagesFeature[O & T]]

@scala.inline
def combineTelemetryFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.TelemetryFeature[O],
  two: typings.vscodeLanguageserver.mod.TelemetryFeature[T]
): typings.vscodeLanguageserver.mod.TelemetryFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineTelemetryFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.TelemetryFeature[O & T]]

@scala.inline
def combineTracerFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.TracerFeature[O],
  two: typings.vscodeLanguageserver.mod.TracerFeature[T]
): typings.vscodeLanguageserver.mod.TracerFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineTracerFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.TracerFeature[O & T]]

@scala.inline
def combineWindowFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.WindowFeature[O],
  two: typings.vscodeLanguageserver.mod.WindowFeature[T]
): typings.vscodeLanguageserver.mod.WindowFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineWindowFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.WindowFeature[O & T]]

@scala.inline
def combineWorkspaceFeatures[O, T](
  one: typings.vscodeLanguageserver.mod.WorkspaceFeature[O],
  two: typings.vscodeLanguageserver.mod.WorkspaceFeature[T]
): typings.vscodeLanguageserver.mod.WorkspaceFeature[O & T] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("combineWorkspaceFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.WorkspaceFeature[O & T]]

@scala.inline
def createClientPipeTransport(pipeName: java.lang.String): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]
@scala.inline
def createClientPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.pipeSupportMod.PipeTransport]]

@scala.inline
def createClientSocketTransport(port: scala.Double): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]
@scala.inline
def createClientSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClientSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.vscodeJsonrpc.socketSupportMod.SocketTransport]]

@scala.inline
def createConnection(): typings.vscodeLanguageserver.mod.IConnection = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")().asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection(inputStream: typings.node.NodeJS.ReadableStream, outputStream: typings.node.NodeJS.WritableStream): typings.vscodeLanguageserver.mod.IConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection(
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserver.mod.IConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): typings.vscodeLanguageserver.mod.IConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserver.mod.IConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection(strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy): typings.vscodeLanguageserver.mod.IConnection = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(strategy.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserver.mod.IConnection]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
  inputStream: typings.node.NodeJS.ReadableStream,
  outputStream: typings.node.NodeJS.WritableStream,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], inputStream.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
@scala.inline
def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](
  factories: typings.vscodeLanguageserver.mod.Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages],
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(factories.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserver.mod.Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]

@scala.inline
def createProtocolConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: typings.vscodeJsonrpc.mod.Logger
): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]
@scala.inline
def createProtocolConnection(
  reader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  writer: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: typings.vscodeJsonrpc.mod.Logger,
  strategy: typings.vscodeJsonrpc.mod.ConnectionStrategy
): typings.vscodeLanguageserverProtocol.mod.ProtocolConnection = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(reader.asInstanceOf[js.Any], writer.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverProtocol.mod.ProtocolConnection]

@scala.inline
def createServerPipeTransport(pipeName: java.lang.String): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]
@scala.inline
def createServerPipeTransport(pipeName: java.lang.String, encoding: typings.node.BufferEncoding): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerPipeTransport")(pipeName.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]

@scala.inline
def createServerSocketTransport(port: scala.Double): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]
@scala.inline
def createServerSocketTransport(port: scala.Double, encoding: typings.node.BufferEncoding): js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter] = (typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerSocketTransport")(port.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
typings.vscodeJsonrpc.messageReaderMod.MessageReader, 
typings.vscodeJsonrpc.messageWriterMod.MessageWriter]]

@scala.inline
def generateRandomPipeName(): java.lang.String = typings.vscodeLanguageserver.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomPipeName")().asInstanceOf[java.lang.String]

type ClientFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteClient, P]

type ConsoleFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteConsole, P]

type Feature[B, P] = js.Function1[
/* Base */ org.scalablytyped.runtime.Instantiable0[B], 
org.scalablytyped.runtime.Instantiable0[B & P]]

type IConnection = typings.vscodeLanguageserver.mod.Connection[
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore, 
typings.vscodeLanguageserver.mod._underscore]

type Languages = typings.vscodeLanguageserver.mod._Languages

type LanguagesFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Languages, P]

type ServerRequestHandler[P, R, PR, E] = js.Function4[
/* params */ P, 
/* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
/* workDoneProgress */ typings.vscodeLanguageserver.progressMod.WorkDoneProgress, 
/* resultProgress */ js.UndefOr[typings.vscodeLanguageserver.progressMod.ResultProgress[PR]], 
typings.vscodeJsonrpc.mod.HandlerResult[R, E]]

type TelemetryFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Telemetry, P]

type TracerFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.Tracer, P]

type WindowFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteWindow, P]

type WorkspaceFeature[P] = typings.vscodeLanguageserver.mod.Feature[typings.vscodeLanguageserver.mod.RemoteWorkspace, P]
