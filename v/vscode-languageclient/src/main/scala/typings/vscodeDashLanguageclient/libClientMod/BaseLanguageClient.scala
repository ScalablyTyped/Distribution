package typings.vscodeDashLanguageclient.libClientMod

import typings.vscode.vscodeMod.CancellationToken
import typings.vscode.vscodeMod.DiagnosticCollection
import typings.vscode.vscodeMod.OutputChannel
import typings.vscodeDashJsonrpc.Thenable
import typings.vscodeDashJsonrpc.libEventsMod.Disposable
import typings.vscodeDashJsonrpc.libMessagesMod.MessageType
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericNotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericRequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler0
import typings.vscodeDashLanguageclient.libCodeConverterMod.Converter
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "BaseLanguageClient")
@js.native
abstract class BaseLanguageClient protected () extends js.Object {
  def this(id: String, name: String, clientOptions: LanguageClientOptions) = this()
  var _c2p: js.Any = js.native
  var _capabilities: js.Any = js.native
  var _clientGetRootPath: js.Any = js.native
  var _clientOptions: js.Any = js.native
  var _connectionPromise: js.Any = js.native
  var _diagnostics: js.Any = js.native
  var _disposeOutputChannel: js.Any = js.native
  val _dynamicFeatures: js.Any = js.native
  val _features: js.Any = js.native
  var _fileEventDelayer: js.Any = js.native
  var _fileEvents: js.Any = js.native
  var _id: js.Any = js.native
  var _initializeResult: js.Any = js.native
  var _listeners: js.Any = js.native
  val _method2Message: js.Any = js.native
  var _name: js.Any = js.native
  var _onReady: js.Any = js.native
  var _onReadyCallbacks: js.Any = js.native
  var _onStop: js.Any = js.native
  var _outputChannel: js.Any = js.native
  var _p2c: js.Any = js.native
  var _providers: js.Any = js.native
  var _resolvedConnection: js.Any = js.native
  var _state: js.Any = js.native
  var _stateChangeEmitter: js.Any = js.native
  var _syncedDocuments: js.Any = js.native
  var _telemetryEmitter: js.Any = js.native
  var _trace: js.Any = js.native
  var _traceFormat: js.Any = js.native
  var _tracer: js.Any = js.native
  var cleanUp: js.Any = js.native
  val clientOptions: LanguageClientOptions = js.native
  val code2ProtocolConverter: Converter = js.native
  var computeClientCapabilities: js.Any = js.native
  var createConnection: js.Any = js.native
  var data2String: js.Any = js.native
  val diagnostics: js.UndefOr[DiagnosticCollection] = js.native
  var fillInitializeParams: js.Any = js.native
  var forceDocumentSync: js.Any = js.native
  var getPublicState: js.Any = js.native
  var handleApplyWorkspaceEdit: js.Any = js.native
  var handleConnectionError: js.Any = js.native
  var handleDiagnostics: js.Any = js.native
  var handleRegistrationRequest: js.Any = js.native
  var handleUnregistrationRequest: js.Any = js.native
  var hookConfigurationChanged: js.Any = js.native
  var hookFileEvents: js.Any = js.native
  var initialize: js.Any = js.native
  var initializeFeatures: js.Any = js.native
  val initializeResult: js.UndefOr[InitializeResult] = js.native
  var isConnectionActive: js.Any = js.native
  var logObjectTrace: js.Any = js.native
  var logTrace: js.Any = js.native
  var notifyFileEvent: js.Any = js.native
  val outputChannel: OutputChannel = js.native
  val protocol2CodeConverter: typings.vscodeDashLanguageclient.libProtocolConverterMod.Converter = js.native
  var refreshTrace: js.Any = js.native
  var resolveConnection: js.Any = js.native
  var setDiagnostics: js.Any = js.native
  var state: js.Any = js.native
  var trace: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace = js.native
  def createDefaultErrorHandler(): ErrorHandler = js.native
  /* protected */ def createMessageTransports(encoding: String): Thenable[MessageTransports] = js.native
  def error(message: String): Unit = js.native
  def error(message: String, data: js.Any): Unit = js.native
  /* protected */ def handleConnectionClosed(): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, data: js.Any): Unit = js.native
  def logFailedRequest(`type`: MessageType, error: js.Any): Unit = js.native
  def needsStart(): Boolean = js.native
  def needsStop(): Boolean = js.native
  def onDidChangeState(listener: js.Function1[/* e */ StateChangeEvent, _]): Disposable = js.native
  def onDidChangeState(listener: js.Function1[/* e */ StateChangeEvent, _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeState(
    listener: js.Function1[/* e */ StateChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  def onNotification[RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  def onReady(): js.Promise[Unit] = js.native
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  def onRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  def onTelemetry(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onTelemetry(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onTelemetry(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* protected */ def registerBuiltinFeatures(): Unit = js.native
  def registerFeature(feature: DynamicFeature[_]): Unit = js.native
  def registerFeature(feature: StaticFeature): Unit = js.native
  def registerFeatures(features: js.Array[StaticFeature | DynamicFeature[_]]): Unit = js.native
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  def sendNotification[RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): Unit = js.native
  def sendNotification[P, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO]
  ): Unit = js.native
  def sendNotification[P, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    params: P
  ): Unit = js.native
  def sendRequest[R](method: String): Thenable[R] = js.native
  def sendRequest[R](method: String, param: js.Any): Thenable[R] = js.native
  def sendRequest[R](method: String, param: js.Any, token: CancellationToken): Thenable[R] = js.native
  def sendRequest[R](method: String, token: CancellationToken): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    token: CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P,
    token: CancellationToken
  ): Thenable[R] = js.native
  def start(): typings.vscode.vscodeMod.Disposable = js.native
  def stop(): Thenable[Unit] = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, data: js.Any): Unit = js.native
}

