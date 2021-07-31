package typings.vscodeLanguageserver.mod

import typings.vscodeJsonrpc.mod.GenericNotificationHandler
import typings.vscodeJsonrpc.mod.GenericRequestHandler
import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeJsonrpc.mod.NotificationHandler0
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeJsonrpc.mod.RequestHandler0
import typings.vscodeJsonrpc.mod.StarNotificationHandler
import typings.vscodeJsonrpc.mod.StarRequestHandler
import typings.vscodeLanguageserver.anon.Placeholder
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.protocolMod.DefinitionParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeConfigurationParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typings.vscodeLanguageserverProtocol.protocolMod.HoverParams
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typings.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import typings.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import typings.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import typings.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typings.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typings.vscodeLanguageserverTypes.mod.Declaration
import typings.vscodeLanguageserverTypes.mod.DeclarationLink
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.DefinitionLink
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] extends StObject {
  
  /**
    * A property to provide access to client specific features like registering
    * for requests or notifications.
    */
  var client: RemoteClient & PClient = js.native
  
  /**
    * A property to provide access to console specific features.
    */
  var console: RemoteConsole & PConsole = js.native
  
  /**
    * Disposes the connection
    */
  def dispose(): Unit = js.native
  
  /**
    * A property to provide access to language specific features.
    */
  var languages: Languages & PLanguages = js.native
  
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
    handler: ServerRequestHandler[
      CodeActionParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
        ]) | Null
      ], 
      js.Array[
        typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
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
    handler: ServerRequestHandler[
      CodeLensParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
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
      typings.vscodeLanguageserverTypes.mod.CodeLens, 
      typings.vscodeLanguageserverTypes.mod.CodeLens, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onColorPresentation(
    handler: ServerRequestHandler[
      ColorPresentationParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.ColorPresentation], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Completion` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletion(
    handler: ServerRequestHandler[
      CompletionParams, 
      js.UndefOr[
        js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem] | typings.vscodeLanguageserverTypes.mod.CompletionList | Null
      ], 
      js.Array[typings.vscodeLanguageserverTypes.mod.CompletionItem], 
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
      typings.vscodeLanguageserverTypes.mod.CompletionItem, 
      typings.vscodeLanguageserverTypes.mod.CompletionItem, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Declaration` request.
    *
    * @param handler The corresponding handler.
    */
  def onDeclaration(
    handler: ServerRequestHandler[
      DeclarationParams, 
      js.UndefOr[Declaration | js.Array[DeclarationLink] | Null], 
      js.Array[DeclarationLink | typings.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onDefinition(
    handler: ServerRequestHandler[
      DefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typings.vscodeLanguageserverTypes.mod.Location], 
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
    handler: ServerRequestHandler[
      DocumentColorParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.ColorInformation], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentFormatting(
    handler: ServerRequestHandler[
      DocumentFormattingParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `DocumentHighlight` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentHighlight(
    handler: ServerRequestHandler[
      DocumentHighlightParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.DocumentHighlight], 
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
      typings.vscodeLanguageserverTypes.mod.DocumentLink, 
      js.UndefOr[typings.vscodeLanguageserverTypes.mod.DocumentLink | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document links request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinks(
    handler: ServerRequestHandler[
      DocumentLinkParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink], 
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
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the document range formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentRangeFormatting(
    handler: ServerRequestHandler[
      DocumentRangeFormattingParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `DocumentSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentSymbol(
    handler: ServerRequestHandler[
      DocumentSymbolParams, 
      js.UndefOr[
        (js.Array[
          typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
        ]) | Null
      ], 
      js.Array[
        typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
      ], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the execute command request.
    *
    * @param handler The corresponding handler.
    */
  def onExecuteCommand(
    handler: ServerRequestHandler[ExecuteCommandParams, js.UndefOr[js.Any | Null], scala.Nothing, Unit]
  ): Unit = js.native
  
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
    handler: ServerRequestHandler[
      FoldingRangeParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.FoldingRange], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Hover` request.
    *
    * @param handler The corresponding handler.
    */
  def onHover(
    handler: ServerRequestHandler[
      HoverParams, 
      js.UndefOr[typings.vscodeLanguageserverTypes.mod.Hover | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Implementation` request.
    *
    * @param handler The corresponding handler.
    */
  def onImplementation(
    handler: ServerRequestHandler[
      ImplementationParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typings.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the initialize request.
    *
    * @param handler The initialize handler.
    */
  def onInitialize(
    handler: ServerRequestHandler[
      InitializeParams, 
      InitializeResult[js.Any], 
      scala.Nothing, 
      typings.vscodeLanguageserverProtocol.protocolMod.InitializeError
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
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  
  /**
    * Installs a handler for the prepare rename request.
    *
    * @param handler The corresponding handler.
    */
  def onPrepareRename(
    handler: RequestHandler[
      PrepareRenameParams, 
      js.UndefOr[typings.vscodeLanguageserverTypes.mod.Range | Placeholder | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a progress handler for a given token.
    * @param type the progress type
    * @param token the token
    * @param handler the handler
    */
  def onProgress[P](
    `type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: String,
    handler: NotificationHandler[P]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  def onProgress[P](
    `type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P],
    token: Double,
    handler: NotificationHandler[P]
  ): typings.vscodeJsonrpc.eventsMod.Disposable = js.native
  
  /**
    * Installs a handler for the `References` request.
    *
    * @param handler The corresponding handler.
    */
  def onReferences(
    handler: ServerRequestHandler[
      ReferenceParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.Location] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the rename request.
    *
    * @param handler The corresponding handler.
    */
  def onRenameRequest(
    handler: ServerRequestHandler[
      RenameParams, 
      js.UndefOr[typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null], 
      scala.Nothing, 
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
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  
  /**
    * Installs a handler for the selection ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onSelectionRanges(
    handler: ServerRequestHandler[
      SelectionRangeParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.SelectionRange] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.SelectionRange], 
      Unit
    ]
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
  def onSignatureHelp(
    handler: ServerRequestHandler[SignatureHelpParams, js.UndefOr[SignatureHelp | Null], scala.Nothing, Unit]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `Type Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onTypeDefinition(
    handler: ServerRequestHandler[
      TypeDefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | typings.vscodeLanguageserverTypes.mod.Location], 
      Unit
    ]
  ): Unit = js.native
  
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
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbol(
    handler: ServerRequestHandler[
      WorkspaceSymbolParams, 
      js.UndefOr[js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation] | Null], 
      js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation], 
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
  def sendNotification[RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typings.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], params: P): Unit = js.native
  
  /**
    * Sends progress.
    * @param type the progress type
    * @param token the token to use
    * @param value the progress value
    */
  def sendProgress[P](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P], token: String, value: P): Unit = js.native
  def sendProgress[P](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[P], token: Double, value: P): Unit = js.native
  
  /**
    * Send a request to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The request's parameters.
    */
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, params: js.Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, params: js.Any, token: typings.vscodeJsonrpc.cancellationMod.CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: typings.vscodeJsonrpc.cancellationMod.CancellationToken): js.Promise[R] = js.native
  /**
    * Send a request to the client.
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param params The request's parameters.
    */
  def sendRequest[R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    token: typings.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typings.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    params: P,
    token: typings.vscodeJsonrpc.cancellationMod.CancellationToken
  ): js.Promise[R] = js.native
  
  /**
    * A property to provide access to telemetry specific features.
    */
  var telemetry: Telemetry & PTelemetry = js.native
  
  /**
    * A property to provide access to tracer specific features.
    */
  var tracer: Tracer & PTracer = js.native
  
  /**
    * A property to provide access to windows specific features.
    */
  var window: RemoteWindow & PWindow = js.native
  
  /**
    * A property to provide access to workspace specific features.
    */
  var workspace: RemoteWorkspace & PWorkspace = js.native
}
