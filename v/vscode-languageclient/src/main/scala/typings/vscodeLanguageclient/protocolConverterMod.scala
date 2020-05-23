package typings.vscodeLanguageclient

import typings.vscode.mod.CompletionList
import typings.vscode.mod.Declaration
import typings.vscode.mod.Definition
import typings.vscode.mod.DiagnosticSeverity
import typings.vscode.mod.DocumentHighlightKind
import typings.vscode.mod.FoldingRangeKind
import typings.vscode.mod.Location
import typings.vscode.mod.LocationLink
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.protocolCompletionItemMod.default
import typings.vscodeLanguageserverTypes.mod.CodeAction
import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import typings.vscodeLanguageserverTypes.mod.CodeLens
import typings.vscodeLanguageserverTypes.mod.Color
import typings.vscodeLanguageserverTypes.mod.ColorInformation
import typings.vscodeLanguageserverTypes.mod.ColorPresentation
import typings.vscodeLanguageserverTypes.mod.Command
import typings.vscodeLanguageserverTypes.mod.CompletionItem
import typings.vscodeLanguageserverTypes.mod.DeclarationLink
import typings.vscodeLanguageserverTypes.mod.DefinitionLink
import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import typings.vscodeLanguageserverTypes.mod.DocumentHighlight
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import typings.vscodeLanguageserverTypes.mod.DocumentSymbol
import typings.vscodeLanguageserverTypes.mod.FoldingRange
import typings.vscodeLanguageserverTypes.mod.Hover
import typings.vscodeLanguageserverTypes.mod.ParameterInformation
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.SelectionRange
import typings.vscodeLanguageserverTypes.mod.SignatureHelp
import typings.vscodeLanguageserverTypes.mod.SignatureInformation
import typings.vscodeLanguageserverTypes.mod.SymbolInformation
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import typings.vscodeLanguageserverTypes.mod.TextEdit
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
@js.native
object protocolConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
    def asCodeAction(item: CodeAction): js.UndefOr[typings.vscode.mod.CodeAction] = js.native
    def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKind(item: CodeActionKind): js.UndefOr[typings.vscode.mod.CodeActionKind] = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_CodeActionKind(item: CodeActionKind): typings.vscode.mod.CodeActionKind = js.native
    def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKinds(item: js.Array[CodeActionKind]): js.UndefOr[js.Array[typings.vscode.mod.CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[CodeActionKind]): js.Array[typings.vscode.mod.CodeActionKind] = js.native
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: CodeAction): typings.vscode.mod.CodeAction = js.native
    def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLens(item: CodeLens): typings.vscode.mod.CodeLens = js.native
    @JSName("asCodeLens")
    def asCodeLens_Union(item: CodeLens): js.UndefOr[typings.vscode.mod.CodeLens] = js.native
    def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLenses(items: js.Array[CodeLens]): js.UndefOr[js.Array[typings.vscode.mod.CodeLens]] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Array(items: js.Array[CodeLens]): js.Array[typings.vscode.mod.CodeLens] = js.native
    def asColor(color: Color): typings.vscode.mod.Color = js.native
    def asColorInformation(ci: ColorInformation): typings.vscode.mod.ColorInformation = js.native
    def asColorInformations(): js.UndefOr[scala.Nothing] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typings.vscode.mod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Array(): js.Array[typings.vscode.mod.ColorInformation] = js.native
    def asColorPresentation(cp: ColorPresentation): typings.vscode.mod.ColorPresentation = js.native
    def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.UndefOr[scala.Nothing] = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Array(colorPresentations: js.Array[ColorPresentation]): js.Array[typings.vscode.mod.ColorPresentation] = js.native
    def asCommand(item: Command): typings.vscode.mod.Command = js.native
    def asCommands(): js.UndefOr[scala.Nothing] = js.native
    def asCommands(items: js.Array[Command]): js.UndefOr[js.Array[typings.vscode.mod.Command]] = js.native
    @JSName("asCommands")
    def asCommands_Array(items: js.Array[Command]): js.Array[typings.vscode.mod.Command] = js.native
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.UndefOr[js.Array[typings.vscode.mod.CompletionItem] | CompletionList] = js.native
    def asCompletionResult(result: typings.vscodeLanguageserverTypes.mod.CompletionList): CompletionList = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Array(result: js.Array[CompletionItem]): js.Array[typings.vscode.mod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Union(result: typings.vscodeLanguageserverTypes.mod.CompletionList): js.UndefOr[js.Array[typings.vscode.mod.CompletionItem] | CompletionList] = js.native
    def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: typings.vscodeLanguageserverTypes.mod.Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Array(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.UndefOr[Definition | js.Array[typings.vscode.mod.DefinitionLink]] = js.native
    def asDefinitionResult(item: typings.vscodeLanguageserverTypes.mod.Definition): Definition = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Array(item: js.Array[DefinitionLink]): js.Array[typings.vscode.mod.DefinitionLink] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Union(item: typings.vscodeLanguageserverTypes.mod.Definition): js.UndefOr[Definition | js.Array[typings.vscode.mod.DefinitionLink]] = js.native
    def asDiagnostic(diagnostic: Diagnostic): typings.vscode.mod.Diagnostic = js.native
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    def asDiagnosticTag(tag: DiagnosticTag): js.UndefOr[typings.vscode.mod.DiagnosticTag] = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typings.vscode.mod.Diagnostic] = js.native
    def asDocumentHighlight(item: DocumentHighlight): typings.vscode.mod.DocumentHighlight = js.native
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typings.vscode.mod.DocumentHighlight]] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Array(values: js.Array[DocumentHighlight]): js.Array[typings.vscode.mod.DocumentHighlight] = js.native
    def asDocumentLink(item: DocumentLink): typings.vscode.mod.DocumentLink = js.native
    def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typings.vscode.mod.DocumentLink]] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Array(items: js.Array[DocumentLink]): js.Array[typings.vscode.mod.DocumentLink] = js.native
    def asDocumentSymbol(value: DocumentSymbol): typings.vscode.mod.DocumentSymbol = js.native
    def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typings.vscode.mod.DocumentSymbol]] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Array(value: js.Array[DocumentSymbol]): js.Array[typings.vscode.mod.DocumentSymbol] = js.native
    def asFoldingRange(r: FoldingRange): typings.vscode.mod.FoldingRange = js.native
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typings.vscode.mod.FoldingRange]] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Array(foldingRanges: js.Array[FoldingRange]): js.Array[typings.vscode.mod.FoldingRange] = js.native
    def asHover(): js.UndefOr[scala.Nothing] = js.native
    def asHover(hover: Hover): js.UndefOr[typings.vscode.mod.Hover] = js.native
    @JSName("asHover")
    def asHover_Hover(hover: Hover): typings.vscode.mod.Hover = js.native
    def asLocation(): js.UndefOr[scala.Nothing] = js.native
    def asLocation(item: typings.vscodeLanguageserverTypes.mod.Location): Location = js.native
    @JSName("asLocation")
    def asLocation_Union(item: typings.vscodeLanguageserverTypes.mod.Location): js.UndefOr[Location] = js.native
    def asParameterInformation(item: ParameterInformation): typings.vscode.mod.ParameterInformation = js.native
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typings.vscode.mod.ParameterInformation] = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[typings.vscode.mod.Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typings.vscode.mod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[typings.vscode.mod.Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typings.vscode.mod.Range = js.native
    def asRanges(values: js.Array[Range]): js.Array[typings.vscode.mod.Range] = js.native
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(values: js.Array[typings.vscodeLanguageserverTypes.mod.Location]): js.UndefOr[js.Array[Location]] = js.native
    @JSName("asReferences")
    def asReferences_Array(values: js.Array[typings.vscodeLanguageserverTypes.mod.Location]): js.Array[Location] = js.native
    def asSelectionRange(selectionRange: SelectionRange): typings.vscode.mod.SelectionRange = js.native
    def asSelectionRanges(): js.UndefOr[scala.Nothing] = js.native
    def asSelectionRanges(selectionRanges: js.Array[SelectionRange]): js.UndefOr[js.Array[typings.vscode.mod.SelectionRange]] = js.native
    @JSName("asSelectionRanges")
    def asSelectionRanges_Array(selectionRanges: js.Array[SelectionRange]): js.Array[typings.vscode.mod.SelectionRange] = js.native
    def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
    def asSignatureHelp(item: SignatureHelp): typings.vscode.mod.SignatureHelp = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_Union(item: SignatureHelp): js.UndefOr[typings.vscode.mod.SignatureHelp] = js.native
    def asSignatureInformation(item: SignatureInformation): typings.vscode.mod.SignatureInformation = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typings.vscode.mod.SignatureInformation] = js.native
    def asSymbolInformation(item: SymbolInformation): typings.vscode.mod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typings.vscode.mod.SymbolInformation = js.native
    def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typings.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[scala.Nothing] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation]): js.Array[typings.vscode.mod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation], uri: Uri): js.Array[typings.vscode.mod.SymbolInformation] = js.native
    def asSymbolKind(item: SymbolKind): typings.vscode.mod.SymbolKind = js.native
    def asSymbolTag(item: SymbolTag): typings.vscode.mod.SymbolTag = js.native
    def asSymbolTags(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.UndefOr[js.Array[typings.vscode.mod.SymbolTag]] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Array(items: js.Array[SymbolTag]): js.Array[typings.vscode.mod.SymbolTag] = js.native
    def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdit(edit: TextEdit): js.UndefOr[typings.vscode.mod.TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_TextEdit(edit: TextEdit): typings.vscode.mod.TextEdit = js.native
    def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdits(items: js.Array[TextEdit]): js.UndefOr[js.Array[typings.vscode.mod.TextEdit]] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Array(items: js.Array[TextEdit]): js.Array[typings.vscode.mod.TextEdit] = js.native
    def asUri(value: String): Uri = js.native
    def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): typings.vscode.mod.WorkspaceEdit = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_Union(item: WorkspaceEdit): js.UndefOr[typings.vscode.mod.WorkspaceEdit] = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ String, Uri]
}

