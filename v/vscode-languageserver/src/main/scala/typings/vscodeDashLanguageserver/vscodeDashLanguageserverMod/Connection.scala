package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericNotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.GenericRequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.StarNotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.StarRequestHandler
import typings.vscodeDashLanguageserver.Anon_Placeholder
import typings.vscodeDashLanguageserver.Thenable
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod.ColorPresentationParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod.DocumentColorParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeActionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidChangeConfigurationParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidChangeTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidChangeWatchedFilesParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidCloseTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidOpenTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidSaveTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentOnTypeFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentRangeFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ExecuteCommandParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeResult
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializedParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.PublishDiagnosticsParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ReferenceParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.RenameParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.WillSaveTextDocumentParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Declaration
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DeclarationLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Definition
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DefinitionLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  /**
    * A proxy interface for the language client interface to register for requests or
    * notifications.
    */
  var client: RemoteClient with PClient = js.native
  /**
    * A proxy for VSCode's development console. See [RemoteConsole](#RemoteConsole)
    */
  var console: RemoteConsole with PConsole = js.native
  /**
    * A proxy to send telemetry events to the client.
    */
  var telemetry: Telemetry with PTelemetry = js.native
  /**
    * A proxy to send trace events to the client.
    */
  var tracer: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Tracer with PTracer = js.native
  /**
    * A proxy for VSCode's window. See [RemoteWindow](#RemoteWindow)
    */
  var window: RemoteWindow with PWindow = js.native
  /**
    * A proxy to talk to the client's workspace.
    */
  var workspace: RemoteWorkspace with PWorkspace = js.native
  /**
    * Disposes the connection
    */
  def dispose(): Unit = js.native
  /**
    * Start listening on the input stream for messages to process.
    */
  def listen(): Unit = js.native
  /**
    * Installs a handler for the `CodeAction` request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeAction(
    handler: RequestHandler[
      CodeActionParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command | typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementers should only return code lens objects with the
    * range set and handle the resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLens(
    handler: RequestHandler[
      CodeLensParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * the onCodeLens has been called.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLensResolve(
    handler: RequestHandler[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens, 
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onColorPresentation(
    handler: RequestHandler[
      ColorPresentationParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Completion` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletion(
    handler: RequestHandler[
      CompletionParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
        ]) | typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `CompletionResolve` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletionResolve(
    handler: RequestHandler[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem, 
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Declaration` request.
    *
    * @param handler The corresponding handler.
    */
  def onDeclaration(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[Declaration | js.Array[DeclarationLink] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onDefinition(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DidChangeConfiguration` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeConfiguration(handler: NotificationHandler[DidChangeConfigurationParams]): Unit = js.native
  /**
    * Installs a handler for the `DidChangeTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeTextDocument(handler: NotificationHandler[DidChangeTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidChangeWatchedFiles` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeWatchedFiles(handler: NotificationHandler[DidChangeWatchedFilesParams]): Unit = js.native
  /**
    * Installs a handler for the `DidCloseTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidCloseTextDocument(handler: NotificationHandler[DidCloseTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidOpenTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidOpenTextDocument(handler: NotificationHandler[DidOpenTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidSaveTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidSaveTextDocument(handler: NotificationHandler[DidSaveTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentColor(
    handler: RequestHandler[
      DocumentColorParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorInformation
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentFormatting(
    handler: RequestHandler[
      DocumentFormattingParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DocumentHighlight` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentHighlight(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document links resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinkResolve(
    handler: RequestHandler[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink, 
      js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document links request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinks(
    handler: RequestHandler[
      DocumentLinkParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document on type formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentOnTypeFormatting(
    handler: RequestHandler[
      DocumentOnTypeFormattingParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document range formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentRangeFormatting(
    handler: RequestHandler[
      DocumentRangeFormattingParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DocumentSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentSymbol(
    handler: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentSymbolParams */ _, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol | typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the execute command request.
    *
    * @param handler The corresponding handler.
    */
  def onExecuteCommand(handler: RequestHandler[ExecuteCommandParams, js.UndefOr[_ | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the exit notification.
    *
    * @param handler The exit handler.
    */
  def onExit(handler: NotificationHandler0): Unit = js.native
  /**
    * Installs a handler for the folding ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onFoldingRanges(
    handler: RequestHandler[
      FoldingRangeParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Hover` request.
    *
    * @param handler The corresponding handler.
    */
  def onHover(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Hover | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Implementation` request.
    *
    * @param handler The corresponding handler.
    */
  def onImplementation(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[Definition | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the initialize request.
    *
    * @param handler The initialize handler.
    */
  def onInitialize(
    handler: RequestHandler[
      InitializeParams, 
      InitializeResult, 
      typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.InitializeError
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the initialized notification.
    *
    * @param handler The initialized handler.
    */
  def onInitialized(handler: NotificationHandler[InitializedParams]): Unit = js.native
  /**
    * Installs a notification handler that is invoked if no specific notification handler can be found.
    *
    * @param handler a handler that handles all notifications.
    */
  def onNotification(handler: StarNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler described by the given [NotificationType](#NotificationType).
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param handler The handler to install.
    */
  def onNotification[RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  /**
    * Installs a handler for the prepare rename request.
    *
    * @param handler The corresponding handler.
    */
  def onPrepareRename(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range | Anon_Placeholder | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `References` request.
    *
    * @param handler The corresponding handler.
    */
  def onReferences(
    handler: RequestHandler[
      ReferenceParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the rename request.
    *
    * @param handler The corresponding handler.
    */
  def onRenameRequest(
    handler: RequestHandler[
      RenameParams, 
      js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a request handler that is invoked if no specific request handler can be found.
    *
    * @param handler a handler that handles all requests.
    */
  def onRequest(handler: StarRequestHandler): Unit = js.native
  /**
    * Installs a request handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  /**
    * Installs a request handler described by the given [RequestType](#RequestType).
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param handler The handler to install
    */
  def onRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  /**
    * Installs a handler for the shutdown request.
    *
    * @param handler The initialize handler.
    */
  def onShutdown(handler: RequestHandler0[Unit, Unit]): Unit = js.native
  /**
    * Installs a handler for the `SignatureHelp` request.
    *
    * @param handler The corresponding handler.
    */
  def onSignatureHelp(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[SignatureHelp | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the `Type Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onTypeDefinition(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[Definition | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the `WillSaveTextDocument` notification.
    *
    * Note that this notification is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSave` capability or you've
    * dynamically registered for the `textDocument/willSave` method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocument(handler: NotificationHandler[WillSaveTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `WillSaveTextDocumentWaitUntil` request.
    *
    * Note that this request is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSaveWaitUntil` capability,
    * or you've dynamically registered for the `textDocument/willSaveWaitUntil`
    * method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocumentWaitUntil(
    handler: RequestHandler[
      WillSaveTextDocumentParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbol(
    handler: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceSymbolParams */ _, 
      js.UndefOr[
        (js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Sends diagnostics computed for a given document to VSCode to render them in the
    * user interface.
    *
    * @param params The diagnostic parameters.
    */
  def sendDiagnostics(params: PublishDiagnosticsParams): Unit = js.native
  /**
    * Send a notification to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The notification's parameters.
    */
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  /**
    * Send a notification to the client.
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param params The notification's parameters.
    */
  def sendNotification[RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): Unit = js.native
  def sendNotification[P, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    params: P
  ): Unit = js.native
  /**
    * Send a request to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The request's parameters.
    */
  def sendRequest[R](method: String): Thenable[R] = js.native
  def sendRequest[R](method: String, params: js.Any): Thenable[R] = js.native
  def sendRequest[R](
    method: String,
    params: js.Any,
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[R](method: String, token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken): Thenable[R] = js.native
  /**
    * Send a request to the client.
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param params The request's parameters.
    */
  def sendRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P,
    token: typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
  ): Thenable[R] = js.native
}

