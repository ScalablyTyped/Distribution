package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.libCommonConnectionMod.Logger
import typings.vscodeJsonrpc.libCommonConnectionMod.MessageConnection
import typings.vscodeLanguageserver.libCommonServerMod.ClientFeature
import typings.vscodeLanguageserver.libCommonServerMod.ConsoleFeature
import typings.vscodeLanguageserver.libCommonServerMod.Features
import typings.vscodeLanguageserver.libCommonServerMod.LanguagesFeature
import typings.vscodeLanguageserver.libCommonServerMod.NotebooksFeature
import typings.vscodeLanguageserver.libCommonServerMod.TelemetryFeature
import typings.vscodeLanguageserver.libCommonServerMod.TracerFeature
import typings.vscodeLanguageserver.libCommonServerMod.WatchDog
import typings.vscodeLanguageserver.libCommonServerMod.WindowFeature
import typings.vscodeLanguageserver.libCommonServerMod.WorkspaceFeature
import typings.vscodeLanguageserver.libCommonServerMod._Connection
import typings.vscodeLanguageserver.mod.^
import typings.vscodeLanguageserverProtocol.libCommonConnectionMod.ProtocolConnection
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
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typings.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typings.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typings.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
