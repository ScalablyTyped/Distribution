package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscode.mod.DiagnosticCollection
import typings.vscode.mod.OutputChannel
import typings.vscodeJsonrpc.libCommonConnectionMod.Trace
import typings.vscodeJsonrpc.libCommonEventsMod.Event
import typings.vscodeLanguageclient.libCommonCodeConverterMod.Converter
import typings.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typings.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeResult
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient/lib/common/client", "BaseLanguageClient")
@js.native
open class BaseLanguageClient protected ()
  extends StObject
     with FeatureClient[Middleware, LanguageClientOptions] {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
  
  /* private */ @JSName("$start")
  var $start: Any = js.native
  
  /* private */ @JSName("$state")
  def $state: Any = js.native
  /* private */ @JSName("$state")
  def $state_=(value: Any): Unit = js.native
  
  /* private */ val _c2p: Any = js.native
  
  /* private */ var _capabilities: Any = js.native
  
  /* private */ var _clientGetRootPath: Any = js.native
  
  /* private */ var _clientOptions: Any = js.native
  
  /* private */ var _connection: Any = js.native
  
  /* private */ var _diagnosticQueue: Any = js.native
  
  /* private */ var _diagnosticQueueState: Any = js.native
  
  /* private */ var _diagnostics: Any = js.native
  
  /* private */ var _didChangeTextDocumentFeature: Any = js.native
  
  /* private */ var _disposeOutputChannel: Any = js.native
  
  /* private */ var _disposed: Any = js.native
  
  /* private */ val _dynamicFeatures: Any = js.native
  
  /* private */ val _features: Any = js.native
  
  /* private */ var _fileEventDelayer: Any = js.native
  
  /* private */ var _fileEvents: Any = js.native
  
  /* private */ var _id: Any = js.native
  
  /* private */ var _idleInterval: Any = js.native
  
  /* private */ val _ignoredRegistrations: Any = js.native
  
  /* private */ var _initializeResult: Any = js.native
  
  /* private */ val _listeners: Any = js.native
  
  /* private */ var _name: Any = js.native
  
  /* private */ val _notificationDisposables: Any = js.native
  
  /* private */ val _notificationHandlers: Any = js.native
  
  /* private */ var _onStart: Any = js.native
  
  /* private */ var _onStop: Any = js.native
  
  /* private */ var _outputChannel: Any = js.native
  
  /* private */ val _p2c: Any = js.native
  
  /* private */ val _pendingChangeDelayer: Any = js.native
  
  /* private */ val _pendingChangeSemaphore: Any = js.native
  
  /* private */ val _pendingNotificationHandlers: Any = js.native
  
  /* private */ val _pendingOpenNotifications: Any = js.native
  
  /* private */ val _pendingProgressHandlers: Any = js.native
  
  /* private */ val _pendingRequestHandlers: Any = js.native
  
  /* private */ val _progressDisposables: Any = js.native
  
  /* private */ val _progressHandlers: Any = js.native
  
  /* private */ val _requestDisposables: Any = js.native
  
  /* private */ val _requestHandlers: Any = js.native
  
  /* private */ var _state: Any = js.native
  
  /* private */ var _stateChangeEmitter: Any = js.native
  
  /* private */ var _syncedDocuments: Any = js.native
  
  /* private */ var _telemetryEmitter: Any = js.native
  
  /* private */ var _trace: Any = js.native
  
  /* private */ var _traceFormat: Any = js.native
  
  /* private */ var _traceOutputChannel: Any = js.native
  
  /* private */ var _tracer: Any = js.native
  
  /* private */ var activeConnection: Any = js.native
  
  /* private */ var cleanUp: Any = js.native
  
  /* private */ var cleanUpChannel: Any = js.native
  
  @JSName("clientOptions")
  def clientOptions_MBaseLanguageClient: LanguageClientOptions = js.native
  
  @JSName("code2ProtocolConverter")
  def code2ProtocolConverter_MBaseLanguageClient: Converter = js.native
  
  /* private */ var computeClientCapabilities: Any = js.native
  
  /* private */ var createConnection: Any = js.native
  
  def createDefaultErrorHandler(): ErrorHandler = js.native
  def createDefaultErrorHandler(maxRestartCount: Double): ErrorHandler = js.native
  
  /* protected */ def createMessageTransports(encoding: String): js.Promise[MessageTransports] = js.native
  
  /* private */ var createOnStartPromise: Any = js.native
  
  /* private */ var data2String: Any = js.native
  
  def diagnostics: js.UndefOr[DiagnosticCollection] = js.native
  
  def dispose(): js.Promise[Unit] = js.native
  def dispose(timeout: Double): js.Promise[Unit] = js.native
  
  /* private */ var doInitialize: Any = js.native
  
  /* protected */ def fillInitializeParams(params: InitializeParams): Unit = js.native
  
  /* protected */ def getLocale(): String = js.native
  
  /* private */ var getPublicState: Any = js.native
  
  /* private */ var handleApplyWorkspaceEdit: Any = js.native
  
  /* protected */ def handleConnectionClosed(): js.Promise[Unit] = js.native
  
  /* private */ var handleConnectionError: Any = js.native
  
  /* private */ var handleDiagnostics: Any = js.native
  
  /* private */ var handleRegistrationRequest: Any = js.native
  
  /* private */ var handleUnregistrationRequest: Any = js.native
  
  /* private */ var hookConfigurationChanged: Any = js.native
  
  /* private */ var hookFileEvents: Any = js.native
  
  /* private */ var initialize: Any = js.native
  
  /* private */ var initializeFeatures: Any = js.native
  
  def initializeResult: js.UndefOr[InitializeResult[Any]] = js.native
  
  /* private */ var logObjectTrace: Any = js.native
  
  /* private */ var logTrace: Any = js.native
  
  @JSName("middleware")
  def middleware_MBaseLanguageClient: Middleware = js.native
  
  def name: String = js.native
  
  def needsStart(): Boolean = js.native
  
  def needsStop(): Boolean = js.native
  
  /* private */ var notifyFileEvent: Any = js.native
  
  def onDidChangeState: Event[StateChangeEvent] = js.native
  
  def onTelemetry: Event[Any] = js.native
  
  def outputChannel: OutputChannel = js.native
  
  @JSName("protocol2CodeConverter")
  def protocol2CodeConverter_MBaseLanguageClient: typings.vscodeLanguageclient.libCommonProtocolConverterMod.Converter = js.native
  
  /* private */ var refreshTrace: Any = js.native
  
  /* protected */ def registerBuiltinFeatures(): Unit = js.native
  
  def registerFeature(feature: DynamicFeature[Any]): Unit = js.native
  def registerFeature(feature: StaticFeature): Unit = js.native
  
  def registerFeatures(features: js.Array[StaticFeature | DynamicFeature[Any]]): Unit = js.native
  
  def registerProposedFeatures(): Unit = js.native
  
  /* private */ var sendPendingFullTextDocumentChanges: Any = js.native
  
  def sendProgress[P](`type`: ProgressType[P], token: String, value: P): js.Promise[Unit] = js.native
  def sendProgress[P](`type`: ProgressType[P], token: Double, value: P): js.Promise[Unit] = js.native
  
  /* private */ var setDiagnostics: Any = js.native
  
  def setTrace(value: Trace): js.Promise[Unit] = js.native
  
  /* private */ var showNotificationMessage: Any = js.native
  
  /* private */ var shutdown: Any = js.native
  
  def state: State = js.native
  
  def stop(timeout: Double): js.Promise[Unit] = js.native
  
  def traceOutputChannel: OutputChannel = js.native
  
  /* private */ var triggerDiagnosticQueue: Any = js.native
  
  /* private */ var triggerPendingChangeDelivery: Any = js.native
  
  /* private */ var workDiagnosticQueue: Any = js.native
  
  /* private */ var workspaceEditLock: Any = js.native
}
/* static members */
object BaseLanguageClient {
  
  @JSImport("vscode-languageclient/lib/common/client", "BaseLanguageClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/common/client", "BaseLanguageClient.CancellableResolveCalls")
  @js.native
  def CancellableResolveCalls: Any = js.native
  inline def CancellableResolveCalls_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CancellableResolveCalls")(x.asInstanceOf[js.Any])
  
  @JSImport("vscode-languageclient/lib/common/client", "BaseLanguageClient.RequestsToCancelOnContentModified")
  @js.native
  def RequestsToCancelOnContentModified: Any = js.native
  inline def RequestsToCancelOnContentModified_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RequestsToCancelOnContentModified")(x.asInstanceOf[js.Any])
}
