package typings
package vscodeDashLanguageclientLib.libProtocolConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
  def asCodeAction(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction): js.UndefOr[vscodeLib.vscodeMod.CodeAction] = js.native
  def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
  def asCodeActionKind(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind): vscodeLib.vscodeMod.CodeActionKind = js.native
  @JSName("asCodeActionKind")
  def asCodeActionKind_UndefOr(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind): js.UndefOr[vscodeLib.vscodeMod.CodeActionKind] = js.native
  def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
  def asCodeActionKinds(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): js.Array[vscodeLib.vscodeMod.CodeActionKind] = js.native
  @JSName("asCodeActionKinds")
  def asCodeActionKinds_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.CodeActionKind]] = js.native
  @JSName("asCodeAction")
  def asCodeAction_CodeAction(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction): vscodeLib.vscodeMod.CodeAction = js.native
  def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
  def asCodeLens(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens): js.UndefOr[vscodeLib.vscodeMod.CodeLens] = js.native
  @JSName("asCodeLens")
  def asCodeLens_CodeLens(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens): vscodeLib.vscodeMod.CodeLens = js.native
  def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
  def asCodeLenses(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens
    ]
  ): js.Array[vscodeLib.vscodeMod.CodeLens] = js.native
  @JSName("asCodeLenses")
  def asCodeLenses_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.CodeLens]] = js.native
  def asColor(color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color): vscodeLib.vscodeMod.Color = js.native
  def asColorInformation(ci: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation): vscodeLib.vscodeMod.ColorInformation = js.native
  def asColorInformations(): js.Array[vscodeLib.vscodeMod.ColorInformation] = js.native
  def asColorInformations(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation
    ]
  ): js.Array[vscodeLib.vscodeMod.ColorInformation] = js.native
  @JSName("asColorInformations")
  def asColorInformations_UndefOr(): js.UndefOr[scala.Nothing] = js.native
  def asColorPresentation(cp: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation): vscodeLib.vscodeMod.ColorPresentation = js.native
  def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
  def asColorPresentations(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation
    ]
  ): js.Array[vscodeLib.vscodeMod.ColorPresentation] = js.native
  @JSName("asColorPresentations")
  def asColorPresentations_UndefOr(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation
    ]
  ): js.UndefOr[scala.Nothing] = js.native
  def asCommand(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command): vscodeLib.vscodeMod.Command = js.native
  def asCommands(): js.UndefOr[scala.Nothing] = js.native
  def asCommands(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command
    ]
  ): js.Array[vscodeLib.vscodeMod.Command] = js.native
  @JSName("asCommands")
  def asCommands_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.Command]] = js.native
  def asCompletionItem(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem): vscodeDashLanguageclientLib.libProtocolCompletionItemMod.default = js.native
  def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
  def asCompletionResult(
    result: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]
  ): js.Array[vscodeLib.vscodeMod.CompletionItem] = js.native
  def asCompletionResult(result: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList): js.UndefOr[
    js.Array[vscodeLib.vscodeMod.CompletionItem] | vscodeLib.vscodeMod.CompletionList
  ] = js.native
  @JSName("asCompletionResult")
  def asCompletionResult_CompletionList(result: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList): vscodeLib.vscodeMod.CompletionList = js.native
  @JSName("asCompletionResult")
  def asCompletionResult_UndefOr(
    result: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]
  ): js.UndefOr[
    js.Array[vscodeLib.vscodeMod.CompletionItem] | vscodeLib.vscodeMod.CompletionList
  ] = js.native
  def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
  def asDeclarationResult(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DeclarationLink
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify code.LocationLink */ _
  ] = js.native
  def asDeclarationResult(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Declaration): vscodeLib.vscodeMod.Location | js.Array[vscodeLib.vscodeMod.Location] = js.native
  @JSName("asDeclarationResult")
  def asDeclarationResult_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DeclarationLink
    ]
  ): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify code.Declaration */ _
  ] = js.native
  @JSName("asDeclarationResult")
  def asDeclarationResult_UndefOr(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Declaration): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify code.Declaration */ _
  ] = js.native
  def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
  def asDefinitionResult(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DefinitionLink
    ]
  ): js.Array[vscodeLib.vscodeMod.DefinitionLink] = js.native
  def asDefinitionResult(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition): js.UndefOr[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]] = js.native
  @JSName("asDefinitionResult")
  def asDefinitionResult_Definition(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition): vscodeLib.vscodeMod.Definition = js.native
  @JSName("asDefinitionResult")
  def asDefinitionResult_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DefinitionLink
    ]
  ): js.UndefOr[vscodeLib.vscodeMod.Definition | js.Array[vscodeLib.vscodeMod.DefinitionLink]] = js.native
  def asDiagnostic(diagnostic: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic): vscodeLib.vscodeMod.Diagnostic = js.native
  def asDiagnosticSeverity(): vscodeLib.vscodeMod.DiagnosticSeverity = js.native
  def asDiagnosticSeverity(value: scala.Double): vscodeLib.vscodeMod.DiagnosticSeverity = js.native
  def asDiagnostics(
    diagnostics: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
    ]
  ): js.Array[vscodeLib.vscodeMod.Diagnostic] = js.native
  def asDocumentHighlight(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight): vscodeLib.vscodeMod.DocumentHighlight = js.native
  def asDocumentHighlightKind(item: scala.Double): vscodeLib.vscodeMod.DocumentHighlightKind = js.native
  def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentHighlights(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
    ]
  ): js.Array[vscodeLib.vscodeMod.DocumentHighlight] = js.native
  @JSName("asDocumentHighlights")
  def asDocumentHighlights_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.DocumentHighlight]] = js.native
  def asDocumentLink(item: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink): vscodeLib.vscodeMod.DocumentLink = js.native
  def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentLinks(
    items: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink
    ]
  ): js.Array[vscodeLib.vscodeMod.DocumentLink] = js.native
  @JSName("asDocumentLinks")
  def asDocumentLinks_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.DocumentLink]] = js.native
  def asDocumentSymbol(
    value: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
  ): vscodeLib.vscodeMod.DocumentSymbol = js.native
  def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentSymbols(
    value: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
    ]
  ): js.Array[vscodeLib.vscodeMod.DocumentSymbol] = js.native
  @JSName("asDocumentSymbols")
  def asDocumentSymbols_UndefOr(
    value: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.DocumentSymbol]] = js.native
  def asFoldingRange(r: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange): vscodeLib.vscodeMod.FoldingRange = js.native
  def asFoldingRangeKind(): js.UndefOr[vscodeLib.vscodeMod.FoldingRangeKind] = js.native
  def asFoldingRangeKind(kind: java.lang.String): js.UndefOr[vscodeLib.vscodeMod.FoldingRangeKind] = js.native
  def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
  def asFoldingRanges(
    foldingRanges: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange
    ]
  ): js.Array[vscodeLib.vscodeMod.FoldingRange] = js.native
  @JSName("asFoldingRanges")
  def asFoldingRanges_UndefOr(
    foldingRanges: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.FoldingRange]] = js.native
  def asHover(): js.UndefOr[scala.Nothing] = js.native
  def asHover(hover: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Hover): js.UndefOr[vscodeLib.vscodeMod.Hover] = js.native
  @JSName("asHover")
  def asHover_Hover(hover: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Hover): vscodeLib.vscodeMod.Hover = js.native
  def asLocation(): js.UndefOr[scala.Nothing] = js.native
  def asLocation(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location): vscodeLib.vscodeMod.Location = js.native
  @JSName("asLocation")
  def asLocation_UndefOr(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location): js.UndefOr[vscodeLib.vscodeMod.Location] = js.native
  def asParameterInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ParameterInformation
  ): vscodeLib.vscodeMod.ParameterInformation = js.native
  def asParameterInformations(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ParameterInformation
    ]
  ): js.Array[vscodeLib.vscodeMod.ParameterInformation] = js.native
  def asPosition(): js.UndefOr[scala.Nothing] = js.native
  def asPosition(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position): vscodeLib.vscodeMod.Position = js.native
  @JSName("asPosition")
  def asPosition_UndefOr(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position): js.UndefOr[vscodeLib.vscodeMod.Position] = js.native
  def asRange(): js.UndefOr[scala.Nothing] = js.native
  def asRange(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): js.UndefOr[vscodeLib.vscodeMod.Range] = js.native
  @JSName("asRange")
  def asRange_Range(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): vscodeLib.vscodeMod.Range = js.native
  def asReferences(): js.UndefOr[js.Array[vscodeLib.vscodeMod.Location]] = js.native
  def asReferences(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
    ]
  ): js.Array[vscodeLib.vscodeMod.Location] = js.native
  @JSName("asReferences")
  def asReferences_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.Location]] = js.native
  def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
  def asSignatureHelp(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureHelp): js.UndefOr[vscodeLib.vscodeMod.SignatureHelp] = js.native
  @JSName("asSignatureHelp")
  def asSignatureHelp_SignatureHelp(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureHelp): vscodeLib.vscodeMod.SignatureHelp = js.native
  def asSignatureInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation
  ): vscodeLib.vscodeMod.SignatureInformation = js.native
  def asSignatureInformations(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation
    ]
  ): js.Array[vscodeLib.vscodeMod.SignatureInformation] = js.native
  def asSymbolInformation(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation): vscodeLib.vscodeMod.SymbolInformation = js.native
  def asSymbolInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation,
    uri: vscodeLib.vscodeMod.Uri
  ): vscodeLib.vscodeMod.SymbolInformation = js.native
  def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
  def asSymbolInformations(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]
  ): js.Array[vscodeLib.vscodeMod.SymbolInformation] = js.native
  def asSymbolInformations(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ],
    uri: vscodeLib.vscodeMod.Uri
  ): js.Array[vscodeLib.vscodeMod.SymbolInformation] = js.native
  def asSymbolInformations(values: js.UndefOr[scala.Nothing], uri: vscodeLib.vscodeMod.Uri): js.UndefOr[scala.Nothing] = js.native
  def asSymbolInformations(values: scala.Null, uri: vscodeLib.vscodeMod.Uri): js.UndefOr[scala.Nothing] = js.native
  @JSName("asSymbolInformations")
  def asSymbolInformations_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.SymbolInformation]] = js.native
  @JSName("asSymbolInformations")
  def asSymbolInformations_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ],
    uri: vscodeLib.vscodeMod.Uri
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.SymbolInformation]] = js.native
  def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
  def asTextEdit(edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit): js.UndefOr[vscodeLib.vscodeMod.TextEdit] = js.native
  @JSName("asTextEdit")
  def asTextEdit_TextEdit(edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit): vscodeLib.vscodeMod.TextEdit = js.native
  def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
  def asTextEdits(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): js.Array[vscodeLib.vscodeMod.TextEdit] = js.native
  @JSName("asTextEdits")
  def asTextEdits_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): js.UndefOr[js.Array[vscodeLib.vscodeMod.TextEdit]] = js.native
  def asUri(value: java.lang.String): vscodeLib.vscodeMod.Uri = js.native
  def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
  def asWorkspaceEdit(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit): vscodeLib.vscodeMod.WorkspaceEdit = js.native
  @JSName("asWorkspaceEdit")
  def asWorkspaceEdit_UndefOr(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit): js.UndefOr[vscodeLib.vscodeMod.WorkspaceEdit] = js.native
}

