package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

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
  var tracer: Tracer with PTracer = js.native
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
  def dispose(): scala.Unit = js.native
  /**
       * Start listening on the input stream for messages to process.
       */
  def listen(): scala.Unit = js.native
  /**
       * Installs a handler for the `CodeAction` request.
       *
       * @param handler The corresponding handler.
       */
  def onCodeAction(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CodeActionParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command | vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
       * computing the commands is expensive implementers should only return code lens objects with the
       * range set and handle the resolve request.
       *
       * @param handler The corresponding handler.
       */
  def onCodeLens(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CodeLensParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * This function will be called for each visible code lens, usually when scrolling and after
       * the onCodeLens has been called.
       *
       * @param handler The corresponding handler.
       */
  def onCodeLensResolve(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens, 
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document color request.
       *
       * @param handler The corresponding handler.
       */
  def onColorPresentation(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod.ColorPresentationParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `Completion` request.
       *
       * @param handler The corresponding handler.
       */
  def onCompletion(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CompletionParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
        ]) | vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `CompletionResolve` request.
       *
       * @param handler The corresponding handler.
       */
  def onCompletionResolve(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem, 
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `Definition` request.
       *
       * @param handler The corresponding handler.
       */
  def onDefinition(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidChangeConfiguration` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidChangeConfiguration(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeConfigurationParams
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidChangeTextDocument` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidChangeTextDocument(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeTextDocumentParams
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidChangeWatchedFiles` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidChangeWatchedFiles(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeWatchedFilesParams
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidCloseTextDocument` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidCloseTextDocument(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidCloseTextDocumentParams
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidOpenTextDocument` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidOpenTextDocument(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidOpenTextDocumentParams]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DidSaveTextDocument` notification.
       *
       * @param handler The corresponding handler.
       */
  def onDidSaveTextDocument(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document color request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentColor(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotColorProviderMod.DocumentColorParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document formatting request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentFormatting(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentFormattingParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DocumentHighlight` request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentHighlight(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document links resolve request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentLinkResolve(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink, 
      js.UndefOr[
        vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document links request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentLinks(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentLinkParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document on type formatting request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentOnTypeFormatting(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentOnTypeFormattingParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the document range formatting request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentRangeFormatting(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentRangeFormattingParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `DocumentSymbol` request.
       *
       * @param handler The corresponding handler.
       */
  def onDocumentSymbol(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
        ]) | (js.Array[
          vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the execute command request.
       *
       * @param handler The corresponding handler.
       */
  def onExecuteCommand(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ExecuteCommandParams, 
      js.UndefOr[_ | scala.Null], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the exit notification.
       *
       * @param handler The exit handler.
       */
  def onExit(handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler0): scala.Unit = js.native
  /**
       * Installs a handler for the folding ranges request.
       *
       * @param handler The corresponding handler.
       */
  def onFoldingRanges(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolDotFoldingRangeMod.FoldingRangeParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `Hover` request.
       *
       * @param handler The corresponding handler.
       */
  def onHover(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Hover | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `Implementation` request.
       *
       * @param handler The corresponding handler.
       */
  def onImplementation(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the initialize request.
       *
       * @param handler The initialize handler.
       */
  def onInitialize(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeParams, 
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeResult, 
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeError
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the initialized notification.
       *
       * @param handler The initialized handler.
       */
  def onInitialized(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializedParams]
  ): scala.Unit = js.native
  /**
       * Installs a notification handler that is invoked if no specific notification handler can be found.
       *
       * @param handler a handler that handles all notifications.
       */
  def onNotification(handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.StarNotificationHandler): scala.Unit = js.native
  /**
       * Installs a notification handler for the given method.
       *
       * @param method The method to register a request handler for.
       * @param handler The handler to install.
       */
  def onNotification(
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericNotificationHandler
  ): scala.Unit = js.native
  /**
       * Installs a notification handler described by the given [NotificationType](#NotificationType).
       *
       * @param type The [NotificationType](#NotificationType) describing the notification.
       * @param handler The handler to install.
       */
  def onNotification[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler0
  ): scala.Unit = js.native
  def onNotification[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[P]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the prepare rename request.
       *
       * @param handler The corresponding handler.
       */
  def onPrepareRename(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range | vscodeDashLanguageserverLib.Anon_Range | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `References` request.
       *
       * @param handler The corresponding handler.
       */
  def onReferences(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ReferenceParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the rename request.
       *
       * @param handler The corresponding handler.
       */
  def onRenameRequest(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.RenameParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a request handler that is invoked if no specific request handler can be found.
       *
       * @param handler a handler that handles all requests.
       */
  def onRequest(handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.StarRequestHandler): scala.Unit = js.native
  /**
       * Installs a request handler for the given method.
       *
       * @param method The method to register a request handler for.
       * @param handler The handler to install.
       */
  def onRequest[R, E](
    method: java.lang.String,
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.GenericRequestHandler[R, E]
  ): scala.Unit = js.native
  /**
       * Installs a request handler described by the given [RequestType](#RequestType).
       *
       * @param type The [RequestType](#RequestType) describing the request.
       * @param handler The handler to install
       */
  def onRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler0[R, E]
  ): scala.Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[P, R, E]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the shutdown request.
       *
       * @param handler The initialize handler.
       */
  def onShutdown(handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler0[scala.Unit, scala.Unit]): scala.Unit = js.native
  /**
       * Installs a handler for the `SignatureHelp` request.
       *
       * @param handler The corresponding handler.
       */
  def onSignatureHelp(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureHelp | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `Type Definition` request.
       *
       * @param handler The corresponding handler.
       */
  def onTypeDefinition(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams, 
      js.UndefOr[
        vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `WillSaveTextDocument` notification.
       *
       * Note that this notification is opt-in. The client will not send it unless
       * your server has the `textDocumentSync.willSave` capability or you've
       * dynamically registered for the `textDocument/willSave` method.
       *
       * @param handler The corresponding handler.
       */
  def onWillSaveTextDocument(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.WillSaveTextDocumentParams
    ]
  ): scala.Unit = js.native
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
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.WillSaveTextDocumentParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Installs a handler for the `WorkspaceSymbol` request.
       *
       * @param handler The corresponding handler.
       */
  def onWorkspaceSymbol(
    handler: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.RequestHandler[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceSymbolParams, 
      js.UndefOr[
        (js.Array[
          vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
        ]) | scala.Null
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Sends diagnostics computed for a given document to VSCode to render them in the
       * user interface.
       *
       * @param params The diagnostic parameters.
       */
  def sendDiagnostics(params: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.PublishDiagnosticsParams): scala.Unit = js.native
  /**
       * Send a notification to the client.
       *
       * @param method The method to invoke on the client.
       * @param params The notification's parameters.
       */
  def sendNotification(method: java.lang.String): scala.Unit = js.native
  /**
       * Send a notification to the client.
       *
       * @param method The method to invoke on the client.
       * @param params The notification's parameters.
       */
  def sendNotification(method: java.lang.String, params: js.Any): scala.Unit = js.native
  /**
       * Send a notification to the client.
       *
       * @param type The [NotificationType](#NotificationType) describing the notification.
       * @param params The notification's parameters.
       */
  def sendNotification[RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType0[RO]
  ): scala.Unit = js.native
  def sendNotification[P, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.NotificationType[P, RO],
    params: P
  ): scala.Unit = js.native
  /**
       * Send a request to the client.
       *
       * @param method The method to invoke on the client.
       * @param params The request's parameters.
       */
  def sendRequest[R](method: java.lang.String): vscodeDashLanguageserverLib.Thenable[R] = js.native
  def sendRequest[R](method: java.lang.String, params: js.Any): vscodeDashLanguageserverLib.Thenable[R] = js.native
  def sendRequest[R](
    method: java.lang.String,
    params: js.Any,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashLanguageserverLib.Thenable[R] = js.native
  /**
       * Send a request to the client.
       *
       * @param method The method to invoke on the client.
       * @param params The request's parameters.
       */
  def sendRequest[R](method: java.lang.String, token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken): vscodeDashLanguageserverLib.Thenable[R] = js.native
  /**
       * Send a request to the client.
       *
       * @param type The [RequestType](#RequestType) describing the request.
       * @param params The request's parameters.
       */
  def sendRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO]
  ): vscodeDashLanguageserverLib.Thenable[R] = js.native
  /**
       * Send a request to the client.
       *
       * @param type The [RequestType](#RequestType) describing the request.
       * @param params The request's parameters.
       */
  def sendRequest[R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType0[R, E, RO],
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashLanguageserverLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P
  ): vscodeDashLanguageserverLib.Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.RequestType[P, R, E, RO],
    params: P,
    token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken
  ): vscodeDashLanguageserverLib.Thenable[R] = js.native
}

