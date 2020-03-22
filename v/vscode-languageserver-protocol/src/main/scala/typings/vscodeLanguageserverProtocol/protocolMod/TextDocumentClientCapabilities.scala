package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionClientCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[CodeActionClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[CodeLensClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentColor`
    */
  var colorProvider: js.UndefOr[DocumentColorClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[CompletionClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/declaration`
    *
    * @since 3.14.0
    */
  var declaration: js.UndefOr[DeclarationClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[DefinitionClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[DocumentHighlightClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[DocumentLinkClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[DocumentSymbolClientCapabilities] = js.undefined
  /**
    * Capabilities specific to `textDocument/foldingRange` requests.
    *
    * @since 3.10.0
    */
  var foldingRange: js.UndefOr[FoldingRangeClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[DocumentFormattingClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[HoverClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/implementation`
    *
    * @since 3.6.0
    */
  var implementation: js.UndefOr[ImplementationClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[DocumentOnTypeFormattingClientCapabilities] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[PublishDiagnosticsClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[DocumentRangeFormattingClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[ReferenceClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[RenameClientCapabilities] = js.undefined
  /**
    * Capabilities specific to `textDocument/selectionRange` requests
    *
    * @since 3.15.0
    */
  var selectionRange: js.UndefOr[SelectionRangeClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[SignatureHelpClientCapabilities] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[TextDocumentSyncClientCapabilities] = js.undefined
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    *
    * @since 3.6.0
    */
  var typeDefinition: js.UndefOr[TypeDefinitionClientCapabilities] = js.undefined
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(
    codeAction: CodeActionClientCapabilities = null,
    codeLens: CodeLensClientCapabilities = null,
    colorProvider: DocumentColorClientCapabilities = null,
    completion: CompletionClientCapabilities = null,
    declaration: DeclarationClientCapabilities = null,
    definition: DefinitionClientCapabilities = null,
    documentHighlight: DocumentHighlightClientCapabilities = null,
    documentLink: DocumentLinkClientCapabilities = null,
    documentSymbol: DocumentSymbolClientCapabilities = null,
    foldingRange: FoldingRangeClientCapabilities = null,
    formatting: DocumentFormattingClientCapabilities = null,
    hover: HoverClientCapabilities = null,
    implementation: ImplementationClientCapabilities = null,
    onTypeFormatting: DocumentOnTypeFormattingClientCapabilities = null,
    publishDiagnostics: PublishDiagnosticsClientCapabilities = null,
    rangeFormatting: DocumentRangeFormattingClientCapabilities = null,
    references: ReferenceClientCapabilities = null,
    rename: RenameClientCapabilities = null,
    selectionRange: SelectionRangeClientCapabilities = null,
    signatureHelp: SignatureHelpClientCapabilities = null,
    synchronization: TextDocumentSyncClientCapabilities = null,
    typeDefinition: TypeDefinitionClientCapabilities = null
  ): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeAction != null) __obj.updateDynamic("codeAction")(codeAction.asInstanceOf[js.Any])
    if (codeLens != null) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider.asInstanceOf[js.Any])
    if (completion != null) __obj.updateDynamic("completion")(completion.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (documentHighlight != null) __obj.updateDynamic("documentHighlight")(documentHighlight.asInstanceOf[js.Any])
    if (documentLink != null) __obj.updateDynamic("documentLink")(documentLink.asInstanceOf[js.Any])
    if (documentSymbol != null) __obj.updateDynamic("documentSymbol")(documentSymbol.asInstanceOf[js.Any])
    if (foldingRange != null) __obj.updateDynamic("foldingRange")(foldingRange.asInstanceOf[js.Any])
    if (formatting != null) __obj.updateDynamic("formatting")(formatting.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (onTypeFormatting != null) __obj.updateDynamic("onTypeFormatting")(onTypeFormatting.asInstanceOf[js.Any])
    if (publishDiagnostics != null) __obj.updateDynamic("publishDiagnostics")(publishDiagnostics.asInstanceOf[js.Any])
    if (rangeFormatting != null) __obj.updateDynamic("rangeFormatting")(rangeFormatting.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (selectionRange != null) __obj.updateDynamic("selectionRange")(selectionRange.asInstanceOf[js.Any])
    if (signatureHelp != null) __obj.updateDynamic("signatureHelp")(signatureHelp.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    if (typeDefinition != null) __obj.updateDynamic("typeDefinition")(typeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
}

