package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languages {
  
  @JSImport("vscode", "languages")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDiagnosticCollection(): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")().asInstanceOf[DiagnosticCollection]
  inline def createDiagnosticCollection(name: String): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")(name.asInstanceOf[js.Any]).asInstanceOf[DiagnosticCollection]
  
  inline def createLanguageStatusItem(id: String, selector: DocumentSelector): LanguageStatusItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageStatusItem")(id.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[LanguageStatusItem]
  
  inline def getDiagnostics(): js.Array[js.Tuple2[Uri, js.Array[Diagnostic]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")().asInstanceOf[js.Array[js.Tuple2[Uri, js.Array[Diagnostic]]]]
  inline def getDiagnostics(resource: Uri): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  
  inline def getLanguages(): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[Thenable[js.Array[String]]]
  
  inline def `match`(selector: DocumentSelector, document: TextDocument): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(selector.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("vscode", "languages.onDidChangeDiagnostics")
  @js.native
  val onDidChangeDiagnostics: Event[DiagnosticChangeEvent] = js.native
  
  inline def registerCallHierarchyProvider(selector: DocumentSelector, provider: CallHierarchyProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider[CodeAction]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerCodeActionsProvider(
    selector: DocumentSelector,
    provider: CodeActionProvider[CodeAction],
    metadata: CodeActionProviderMetadata
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider[CodeLens]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerCompletionItemProvider(
    selector: DocumentSelector,
    provider: CompletionItemProvider[CompletionItem],
    triggerCharacters: String*
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Disposable]
  
  inline def registerDeclarationProvider(selector: DocumentSelector, provider: DeclarationProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentDropEditProvider(selector: DocumentSelector, provider: DocumentDropEditProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentDropEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentLinkProvider(selector: DocumentSelector, provider: DocumentLinkProvider[DocumentLink]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentLinkProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentRangeSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentRangeSemanticTokensProvider,
    legend: SemanticTokensLegend
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentSemanticTokensProvider(selector: DocumentSelector, provider: DocumentSemanticTokensProvider, legend: SemanticTokensLegend): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerDocumentSymbolProvider(
    selector: DocumentSelector,
    provider: DocumentSymbolProvider,
    metaData: DocumentSymbolProviderMetadata
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metaData.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerEvaluatableExpressionProvider(selector: DocumentSelector, provider: EvaluatableExpressionProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEvaluatableExpressionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerFoldingRangeProvider(selector: DocumentSelector, provider: FoldingRangeProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerInlayHintsProvider(selector: DocumentSelector, provider: InlayHintsProvider[InlayHint]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlayHintsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerInlineCompletionItemProvider(selector: DocumentSelector, provider: InlineCompletionItemProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineCompletionItemProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerInlineValuesProvider(selector: DocumentSelector, provider: InlineValuesProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineValuesProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerLinkedEditingRangeProvider(selector: DocumentSelector, provider: LinkedEditingRangeProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerOnTypeFormattingEditProvider(
    selector: DocumentSelector,
    provider: OnTypeFormattingEditProvider,
    firstTriggerCharacter: String,
    moreTriggerCharacter: String*
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], firstTriggerCharacter.asInstanceOf[js.Any])).`++`(moreTriggerCharacter.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Disposable]
  
  inline def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerSelectionRangeProvider(selector: DocumentSelector, provider: SelectionRangeProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerSignatureHelpProvider(
    selector: DocumentSelector,
    provider: SignatureHelpProvider,
    metadata: SignatureHelpProviderMetadata
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")((List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Disposable]
  
  inline def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerTypeHierarchyProvider(selector: DocumentSelector, provider: TypeHierarchyProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider[SymbolInformation]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWorkspaceSymbolProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(language.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  inline def setTextDocumentLanguage(document: TextDocument, languageId: String): Thenable[TextDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextDocumentLanguage")(document.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextDocument]]
}
