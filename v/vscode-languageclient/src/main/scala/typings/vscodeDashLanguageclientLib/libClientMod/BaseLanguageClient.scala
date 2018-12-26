package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "BaseLanguageClient")
@js.native
abstract class BaseLanguageClient protected () extends js.Object {
  def this(id: java.lang.String, name: java.lang.String, clientOptions: LanguageClientOptions) = this()
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
  val code2ProtocolConverter: vscodeDashLanguageclientLib.libCodeConverterMod.Converter = js.native
  var computeClientCapabilities: js.Any = js.native
  var createConnection: js.Any = js.native
  var data2String: js.Any = js.native
  val diagnostics: js.UndefOr[_] = js.native
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
  val initializeResult: js.UndefOr[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeResult] = js.native
  var isConnectionActive: js.Any = js.native
  var logObjectTrace: js.Any = js.native
  var logTrace: js.Any = js.native
  var notifyFileEvent: js.Any = js.native
  val outputChannel: js.Any = js.native
  val protocol2CodeConverter: vscodeDashLanguageclientLib.libProtocolConverterMod.Converter = js.native
  var refreshTrace: js.Any = js.native
  var resolveConnection: js.Any = js.native
  var setDiagnostics: js.Any = js.native
  var state: js.Any = js.native
  var trace: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.Trace = js.native
  def createDefaultErrorHandler(): ErrorHandler = js.native
  /* protected */ def createMessageTransports(encoding: java.lang.String): vscodeDashJsonrpcLib.Thenable[MessageTransports] = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String, data: js.Any): scala.Unit = js.native
  /* protected */ def handleConnectionClosed(): scala.Unit = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String, data: js.Any): scala.Unit = js.native
  def logFailedRequest(`type`: vscodeDashJsonrpcLib.libMessagesMod.MessageType, error: js.Any): scala.Unit = js.native
  def needsStart(): scala.Boolean = js.native
  def needsStop(): scala.Boolean = js.native
  def onDidChangeState(listener: js.Function1[/* e */ StateChangeEvent, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDidChangeState(listener: js.Function1[/* e */ StateChangeEvent, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onDidChangeState(
    listener: js.Function1[/* e */ StateChangeEvent, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onNotification(
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericNotificationHandler
  ): scala.Unit = js.native
  def onNotification[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler0
  ): scala.Unit = js.native
  def onNotification[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[P]
  ): scala.Unit = js.native
  def onReady(): js.Promise[scala.Unit] = js.native
  def onRequest[R, E](
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericRequestHandler[R, E]
  ): scala.Unit = js.native
  def onRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler0[R, E]
  ): scala.Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[P, R, E]
  ): scala.Unit = js.native
  def onTelemetry(listener: js.Function1[/* e */ js.Any, _]): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onTelemetry(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def onTelemetry(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.Any,
    disposables: js.Array[vscodeDashJsonrpcLib.libEventsMod.Disposable]
  ): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  /* protected */ def registerBuiltinFeatures(): scala.Unit = js.native
  def registerFeature(feature: DynamicFeature[_]): scala.Unit = js.native
  def registerFeature(feature: StaticFeature): scala.Unit = js.native
  def registerFeatures(features: js.Array[StaticFeature | DynamicFeature[_]]): scala.Unit = js.native
  def sendNotification(method: java.lang.String): scala.Unit = js.native
  def sendNotification(method: java.lang.String, params: js.Any): scala.Unit = js.native
  def sendNotification[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): scala.Unit = js.native
  def sendNotification[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO]
  ): scala.Unit = js.native
  def sendNotification[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    params: P
  ): scala.Unit = js.native
  def sendRequest[R](method: java.lang.String): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R](method: java.lang.String, param: js.Any): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R](
    method: java.lang.String,
    param: js.Any,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R](method: java.lang.String, token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashJsonrpcLib.Thenable[R] = js.native
  def start(): vscodeDashJsonrpcLib.libEventsMod.Disposable = js.native
  def stop(): vscodeDashJsonrpcLib.Thenable[scala.Unit] = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
  def warn(message: java.lang.String, data: js.Any): scala.Unit = js.native
}

