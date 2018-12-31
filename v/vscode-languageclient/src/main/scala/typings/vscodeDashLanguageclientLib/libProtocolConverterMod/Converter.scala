package typings
package vscodeDashLanguageclientLib.libProtocolConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
  def asCodeAction(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeAction */ _
  ] = js.native
  def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
  def asCodeActionKind(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeActionKind */ _
  ] = js.native
  @JSName("asCodeActionKind")
  def asCodeActionKind_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind): js.Any = js.native
  def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
  def asCodeActionKinds(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeActionKind */ _
  ] = js.native
  @JSName("asCodeActionKinds")
  def asCodeActionKinds_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeActionKind */ _
    ]
  ] = js.native
  @JSName("asCodeAction")
  def asCodeAction_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeAction): js.Any = js.native
  def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
  def asCodeLens(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeLens */ _
  ] = js.native
  @JSName("asCodeLens")
  def asCodeLens_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens): js.Any = js.native
  def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
  def asCodeLenses(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeLens */ _
  ] = js.native
  @JSName("asCodeLenses")
  def asCodeLenses_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeLens */ _
    ]
  ] = js.native
  def asColor(color: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Color): js.Any = js.native
  def asColorInformation(ci: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation): js.Any = js.native
  def asColorInformations(): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.ColorInformation */ _
  ] = js.native
  def asColorInformations(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorInformation
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.ColorInformation */ _
  ] = js.native
  @JSName("asColorInformations")
  def asColorInformations_UndefOr(): js.UndefOr[scala.Nothing] = js.native
  def asColorPresentation(cp: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation): js.Any = js.native
  def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
  def asColorPresentations(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.ColorPresentation */ _
  ] = js.native
  @JSName("asColorPresentations")
  def asColorPresentations_UndefOr(
    colorPresentations: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation
    ]
  ): js.UndefOr[scala.Nothing] = js.native
  def asCommand(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command): js.Any = js.native
  def asCommands(): js.UndefOr[scala.Nothing] = js.native
  def asCommands(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Command */ _
  ] = js.native
  @JSName("asCommands")
  def asCommands_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Command */ _
    ]
  ] = js.native
  def asCompletionItem(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem): vscodeDashLanguageclientLib.libProtocolCompletionItemMod.default = js.native
  def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
  def asCompletionResult(
    result: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionItem */ _
  ] = js.native
  def asCompletionResult(result: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList): js.UndefOr[
    (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionItem */ _
    ]) | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionList */ js.Any)
  ] = js.native
  @JSName("asCompletionResult")
  def asCompletionResult_Any(result: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionList): js.Any = js.native
  @JSName("asCompletionResult")
  def asCompletionResult_UndefOr(
    result: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]
  ): js.UndefOr[
    (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionItem */ _
    ]) | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionList */ js.Any)
  ] = js.native
  def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
  def asDeclarationResult(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DeclarationLink
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.LocationLink */ _
  ] = js.native
  def asDeclarationResult(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Declaration): (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ js.Any) | (js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ _
  ]) = js.native
  @JSName("asDeclarationResult")
  def asDeclarationResult_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DeclarationLink
    ]
  ): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Declaration */ _
  ] = js.native
  @JSName("asDeclarationResult")
  def asDeclarationResult_UndefOr(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Declaration): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Declaration */ _
  ] = js.native
  def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
  def asDefinitionResult(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DefinitionLink
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DefinitionLink */ _
  ] = js.native
  def asDefinitionResult(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition): js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Definition */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DefinitionLink */ _
    ])
  ] = js.native
  @JSName("asDefinitionResult")
  def asDefinitionResult_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Definition): js.Any = js.native
  @JSName("asDefinitionResult")
  def asDefinitionResult_UndefOr(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DefinitionLink
    ]
  ): js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Definition */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DefinitionLink */ _
    ])
  ] = js.native
  def asDiagnostic(diagnostic: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic): js.Any = js.native
  def asDiagnosticSeverity(): js.Any = js.native
  def asDiagnosticSeverity(value: scala.Double): js.Any = js.native
  def asDiagnostics(
    diagnostics: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Diagnostic */ _
  ] = js.native
  def asDocumentHighlight(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight): js.Any = js.native
  def asDocumentHighlightKind(item: scala.Double): js.Any = js.native
  def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentHighlights(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentHighlight */ _
  ] = js.native
  @JSName("asDocumentHighlights")
  def asDocumentHighlights_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentHighlight */ _
    ]
  ] = js.native
  def asDocumentLink(item: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink): js.Any = js.native
  def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentLinks(
    items: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentLink */ _
  ] = js.native
  @JSName("asDocumentLinks")
  def asDocumentLinks_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentLink */ _
    ]
  ] = js.native
  def asDocumentSymbol(
    value: vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
  ): js.Any = js.native
  def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
  def asDocumentSymbols(
    value: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentSymbol */ _
  ] = js.native
  @JSName("asDocumentSymbols")
  def asDocumentSymbols_UndefOr(
    value: js.Array[
      vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentSymbol */ _
    ]
  ] = js.native
  def asFoldingRange(r: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange): js.Any = js.native
  def asFoldingRangeKind(): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.FoldingRangeKind */ _
  ] = js.native
  def asFoldingRangeKind(kind: java.lang.String): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.FoldingRangeKind */ _
  ] = js.native
  def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
  def asFoldingRanges(
    foldingRanges: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.FoldingRange */ _
  ] = js.native
  @JSName("asFoldingRanges")
  def asFoldingRanges_UndefOr(
    foldingRanges: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.FoldingRange */ _
    ]
  ] = js.native
  def asHover(): js.UndefOr[scala.Nothing] = js.native
  def asHover(hover: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Hover): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Hover */ _
  ] = js.native
  @JSName("asHover")
  def asHover_Any(hover: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Hover): js.Any = js.native
  def asLocation(): js.UndefOr[scala.Nothing] = js.native
  def asLocation(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ _
  ] = js.native
  @JSName("asLocation")
  def asLocation_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location): js.Any = js.native
  def asParameterInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ParameterInformation
  ): js.Any = js.native
  def asParameterInformations(
    item: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ParameterInformation
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.ParameterInformation */ _
  ] = js.native
  def asPosition(): js.UndefOr[scala.Nothing] = js.native
  def asPosition(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ _
  ] = js.native
  @JSName("asPosition")
  def asPosition_Any(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position): js.Any = js.native
  def asRange(): js.UndefOr[scala.Nothing] = js.native
  def asRange(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Range */ _
  ] = js.native
  @JSName("asRange")
  def asRange_Any(value: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range): js.Any = js.native
  def asReferences(): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ _
    ]
  ] = js.native
  def asReferences(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ _
  ] = js.native
  @JSName("asReferences")
  def asReferences_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Location
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Location */ _
    ]
  ] = js.native
  def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
  def asSignatureHelp(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureHelp): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SignatureHelp */ _
  ] = js.native
  @JSName("asSignatureHelp")
  def asSignatureHelp_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureHelp): js.Any = js.native
  def asSignatureInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation
  ): js.Any = js.native
  def asSignatureInformations(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SignatureInformation
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SignatureInformation */ _
  ] = js.native
  def asSymbolInformation(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation): js.Any = js.native
  def asSymbolInformation(
    item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation,
    uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any
  ): js.Any = js.native
  def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
  def asSymbolInformations(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SymbolInformation */ _
  ] = js.native
  def asSymbolInformations(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ],
    uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SymbolInformation */ _
  ] = js.native
  def asSymbolInformations(
    values: js.UndefOr[scala.Nothing],
    uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any
  ): js.UndefOr[scala.Nothing] = js.native
  def asSymbolInformations(
    values: scala.Null,
    uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any
  ): js.UndefOr[scala.Nothing] = js.native
  @JSName("asSymbolInformations")
  def asSymbolInformations_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SymbolInformation */ _
    ]
  ] = js.native
  @JSName("asSymbolInformations")
  def asSymbolInformations_UndefOr(
    values: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ],
    uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.SymbolInformation */ _
    ]
  ] = js.native
  def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
  def asTextEdit(edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextEdit */ _
  ] = js.native
  @JSName("asTextEdit")
  def asTextEdit_Any(edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit): js.Any = js.native
  def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
  def asTextEdits(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextEdit */ _
  ] = js.native
  @JSName("asTextEdits")
  def asTextEdits_UndefOr(
    items: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextEdit */ _
    ]
  ] = js.native
  def asUri(value: java.lang.String): js.Any = js.native
  def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
  def asWorkspaceEdit(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.WorkspaceEdit */ _
  ] = js.native
  @JSName("asWorkspaceEdit")
  def asWorkspaceEdit_Any(item: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit): js.Any = js.native
}

