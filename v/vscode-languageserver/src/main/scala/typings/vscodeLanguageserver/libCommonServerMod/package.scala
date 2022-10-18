package typings.vscodeLanguageserver.libCommonServerMod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typings.vscodeJsonrpc.libCommonConnectionMod.HandlerResult
import typings.vscodeJsonrpc.libCommonConnectionMod.Logger
import typings.vscodeLanguageserver.libCommonProgressMod.ResultProgressReporter
import typings.vscodeLanguageserver.libCommonProgressMod.WorkDoneProgressReporter
import typings.vscodeLanguageserver.libCommonServerMod.^
import typings.vscodeLanguageserverProtocol.libCommonConnectionMod.ProtocolConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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

type ClientFeature[P] = Feature[RemoteClient, P]

type Connection = _Connection[
_underscore, 
_underscore, 
_underscore, 
_underscore, 
_underscore, 
_underscore, 
_underscore, 
_underscore]

type ConsoleFeature[P] = Feature[RemoteConsole, P]

type Feature[B /* <: FeatureBase */, P] = js.Function1[/* Base */ Instantiable0[B], Instantiable0[B & P]]

type LanguagesFeature[P] = Feature[_Languages, P]

type NotebooksFeature[P] = Feature[_Notebooks, P]

type ServerRequestHandler[P, R, PR, E] = js.Function4[
/* params */ P, 
/* token */ CancellationToken, 
/* workDoneProgress */ WorkDoneProgressReporter, 
/* resultProgress */ js.UndefOr[ResultProgressReporter[PR]], 
HandlerResult[R, E]]

type TelemetryFeature[P] = Feature[Telemetry, P]

type TracerFeature[P] = Feature[RemoteTracer, P]

type WindowFeature[P] = Feature[_RemoteWindow, P]

type WorkspaceFeature[P] = Feature[_RemoteWorkspace, P]
