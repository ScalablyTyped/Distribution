package typings.vscodeLanguageclient.clientMod

import typings.vscode.mod.CodeActionProvider
import typings.vscode.mod.CompletionItemProvider
import typings.vscode.mod.DeclarationProvider
import typings.vscode.mod.DefinitionProvider
import typings.vscode.mod.DiagnosticCollection
import typings.vscode.mod.DocumentColorProvider
import typings.vscode.mod.DocumentFormattingEditProvider
import typings.vscode.mod.DocumentHighlightProvider
import typings.vscode.mod.DocumentLinkProvider
import typings.vscode.mod.DocumentRangeFormattingEditProvider
import typings.vscode.mod.FoldingRangeProvider
import typings.vscode.mod.HoverProvider
import typings.vscode.mod.ImplementationProvider
import typings.vscode.mod.OnTypeFormattingEditProvider
import typings.vscode.mod.OutputChannel
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.ReferenceProvider
import typings.vscode.mod.RenameProvider
import typings.vscode.mod.SelectionRangeProvider
import typings.vscode.mod.SignatureHelpProvider
import typings.vscode.mod.TypeDefinitionProvider
import typings.vscode.mod.WorkspaceSymbolProvider
import typings.vscodeJsonrpc.mod.GenericNotificationHandler
import typings.vscodeJsonrpc.mod.GenericRequestHandler
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.NotificationHandler0
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeJsonrpc.mod.RequestHandler0
import typings.vscodeLanguageclient.codeConverterMod.Converter
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeAction
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcompletion
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashonTypeFormatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsignatureHelp
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeResult
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
  var _traceOutputChannel: js.Any = js.native
  var _tracer: js.Any = js.native
  var cleanUp: js.Any = js.native
  var cleanUpChannel: js.Any = js.native
  var computeClientCapabilities: js.Any = js.native
  var createConnection: js.Any = js.native
  var data2String: js.Any = js.native
  var doInitialize: js.Any = js.native
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
  var isConnectionActive: js.Any = js.native
  var logObjectTrace: js.Any = js.native
  var logTrace: js.Any = js.native
  var notifyFileEvent: js.Any = js.native
  var refreshTrace: js.Any = js.native
  var resolveConnection: js.Any = js.native
  var setDiagnostics: js.Any = js.native
  var showNotificationMessage: js.Any = js.native
  def clientOptions(): LanguageClientOptions = js.native
  def code2ProtocolConverter(): Converter = js.native
  def createDefaultErrorHandler(): ErrorHandler = js.native
  /* protected */ def createMessageTransports(encoding: String): js.Promise[MessageTransports] = js.native
  def diagnostics(): js.UndefOr[DiagnosticCollection] = js.native
  def error(message: String): Unit = js.native
  def error(message: String, data: js.Any): Unit = js.native
  def error(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcodeAction(request: textDocumentSlashcodeAction): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[CodeActionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcompletion(request: textDocumentSlashcompletion): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[CompletionItemProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdeclaration(request: textDocumentSlashdeclaration): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DeclarationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdefinition(request: textDocumentSlashdefinition): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidChange(request: textDocumentSlashdidChange): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[js.Function1[/* textDocument */ typings.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidClose(request: textDocumentSlashdidClose): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[js.Function1[/* textDocument */ typings.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidOpen(request: textDocumentSlashdidOpen): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[js.Function1[/* textDocument */ typings.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidSave(request: textDocumentSlashdidSave): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[js.Function1[/* textDocument */ typings.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentColor(request: textDocumentSlashdocumentColor): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DocumentColorProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentHighlight(request: textDocumentSlashdocumentHighlight): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DocumentHighlightProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentLink(request: textDocumentSlashdocumentLink): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DocumentLinkProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentfoldingRange(request: textDocumentSlashfoldingRange): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[FoldingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentformatting(request: textDocumentSlashformatting): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DocumentFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenthover(request: textDocumentSlashhover): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[HoverProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentimplementation(request: textDocumentSlashimplementation): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[ImplementationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentonTypeFormatting(request: textDocumentSlashonTypeFormatting): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[OnTypeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareCallHierarchy(request: textDocumentSlashprepareCallHierarchy): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrangeFormatting(request: textDocumentSlashrangeFormatting): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[DocumentRangeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentreferences(request: textDocumentSlashreferences): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[ReferenceProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrename(request: textDocumentSlashrename): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[RenameProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentselectionRange(request: textDocumentSlashselectionRange): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[SelectionRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsignatureHelp(request: textDocumentSlashsignatureHelp): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[SignatureHelpProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenttypeDefinition(request: textDocumentSlashtypeDefinition): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSave(request: textDocumentSlashwillSave): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[js.Function1[/* textDocument */ typings.vscode.mod.TextDocument, Unit]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSaveWaitUntil(request: textDocumentSlashwillSaveWaitUntil): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with (NotificationFeature[
    js.Function1[
      /* textDocument */ typings.vscode.mod.TextDocument, 
      ProviderResult[js.Array[typings.vscode.mod.TextEdit]]
    ]
  ]) = js.native
  @JSName("getFeature")
  def getFeature_workspacesymbol(request: workspaceSlashsymbol): DynamicFeature[typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions] with WorkspaceProviderFeature[WorkspaceSymbolProvider] = js.native
  /* protected */ def handleConnectionClosed(): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, data: js.Any): Unit = js.native
  def info(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
  def initializeResult(): js.UndefOr[InitializeResult[_]] = js.native
  def logFailedRequest(`type`: typings.vscodeJsonrpc.messagesMod.MessageType, error: js.Any): Unit = js.native
  def needsStart(): Boolean = js.native
  def needsStop(): Boolean = js.native
  def onDidChangeState(): typings.vscodeJsonrpc.eventsMod.Event[StateChangeEvent] = js.native
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  def onNotification[RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  def onProgress[P](
    `type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: String,
    handler: NotificationHandler[P]
  ): typings.vscode.mod.Disposable = js.native
  def onProgress[P](
    `type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: Double,
    handler: NotificationHandler[P]
  ): typings.vscode.mod.Disposable = js.native
  def onReady(): js.Promise[Unit] = js.native
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  def onRequest[R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  def onTelemetry(): typings.vscodeJsonrpc.eventsMod.Event[_] = js.native
  def outputChannel(): OutputChannel = js.native
  def protocol2CodeConverter(): typings.vscodeLanguageclient.protocolConverterMod.Converter = js.native
  /* protected */ def registerBuiltinFeatures(): Unit = js.native
  def registerFeature(feature: DynamicFeature[_]): Unit = js.native
  def registerFeature(feature: StaticFeature): Unit = js.native
  def registerFeatures(features: js.Array[StaticFeature | DynamicFeature[_]]): Unit = js.native
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  def sendNotification[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], params: P): Unit = js.native
  def sendProgress[P](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P], token: String, value: P): Unit = js.native
  def sendProgress[P](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P], token: Double, value: P): Unit = js.native
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: js.Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: js.Any, token: typings.vscode.mod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: typings.vscode.mod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    token: typings.vscode.mod.CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    params: P,
    token: typings.vscode.mod.CancellationToken
  ): js.Promise[R] = js.native
  def start(): typings.vscode.mod.Disposable = js.native
  /* private */ def state(): js.Any = js.native
  /* private */ def state(value: js.Any): js.Any = js.native
  def stop(): js.Promise[Unit] = js.native
  def trace(value: typings.vscodeJsonrpc.mod.Trace): js.Any = js.native
  def traceOutputChannel(): OutputChannel = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, data: js.Any): Unit = js.native
  def warn(message: String, data: js.Any, showNotification: Boolean): Unit = js.native
}

