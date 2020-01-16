package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.CompletionList
import typings.vscode.vscodeMod.Declaration
import typings.vscode.vscodeMod.Definition
import typings.vscode.vscodeMod.DiagnosticSeverity
import typings.vscode.vscodeMod.DocumentHighlightKind
import typings.vscode.vscodeMod.FoldingRangeKind
import typings.vscode.vscodeMod.Location
import typings.vscode.vscodeMod.LocationLink
import typings.vscode.vscodeMod.Uri
import typings.vscodeDashLanguageclient.libProtocolCompletionItemMod.default
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Color
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DeclarationLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DefinitionLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Hover
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ParameterInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureHelp
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
@js.native
object libProtocolConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
    def asCodeAction(item: CodeAction): js.UndefOr[typings.vscode.vscodeMod.CodeAction] = js.native
    def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKind(item: CodeActionKind): js.UndefOr[typings.vscode.vscodeMod.CodeActionKind] = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_CodeActionKind(item: CodeActionKind): typings.vscode.vscodeMod.CodeActionKind = js.native
    def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKinds(item: js.Array[CodeActionKind]): js.UndefOr[js.Array[typings.vscode.vscodeMod.CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[CodeActionKind]): js.Array[typings.vscode.vscodeMod.CodeActionKind] = js.native
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: CodeAction): typings.vscode.vscodeMod.CodeAction = js.native
    def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLens(item: CodeLens): js.UndefOr[typings.vscode.vscodeMod.CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_CodeLens(item: CodeLens): typings.vscode.vscodeMod.CodeLens = js.native
    def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLenses(items: js.Array[CodeLens]): js.UndefOr[js.Array[typings.vscode.vscodeMod.CodeLens]] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Array(items: js.Array[CodeLens]): js.Array[typings.vscode.vscodeMod.CodeLens] = js.native
    def asColor(color: Color): typings.vscode.vscodeMod.Color = js.native
    def asColorInformation(ci: ColorInformation): typings.vscode.vscodeMod.ColorInformation = js.native
    def asColorInformations(): js.UndefOr[scala.Nothing] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typings.vscode.vscodeMod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Array(): js.Array[typings.vscode.vscodeMod.ColorInformation] = js.native
    def asColorPresentation(cp: ColorPresentation): typings.vscode.vscodeMod.ColorPresentation = js.native
    def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.UndefOr[scala.Nothing] = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Array(colorPresentations: js.Array[ColorPresentation]): js.Array[typings.vscode.vscodeMod.ColorPresentation] = js.native
    def asCommand(item: Command): typings.vscode.vscodeMod.Command = js.native
    def asCommands(): js.UndefOr[scala.Nothing] = js.native
    def asCommands(items: js.Array[Command]): js.UndefOr[js.Array[typings.vscode.vscodeMod.Command]] = js.native
    @JSName("asCommands")
    def asCommands_Array(items: js.Array[Command]): js.Array[typings.vscode.vscodeMod.Command] = js.native
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.UndefOr[js.Array[typings.vscode.vscodeMod.CompletionItem] | CompletionList] = js.native
    def asCompletionResult(
      result: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
    ): js.UndefOr[js.Array[typings.vscode.vscodeMod.CompletionItem] | CompletionList] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Array(result: js.Array[CompletionItem]): js.Array[typings.vscode.vscodeMod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_CompletionList(
      result: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
    ): CompletionList = js.native
    def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Array(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.UndefOr[Definition | js.Array[typings.vscode.vscodeMod.DefinitionLink]] = js.native
    def asDefinitionResult(item: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Definition): js.UndefOr[Definition | js.Array[typings.vscode.vscodeMod.DefinitionLink]] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Array(item: js.Array[DefinitionLink]): js.Array[typings.vscode.vscodeMod.DefinitionLink] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Definition(item: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Definition): Definition = js.native
    def asDiagnostic(diagnostic: Diagnostic): typings.vscode.vscodeMod.Diagnostic = js.native
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typings.vscode.vscodeMod.Diagnostic] = js.native
    def asDocumentHighlight(item: DocumentHighlight): typings.vscode.vscodeMod.DocumentHighlight = js.native
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typings.vscode.vscodeMod.DocumentHighlight]] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Array(values: js.Array[DocumentHighlight]): js.Array[typings.vscode.vscodeMod.DocumentHighlight] = js.native
    def asDocumentLink(item: DocumentLink): typings.vscode.vscodeMod.DocumentLink = js.native
    def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typings.vscode.vscodeMod.DocumentLink]] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Array(items: js.Array[DocumentLink]): js.Array[typings.vscode.vscodeMod.DocumentLink] = js.native
    def asDocumentSymbol(value: DocumentSymbol): typings.vscode.vscodeMod.DocumentSymbol = js.native
    def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typings.vscode.vscodeMod.DocumentSymbol]] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Array(value: js.Array[DocumentSymbol]): js.Array[typings.vscode.vscodeMod.DocumentSymbol] = js.native
    def asFoldingRange(r: FoldingRange): typings.vscode.vscodeMod.FoldingRange = js.native
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typings.vscode.vscodeMod.FoldingRange]] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Array(foldingRanges: js.Array[FoldingRange]): js.Array[typings.vscode.vscodeMod.FoldingRange] = js.native
    def asHover(): js.UndefOr[scala.Nothing] = js.native
    def asHover(hover: Hover): js.UndefOr[typings.vscode.vscodeMod.Hover] = js.native
    @JSName("asHover")
    def asHover_Hover(hover: Hover): typings.vscode.vscodeMod.Hover = js.native
    def asLocation(): js.UndefOr[scala.Nothing] = js.native
    def asLocation(item: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Location(item: typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location): Location = js.native
    def asParameterInformation(item: ParameterInformation): typings.vscode.vscodeMod.ParameterInformation = js.native
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typings.vscode.vscodeMod.ParameterInformation] = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[typings.vscode.vscodeMod.Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typings.vscode.vscodeMod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[typings.vscode.vscodeMod.Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typings.vscode.vscodeMod.Range = js.native
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(
      values: js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
        ]
    ): js.UndefOr[js.Array[Location]] = js.native
    @JSName("asReferences")
    def asReferences_Array(
      values: js.Array[
          typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
        ]
    ): js.Array[Location] = js.native
    def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
    def asSignatureHelp(item: SignatureHelp): js.UndefOr[typings.vscode.vscodeMod.SignatureHelp] = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_SignatureHelp(item: SignatureHelp): typings.vscode.vscodeMod.SignatureHelp = js.native
    def asSignatureInformation(item: SignatureInformation): typings.vscode.vscodeMod.SignatureInformation = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typings.vscode.vscodeMod.SignatureInformation] = js.native
    def asSymbolInformation(item: SymbolInformation): typings.vscode.vscodeMod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typings.vscode.vscodeMod.SymbolInformation = js.native
    def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.UndefOr[scala.Nothing], uri: Uri): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typings.vscode.vscodeMod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typings.vscode.vscodeMod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[scala.Nothing] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation]): js.Array[typings.vscode.vscodeMod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation], uri: Uri): js.Array[typings.vscode.vscodeMod.SymbolInformation] = js.native
    def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdit(edit: TextEdit): js.UndefOr[typings.vscode.vscodeMod.TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_TextEdit(edit: TextEdit): typings.vscode.vscodeMod.TextEdit = js.native
    def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdits(items: js.Array[TextEdit]): js.UndefOr[js.Array[typings.vscode.vscodeMod.TextEdit]] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Array(items: js.Array[TextEdit]): js.Array[typings.vscode.vscodeMod.TextEdit] = js.native
    def asUri(value: String): Uri = js.native
    def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): js.UndefOr[typings.vscode.vscodeMod.WorkspaceEdit] = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_WorkspaceEdit(item: WorkspaceEdit): typings.vscode.vscodeMod.WorkspaceEdit = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ String, Uri]
}

