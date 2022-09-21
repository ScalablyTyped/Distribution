package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.connectionMod.Logger
import typings.vscodeJsonrpc.connectionMod.MessageConnection
import typings.vscodeLanguageserver.mod.^
import typings.vscodeLanguageserver.serverMod.ClientFeature
import typings.vscodeLanguageserver.serverMod.ConsoleFeature
import typings.vscodeLanguageserver.serverMod.Features
import typings.vscodeLanguageserver.serverMod.LanguagesFeature
import typings.vscodeLanguageserver.serverMod.NotebooksFeature
import typings.vscodeLanguageserver.serverMod.TelemetryFeature
import typings.vscodeLanguageserver.serverMod.TracerFeature
import typings.vscodeLanguageserver.serverMod.WatchDog
import typings.vscodeLanguageserver.serverMod.WindowFeature
import typings.vscodeLanguageserver.serverMod.WorkspaceFeature
import typings.vscodeLanguageserver.serverMod._Connection
import typings.vscodeLanguageserverProtocol.connectionMod.ProtocolConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EOL: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[String]]

inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

inline def combineClientFeatures[O, T](one: ClientFeature[O], two: ClientFeature[T]): ClientFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineClientFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[ClientFeature[O & T]]

inline def combineConsoleFeatures[O, T](one: ConsoleFeature[O], two: ConsoleFeature[T]): ConsoleFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineConsoleFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[ConsoleFeature[O & T]]

inline def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, OLanguages, ONotebooks, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace, TLanguages, TNotebooks](
  one: Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, OLanguages, ONotebooks],
  two: Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace, TLanguages, TNotebooks]
): Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
OLanguages & TLanguages, 
ONotebooks & TNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
OLanguages & TLanguages, 
ONotebooks & TNotebooks]]

inline def combineLanguagesFeatures[O, T](one: LanguagesFeature[O], two: LanguagesFeature[T]): LanguagesFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLanguagesFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[LanguagesFeature[O & T]]

inline def combineNotebooksFeatures[O, T](one: NotebooksFeature[O], two: NotebooksFeature[T]): NotebooksFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineNotebooksFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[NotebooksFeature[O & T]]

inline def combineTelemetryFeatures[O, T](one: TelemetryFeature[O], two: TelemetryFeature[T]): TelemetryFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTelemetryFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[TelemetryFeature[O & T]]

inline def combineTracerFeatures[O, T](one: TracerFeature[O], two: TracerFeature[T]): TracerFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTracerFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[TracerFeature[O & T]]

inline def combineWindowFeatures[O, T](one: WindowFeature[O], two: WindowFeature[T]): WindowFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWindowFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[WindowFeature[O & T]]

inline def combineWorkspaceFeatures[O, T](one: WorkspaceFeature[O], two: WorkspaceFeature[T]): WorkspaceFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWorkspaceFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[WorkspaceFeature[O & T]]

inline def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](connectionFactory: js.Function1[/* logger */ Logger, ProtocolConnection], watchDog: WatchDog): _Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionFactory.asInstanceOf[js.Any], watchDog.asInstanceOf[js.Any])).asInstanceOf[_Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]]
inline def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](
  connectionFactory: js.Function1[/* logger */ Logger, ProtocolConnection],
  watchDog: WatchDog,
  factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]
): _Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionFactory.asInstanceOf[js.Any], watchDog.asInstanceOf[js.Any], factories.asInstanceOf[js.Any])).asInstanceOf[_Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]]

inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Logger
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  _logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.messageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.messageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.connectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
