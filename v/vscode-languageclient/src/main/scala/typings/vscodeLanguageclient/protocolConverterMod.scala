package typings.vscodeLanguageclient

import typings.vscode.mod.CodeAction
import typings.vscode.mod.CodeActionKind
import typings.vscode.mod.CodeLens
import typings.vscode.mod.CompletionList
import typings.vscode.mod.Declaration
import typings.vscode.mod.Definition
import typings.vscode.mod.DefinitionLink
import typings.vscode.mod.DiagnosticSeverity
import typings.vscode.mod.DocumentHighlightKind
import typings.vscode.mod.FoldingRangeKind
import typings.vscode.mod.Hover
import typings.vscode.mod.Location
import typings.vscode.mod.LocationLink
import typings.vscode.mod.Position
import typings.vscode.mod.Range
import typings.vscode.mod.SignatureHelp
import typings.vscode.mod.TextEdit
import typings.vscode.mod.Uri
import typings.vscode.mod.WorkspaceEdit
import typings.vscodeLanguageclient.protocolCompletionItemMod.default
import typings.vscodeLanguageserverTypes.mod.Color
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import typings.vscodeLanguageserverTypes.mod.Command
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import typings.vscodeLanguageserverTypes.mod.DeclarationLink
import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import typings.vscodeLanguageserverTypes.mod.DocumentHighlight
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import typings.vscodeLanguageserverTypes.mod.DocumentSymbol
import typings.vscodeLanguageserverTypes.mod.FoldingRange
import typings.vscodeLanguageserverTypes.mod.ParameterInformation
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import typings.vscodeLanguageserverTypes.mod.SignatureInformation
import typings.vscodeLanguageserverTypes.mod.SymbolInformation
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolConverterMod {
  
  @JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createConverter(): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")().asInstanceOf[Converter]
  @scala.inline
  def createConverter(uriConverter: URIConverter): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")(uriConverter.asInstanceOf[js.Any]).asInstanceOf[Converter]
  
  @js.native
  trait Converter extends StObject {
    
    def asCodeAction(): js.UndefOr[CodeAction] = js.native
    def asCodeAction(item: typings.vscodeLanguageserverTypes.mod.CodeAction): js.UndefOr[CodeAction] = js.native
    
    def asCodeActionKind(): js.UndefOr[CodeActionKind] = js.native
    def asCodeActionKind(item: typings.vscodeLanguageserverTypes.mod.CodeActionKind): js.UndefOr[CodeActionKind] = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_CodeActionKind(item: typings.vscodeLanguageserverTypes.mod.CodeActionKind): CodeActionKind = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_Unit(): Unit = js.native
    
    def asCodeActionKinds(): js.UndefOr[js.Array[CodeActionKind]] = js.native
    def asCodeActionKinds(item: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): js.UndefOr[js.Array[CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): js.Array[CodeActionKind] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Unit(): Unit = js.native
    
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: typings.vscodeLanguageserverTypes.mod.CodeAction): CodeAction = js.native
    @JSName("asCodeAction")
    def asCodeAction_Unit(): Unit = js.native
    
    def asCodeLens(): js.UndefOr[CodeLens] = js.native
    def asCodeLens(item: typings.vscodeLanguageserverTypes.mod.CodeLens): CodeLens = js.native
    @JSName("asCodeLens")
    def asCodeLens_Union(item: typings.vscodeLanguageserverTypes.mod.CodeLens): js.UndefOr[CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_Unit(): Unit = js.native
    
    def asCodeLenses(): js.UndefOr[js.Array[CodeLens]] = js.native
    def asCodeLenses(items: js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens]): js.UndefOr[js.Array[CodeLens]] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Array(items: js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens]): js.Array[CodeLens] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Unit(): Unit = js.native
    
    def asColor(color: Color): typings.vscode.mod.Color = js.native
    
    def asColorInformation(ci: ColorInformation): typings.vscode.mod.ColorInformation = js.native
    
    def asColorInformations(): Unit = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typings.vscode.mod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Array(): js.Array[typings.vscode.mod.ColorInformation] = js.native
    
    def asColorPresentation(cp: ColorPresentation): typings.vscode.mod.ColorPresentation = js.native
    
    def asColorPresentations(): Unit = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): Unit = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Array(colorPresentations: js.Array[ColorPresentation]): js.Array[typings.vscode.mod.ColorPresentation] = js.native
    
    def asCommand(item: Command): typings.vscode.mod.Command = js.native
    
    def asCommands(): js.UndefOr[js.Array[typings.vscode.mod.Command]] = js.native
    def asCommands(items: js.Array[Command]): js.UndefOr[js.Array[typings.vscode.mod.Command]] = js.native
    @JSName("asCommands")
    def asCommands_Array(items: js.Array[Command]): js.Array[typings.vscode.mod.Command] = js.native
    @JSName("asCommands")
    def asCommands_Unit(): Unit = js.native
    
    def asCompletionItem(item: CompletionItem): default = js.native
    
    def asCompletionResult(): js.UndefOr[
        js.Array[typings.vscode.mod.CompletionItem] | CompletionList[typings.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.UndefOr[
        js.Array[typings.vscode.mod.CompletionItem] | CompletionList[typings.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(result: typings.vscodeLanguageserverTypes.mod.CompletionList): CompletionList[typings.vscode.mod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Array(result: js.Array[CompletionItem]): js.Array[typings.vscode.mod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Union(result: typings.vscodeLanguageserverTypes.mod.CompletionList): js.UndefOr[
        js.Array[typings.vscode.mod.CompletionItem] | CompletionList[typings.vscode.mod.CompletionItem]
      ] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Unit(): Unit = js.native
    
    def asDeclarationResult(): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: typings.vscodeLanguageserverTypes.mod.Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Array(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Unit(): Unit = js.native
    
    def asDefinitionResult(): js.UndefOr[Definition | js.Array[DefinitionLink]] = js.native
    def asDefinitionResult(item: js.Array[typings.vscodeLanguageserverTypes.mod.DefinitionLink]): js.UndefOr[Definition | js.Array[DefinitionLink]] = js.native
    def asDefinitionResult(item: typings.vscodeLanguageserverTypes.mod.Definition): Definition = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Array(item: js.Array[typings.vscodeLanguageserverTypes.mod.DefinitionLink]): js.Array[DefinitionLink] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Union(item: typings.vscodeLanguageserverTypes.mod.Definition): js.UndefOr[Definition | js.Array[DefinitionLink]] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Unit(): Unit = js.native
    
    def asDiagnostic(diagnostic: Diagnostic): typings.vscode.mod.Diagnostic = js.native
    
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    
    def asDiagnosticTag(tag: DiagnosticTag): js.UndefOr[typings.vscode.mod.DiagnosticTag] = js.native
    
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typings.vscode.mod.Diagnostic] = js.native
    
    def asDocumentHighlight(item: DocumentHighlight): typings.vscode.mod.DocumentHighlight = js.native
    
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    
    def asDocumentHighlights(): js.UndefOr[js.Array[typings.vscode.mod.DocumentHighlight]] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typings.vscode.mod.DocumentHighlight]] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Array(values: js.Array[DocumentHighlight]): js.Array[typings.vscode.mod.DocumentHighlight] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Unit(): Unit = js.native
    
    def asDocumentLink(item: DocumentLink): typings.vscode.mod.DocumentLink = js.native
    
    def asDocumentLinks(): js.UndefOr[js.Array[typings.vscode.mod.DocumentLink]] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typings.vscode.mod.DocumentLink]] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Array(items: js.Array[DocumentLink]): js.Array[typings.vscode.mod.DocumentLink] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Unit(): Unit = js.native
    
    def asDocumentSymbol(value: DocumentSymbol): typings.vscode.mod.DocumentSymbol = js.native
    
    def asDocumentSymbols(): js.UndefOr[js.Array[typings.vscode.mod.DocumentSymbol]] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typings.vscode.mod.DocumentSymbol]] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Array(value: js.Array[DocumentSymbol]): js.Array[typings.vscode.mod.DocumentSymbol] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Unit(): Unit = js.native
    
    def asFoldingRange(r: FoldingRange): typings.vscode.mod.FoldingRange = js.native
    
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    
    def asFoldingRanges(): js.UndefOr[js.Array[typings.vscode.mod.FoldingRange]] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typings.vscode.mod.FoldingRange]] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Array(foldingRanges: js.Array[FoldingRange]): js.Array[typings.vscode.mod.FoldingRange] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Unit(): Unit = js.native
    
    def asHover(): js.UndefOr[Hover] = js.native
    def asHover(hover: typings.vscodeLanguageserverTypes.mod.Hover): js.UndefOr[Hover] = js.native
    @JSName("asHover")
    def asHover_Hover(hover: typings.vscodeLanguageserverTypes.mod.Hover): Hover = js.native
    @JSName("asHover")
    def asHover_Unit(): Unit = js.native
    
    def asLocation(): js.UndefOr[Location] = js.native
    def asLocation(item: typings.vscodeLanguageserverTypes.mod.Location): Location = js.native
    @JSName("asLocation")
    def asLocation_Union(item: typings.vscodeLanguageserverTypes.mod.Location): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Unit(): Unit = js.native
    
    def asParameterInformation(item: ParameterInformation): typings.vscode.mod.ParameterInformation = js.native
    
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typings.vscode.mod.ParameterInformation] = js.native
    
    def asPosition(): js.UndefOr[Position] = js.native
    def asPosition(value: typings.vscodeLanguageserverTypes.mod.Position): js.UndefOr[Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: typings.vscodeLanguageserverTypes.mod.Position): Position = js.native
    @JSName("asPosition")
    def asPosition_Unit(): Unit = js.native
    
    def asRange(): js.UndefOr[Range] = js.native
    def asRange(value: typings.vscodeLanguageserverTypes.mod.Range): js.UndefOr[Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: typings.vscodeLanguageserverTypes.mod.Range): Range = js.native
    @JSName("asRange")
    def asRange_Unit(): Unit = js.native
    
    def asRanges(values: js.Array[typings.vscodeLanguageserverTypes.mod.Range]): js.Array[Range] = js.native
    
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(values: js.Array[typings.vscodeLanguageserverTypes.mod.Location]): js.UndefOr[js.Array[Location]] = js.native
    @JSName("asReferences")
    def asReferences_Array(values: js.Array[typings.vscodeLanguageserverTypes.mod.Location]): js.Array[Location] = js.native
    
    def asSelectionRange(selectionRange: SelectionRange): typings.vscode.mod.SelectionRange = js.native
    
    def asSelectionRanges(): js.UndefOr[js.Array[typings.vscode.mod.SelectionRange]] = js.native
    def asSelectionRanges(selectionRanges: js.Array[SelectionRange]): js.UndefOr[js.Array[typings.vscode.mod.SelectionRange]] = js.native
    @JSName("asSelectionRanges")
    def asSelectionRanges_Array(selectionRanges: js.Array[SelectionRange]): js.Array[typings.vscode.mod.SelectionRange] = js.native
    @JSName("asSelectionRanges")
    def asSelectionRanges_Unit(): Unit = js.native
    
    def asSignatureHelp(): js.UndefOr[SignatureHelp] = js.native
    def asSignatureHelp(item: typings.vscodeLanguageserverTypes.mod.SignatureHelp): SignatureHelp = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_Union(item: typings.vscodeLanguageserverTypes.mod.SignatureHelp): js.UndefOr[SignatureHelp] = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_Unit(): Unit = js.native
    
    def asSignatureInformation(item: SignatureInformation): typings.vscode.mod.SignatureInformation = js.native
    
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typings.vscode.mod.SignatureInformation] = js.native
    
    def asSymbolInformation(item: SymbolInformation): typings.vscode.mod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typings.vscode.mod.SymbolInformation = js.native
    
    def asSymbolInformations(): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Unit, uri: Uri): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation]): js.Array[typings.vscode.mod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation], uri: Uri): js.Array[typings.vscode.mod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Unit(): Unit = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Unit(values: Null, uri: Uri): Unit = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Unit(values: Unit, uri: Uri): Unit = js.native
    
    def asSymbolKind(item: SymbolKind): typings.vscode.mod.SymbolKind = js.native
    
    def asSymbolTag(item: SymbolTag): typings.vscode.mod.SymbolTag = js.native
    
    def asSymbolTags(): js.UndefOr[js.Array[typings.vscode.mod.SymbolTag]] = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.UndefOr[js.Array[typings.vscode.mod.SymbolTag]] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Array(items: js.Array[SymbolTag]): js.Array[typings.vscode.mod.SymbolTag] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Unit(): Unit = js.native
    
    def asTextEdit(): js.UndefOr[TextEdit] = js.native
    def asTextEdit(edit: typings.vscodeLanguageserverTypes.mod.TextEdit): js.UndefOr[TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_TextEdit(edit: typings.vscodeLanguageserverTypes.mod.TextEdit): TextEdit = js.native
    @JSName("asTextEdit")
    def asTextEdit_Unit(): Unit = js.native
    
    def asTextEdits(): js.UndefOr[js.Array[TextEdit]] = js.native
    def asTextEdits(items: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]): js.UndefOr[js.Array[TextEdit]] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Array(items: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]): js.Array[TextEdit] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Unit(): Unit = js.native
    
    def asUri(value: String): Uri = js.native
    
    def asWorkspaceEdit(): js.UndefOr[WorkspaceEdit] = js.native
    def asWorkspaceEdit(item: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): WorkspaceEdit = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_Union(item: typings.vscodeLanguageserverTypes.mod.WorkspaceEdit): js.UndefOr[WorkspaceEdit] = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_Unit(): Unit = js.native
  }
  
  type URIConverter = js.Function1[/* value */ String, Uri]
}
