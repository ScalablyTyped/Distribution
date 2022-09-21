package typings.vscodeLanguageclient.featuresMod

import typings.vscode.mod.CallHierarchyProvider
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.CodeAction
import typings.vscode.mod.CodeActionProvider
import typings.vscode.mod.CompletionItem
import typings.vscode.mod.CompletionItemProvider
import typings.vscode.mod.DeclarationProvider
import typings.vscode.mod.DefinitionProvider
import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentColorProvider
import typings.vscode.mod.DocumentFormattingEditProvider
import typings.vscode.mod.DocumentHighlightProvider
import typings.vscode.mod.DocumentLink
import typings.vscode.mod.DocumentLinkProvider
import typings.vscode.mod.DocumentRangeFormattingEditProvider
import typings.vscode.mod.DocumentSymbolProvider
import typings.vscode.mod.FoldingRangeProvider
import typings.vscode.mod.HoverProvider
import typings.vscode.mod.ImplementationProvider
import typings.vscode.mod.LinkedEditingRangeProvider
import typings.vscode.mod.OnTypeFormattingEditProvider
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.ReferenceProvider
import typings.vscode.mod.RenameProvider
import typings.vscode.mod.SelectionRangeProvider
import typings.vscode.mod.SignatureHelpProvider
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TextEdit
import typings.vscode.mod.TypeDefinitionProvider
import typings.vscode.mod.TypeHierarchyProvider
import typings.vscode.mod.WorkspaceSymbolProvider
import typings.vscodeJsonrpc.connectionMod.GenericNotificationHandler
import typings.vscodeJsonrpc.connectionMod.GenericRequestHandler
import typings.vscodeJsonrpc.connectionMod.NotificationHandler
import typings.vscodeJsonrpc.connectionMod.NotificationHandler0
import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeJsonrpc.connectionMod.RequestHandler0
import typings.vscodeJsonrpc.messagesMod.MessageSignature
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperati
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperatiDispose
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperatiFillClientCapabilities
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperatiFillInitializeParams
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperatiGetState
import typings.vscodeLanguageclient.anon.DynamicFeatureFileOperatiInitialize
import typings.vscodeLanguageclient.codeConverterMod.Converter
import typings.vscodeLanguageclient.codeLensMod.CodeLensProviderShape
import typings.vscodeLanguageclient.diagnosticMod.DiagnosticProviderShape
import typings.vscodeLanguageclient.inlayHintMod.InlayHintsProviderShape
import typings.vscodeLanguageclient.inlineValueMod.InlineValueProviderShape
import typings.vscodeLanguageclient.notebookMod.NotebookDocumentProviderShape
import typings.vscodeLanguageclient.semanticTokensMod.SemanticTokensProviderShape
import typings.vscodeLanguageclient.textSynchronizationMod.DidChangeTextDocumentFeatureShape
import typings.vscodeLanguageclient.textSynchronizationMod.DidCloseTextDocumentFeatureShape
import typings.vscodeLanguageclient.textSynchronizationMod.DidOpenTextDocumentFeatureShape
import typings.vscodeLanguageclient.textSynchronizationMod.DidSaveTextDocumentFeatureShape
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.force
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeAction
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeLens
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcompletion
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdiagnostic
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentColor
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlayHint
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlineValue
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashlinkedEditingRange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashonTypeFormatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareTypeHierarchy
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsignatureHelp
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidCreateFiles
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidDeleteFiles
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidRenameFiles
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillCreateFiles
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillDeleteFiles
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillRenameFiles
import typings.vscodeLanguageserverProtocol.mod.NotificationType
import typings.vscodeLanguageserverProtocol.mod.NotificationType0
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType0
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.mod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.mod.RequestType
import typings.vscodeLanguageserverProtocol.mod.RequestType0
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolNotebookMod.NotebookDocumentSyncRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureClient[M, CO] extends StObject {
  
  var clientOptions: CO = js.native
  
  var code2ProtocolConverter: Converter = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, data: Any): Unit = js.native
  def error(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def error(message: String, data: Unit, showNotification: Boolean): Unit = js.native
  @JSName("error")
  def error_force(message: String, data: Any, showNotification: force): Unit = js.native
  @JSName("error")
  def error_force(message: String, data: Unit, showNotification: force): Unit = js.native
  
  @JSName("getFeature")
  def getFeature_notebookDocumentsync(request: notebookDocumentSlashsync): js.UndefOr[
    DynamicFeature[NotebookDocumentSyncRegistrationOptions] & NotebookDocumentProviderShape
  ] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcodeAction(request: textDocumentSlashcodeAction): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CodeActionProvider[CodeAction]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcodeLens(request: textDocumentSlashcodeLens): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CodeLensProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcompletion(request: textDocumentSlashcompletion): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CompletionItemProvider[CompletionItem]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdeclaration(request: textDocumentSlashdeclaration): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DeclarationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdefinition(request: textDocumentSlashdefinition): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdiagnostic(request: textDocumentSlashdiagnostic): js.UndefOr[
    DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DiagnosticProviderShape]
  ] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidChange(request: textDocumentSlashdidChange): DidChangeTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidClose(request: textDocumentSlashdidClose): DidCloseTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidOpen(request: textDocumentSlashdidOpen): DidOpenTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidSave(request: textDocumentSlashdidSave): DidSaveTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentColor(request: textDocumentSlashdocumentColor): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentColorProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentHighlight(request: textDocumentSlashdocumentHighlight): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentHighlightProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentLink(request: textDocumentSlashdocumentLink): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentLinkProvider[DocumentLink]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentSymbol(request: textDocumentSlashdocumentSymbol): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentSymbolProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentfoldingRange(request: textDocumentSlashfoldingRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[FoldingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentformatting(request: textDocumentSlashformatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenthover(request: textDocumentSlashhover): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[HoverProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentimplementation(request: textDocumentSlashimplementation): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[ImplementationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentinlayHint(request: textDocumentSlashinlayHint): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[InlayHintsProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentinlineValue(request: textDocumentSlashinlineValue): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[InlineValueProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentlinkedEditingRange(request: textDocumentSlashlinkedEditingRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[LinkedEditingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentonTypeFormatting(request: textDocumentSlashonTypeFormatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[OnTypeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareCallHierarchy(request: textDocumentSlashprepareCallHierarchy): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CallHierarchyProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareTypeHierarchy(request: textDocumentSlashprepareTypeHierarchy): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[TypeHierarchyProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrangeFormatting(request: textDocumentSlashrangeFormatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentRangeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentreferences(request: textDocumentSlashreferences): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[ReferenceProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrename(request: textDocumentSlashrename): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[RenameProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentselectionRange(request: textDocumentSlashselectionRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SelectionRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsemanticTokens(request: textDocumentSlashsemanticTokens): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SemanticTokensProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsignatureHelp(request: textDocumentSlashsignatureHelp): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SignatureHelpProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenttypeDefinition(request: textDocumentSlashtypeDefinition): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSave(request: textDocumentSlashwillSave): DynamicFeature[TextDocumentRegistrationOptions] & (TextDocumentSendFeature[js.Function1[/* textDocument */ TextDocument, js.Promise[Unit]]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSaveWaitUntil(request: textDocumentSlashwillSaveWaitUntil): DynamicFeature[TextDocumentRegistrationOptions] & (TextDocumentSendFeature[
    js.Function1[/* textDocument */ TextDocument, ProviderResult[js.Array[TextEdit]]]
  ]) = js.native
  @JSName("getFeature")
  def getFeature_workspacedidCreateFiles(request: workspaceSlashdidCreateFiles): DynamicFeatureFileOperati = js.native
  @JSName("getFeature")
  def getFeature_workspacedidDeleteFiles(request: workspaceSlashdidDeleteFiles): DynamicFeatureFileOperatiFillClientCapabilities = js.native
  @JSName("getFeature")
  def getFeature_workspacedidRenameFiles(request: workspaceSlashdidRenameFiles): DynamicFeatureFileOperatiDispose = js.native
  @JSName("getFeature")
  def getFeature_workspacesymbol(request: workspaceSlashsymbol): DynamicFeature[TextDocumentRegistrationOptions] & WorkspaceProviderFeature[WorkspaceSymbolProvider[SymbolInformation]] = js.native
  @JSName("getFeature")
  def getFeature_workspacewillCreateFiles(request: workspaceSlashwillCreateFiles): DynamicFeatureFileOperatiFillInitializeParams = js.native
  @JSName("getFeature")
  def getFeature_workspacewillDeleteFiles(request: workspaceSlashwillDeleteFiles): DynamicFeatureFileOperatiInitialize = js.native
  @JSName("getFeature")
  def getFeature_workspacewillRenameFiles(request: workspaceSlashwillRenameFiles): DynamicFeatureFileOperatiGetState = js.native
  
  def handleFailedRequest[T](`type`: MessageSignature, token: Unit, error: Any, defaultValue: T): T = js.native
  def handleFailedRequest[T](`type`: MessageSignature, token: Unit, error: Any, defaultValue: T, showNotification: Boolean): T = js.native
  def handleFailedRequest[T](`type`: MessageSignature, token: CancellationToken, error: Any, defaultValue: T): T = js.native
  def handleFailedRequest[T](
    `type`: MessageSignature,
    token: CancellationToken,
    error: Any,
    defaultValue: T,
    showNotification: Boolean
  ): T = js.native
  
  def hasDedicatedTextSynchronizationFeature(textDocument: TextDocument): Boolean = js.native
  
  def info(message: String): Unit = js.native
  def info(message: String, data: Any): Unit = js.native
  def info(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def info(message: String, data: Unit, showNotification: Boolean): Unit = js.native
  
  def isRunning(): Boolean = js.native
  
  var middleware: M = js.native
  
  def onNotification(method: String, handler: GenericNotificationHandler): Disposable = js.native
  def onNotification(`type`: NotificationType0, handler: NotificationHandler0): Disposable = js.native
  def onNotification[P](`type`: NotificationType[P], handler: NotificationHandler[P]): Disposable = js.native
  def onNotification[RO](`type`: ProtocolNotificationType0[RO], handler: NotificationHandler0): Disposable = js.native
  def onNotification[P, RO](`type`: ProtocolNotificationType[P, RO], handler: NotificationHandler[P]): Disposable = js.native
  
  def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
  def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
  
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Disposable = js.native
  def onRequest[R, E](`type`: RequestType0[R, E], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P, R, E](`type`: RequestType[P, R, E], handler: RequestHandler[P, R, E]): Disposable = js.native
  def onRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], handler: RequestHandler[P, R, E]): Disposable = js.native
  
  var protocol2CodeConverter: typings.vscodeLanguageclient.protocolConverterMod.Converter = js.native
  
  def sendNotification(method: String): js.Promise[Unit] = js.native
  def sendNotification(method: String, params: Any): js.Promise[Unit] = js.native
  def sendNotification(`type`: NotificationType0): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P]): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P], params: P): js.Promise[Unit] = js.native
  def sendNotification[RO](`type`: ProtocolNotificationType0[RO]): js.Promise[Unit] = js.native
  def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO]): js.Promise[Unit] = js.native
  def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO], params: P): js.Promise[Unit] = js.native
  
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: Any, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E]): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P, token: CancellationToken): js.Promise[R] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  def stop(): js.Promise[Unit] = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, data: Any): Unit = js.native
  def warn(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def warn(message: String, data: Unit, showNotification: Boolean): Unit = js.native
}
