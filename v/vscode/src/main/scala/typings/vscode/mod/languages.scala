package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languages {
  
  @JSImport("vscode", "languages.createDiagnosticCollection")
  @js.native
  def createDiagnosticCollection(): DiagnosticCollection = js.native
  @JSImport("vscode", "languages.createDiagnosticCollection")
  @js.native
  def createDiagnosticCollection(name: String): DiagnosticCollection = js.native
  
  @JSImport("vscode", "languages.getDiagnostics")
  @js.native
  def getDiagnostics(): js.Array[js.Tuple2[Uri, js.Array[Diagnostic]]] = js.native
  @JSImport("vscode", "languages.getDiagnostics")
  @js.native
  def getDiagnostics(resource: Uri): js.Array[Diagnostic] = js.native
  
  @JSImport("vscode", "languages.getLanguages")
  @js.native
  def getLanguages(): Thenable[js.Array[String]] = js.native
  
  @JSImport("vscode", "languages.onDidChangeDiagnostics")
  @js.native
  val onDidChangeDiagnostics: Event[DiagnosticChangeEvent] = js.native
  
  @JSImport("vscode", "languages.registerCallHierarchyProvider")
  @js.native
  def registerCallHierarchyProvider(selector: DocumentSelector, provider: CallHierarchyProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerCodeActionsProvider")
  @js.native
  def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider[CodeAction]): Disposable = js.native
  @JSImport("vscode", "languages.registerCodeActionsProvider")
  @js.native
  def registerCodeActionsProvider(
    selector: DocumentSelector,
    provider: CodeActionProvider[CodeAction],
    metadata: CodeActionProviderMetadata
  ): Disposable = js.native
  
  @JSImport("vscode", "languages.registerCodeLensProvider")
  @js.native
  def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider[CodeLens]): Disposable = js.native
  
  @JSImport("vscode", "languages.registerColorProvider")
  @js.native
  def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerCompletionItemProvider")
  @js.native
  def registerCompletionItemProvider(
    selector: DocumentSelector,
    provider: CompletionItemProvider[CompletionItem],
    triggerCharacters: String*
  ): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDeclarationProvider")
  @js.native
  def registerDeclarationProvider(selector: DocumentSelector, provider: DeclarationProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDefinitionProvider")
  @js.native
  def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentFormattingEditProvider")
  @js.native
  def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentHighlightProvider")
  @js.native
  def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentLinkProvider")
  @js.native
  def registerDocumentLinkProvider(selector: DocumentSelector, provider: DocumentLinkProvider[DocumentLink]): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentRangeFormattingEditProvider")
  @js.native
  def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentRangeSemanticTokensProvider")
  @js.native
  def registerDocumentRangeSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentRangeSemanticTokensProvider,
    legend: SemanticTokensLegend
  ): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentSemanticTokensProvider")
  @js.native
  def registerDocumentSemanticTokensProvider(selector: DocumentSelector, provider: DocumentSemanticTokensProvider, legend: SemanticTokensLegend): Disposable = js.native
  
  @JSImport("vscode", "languages.registerDocumentSymbolProvider")
  @js.native
  def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): Disposable = js.native
  @JSImport("vscode", "languages.registerDocumentSymbolProvider")
  @js.native
  def registerDocumentSymbolProvider(
    selector: DocumentSelector,
    provider: DocumentSymbolProvider,
    metaData: DocumentSymbolProviderMetadata
  ): Disposable = js.native
  
  @JSImport("vscode", "languages.registerEvaluatableExpressionProvider")
  @js.native
  def registerEvaluatableExpressionProvider(selector: DocumentSelector, provider: EvaluatableExpressionProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerFoldingRangeProvider")
  @js.native
  def registerFoldingRangeProvider(selector: DocumentSelector, provider: FoldingRangeProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerHoverProvider")
  @js.native
  def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerImplementationProvider")
  @js.native
  def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerOnTypeFormattingEditProvider")
  @js.native
  def registerOnTypeFormattingEditProvider(
    selector: DocumentSelector,
    provider: OnTypeFormattingEditProvider,
    firstTriggerCharacter: String,
    moreTriggerCharacter: String*
  ): Disposable = js.native
  
  @JSImport("vscode", "languages.registerReferenceProvider")
  @js.native
  def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerRenameProvider")
  @js.native
  def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerSelectionRangeProvider")
  @js.native
  def registerSelectionRangeProvider(selector: DocumentSelector, provider: SelectionRangeProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerSignatureHelpProvider")
  @js.native
  def registerSignatureHelpProvider(
    selector: DocumentSelector,
    provider: SignatureHelpProvider,
    metadata: SignatureHelpProviderMetadata
  ): Disposable = js.native
  @JSImport("vscode", "languages.registerSignatureHelpProvider")
  @js.native
  def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): Disposable = js.native
  
  @JSImport("vscode", "languages.registerTypeDefinitionProvider")
  @js.native
  def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): Disposable = js.native
  
  @JSImport("vscode", "languages.registerWorkspaceSymbolProvider")
  @js.native
  def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider[SymbolInformation]): Disposable = js.native
  
  @JSImport("vscode", "languages.setLanguageConfiguration")
  @js.native
  def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): Disposable = js.native
  
  @JSImport("vscode", "languages.setTextDocumentLanguage")
  @js.native
  def setTextDocumentLanguage(document: TextDocument, languageId: String): Thenable[TextDocument] = js.native
  
  @JSImport("vscode", "languages.match")
  @js.native
  def `match`(selector: DocumentSelector, document: TextDocument): Double = js.native
}
