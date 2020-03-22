package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorOptions
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationOptions
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeOptions
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationOptions
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionOptions
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerCapabilities[T] extends js.Object {
  /**
    * The server provides code actions. CodeActionOptions may only be
    * specified if the client states that it supports
    * `codeActionLiteralSupport` in its initial `initialize` request.
    */
  var codeActionProvider: js.UndefOr[Boolean | CodeActionOptions] = js.undefined
  /**
    * The server provides code lens.
    */
  var codeLensProvider: js.UndefOr[CodeLensOptions] = js.undefined
  /**
    * The server provides color provider support.
    */
  var colorProvider: js.UndefOr[Boolean | DocumentColorOptions | DocumentColorRegistrationOptions] = js.undefined
  /**
    * The server provides completion support.
    */
  var completionProvider: js.UndefOr[CompletionOptions] = js.undefined
  /**
    * The server provides Goto Declaration support.
    */
  var declarationProvider: js.UndefOr[Boolean | DeclarationOptions | DeclarationRegistrationOptions] = js.undefined
  /**
    * The server provides goto definition support.
    */
  var definitionProvider: js.UndefOr[Boolean | DefinitionOptions] = js.undefined
  /**
    * The server provides document formatting.
    */
  var documentFormattingProvider: js.UndefOr[Boolean | DocumentFormattingOptions] = js.undefined
  /**
    * The server provides document highlight support.
    */
  var documentHighlightProvider: js.UndefOr[Boolean | DocumentHighlightOptions] = js.undefined
  /**
    * The server provides document link support.
    */
  var documentLinkProvider: js.UndefOr[DocumentLinkOptions] = js.undefined
  /**
    * The server provides document formatting on typing.
    */
  var documentOnTypeFormattingProvider: js.UndefOr[DocumentOnTypeFormattingOptions] = js.undefined
  /**
    * The server provides document range formatting.
    */
  var documentRangeFormattingProvider: js.UndefOr[Boolean | DocumentRangeFormattingOptions] = js.undefined
  /**
    * The server provides document symbol support.
    */
  var documentSymbolProvider: js.UndefOr[Boolean | DocumentSymbolOptions] = js.undefined
  /**
    * The server provides execute command support.
    */
  var executeCommandProvider: js.UndefOr[ExecuteCommandOptions] = js.undefined
  /**
    * Experimental server capabilities.
    */
  var experimental: js.UndefOr[T] = js.undefined
  /**
    * The server provides folding provider support.
    */
  var foldingRangeProvider: js.UndefOr[Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions] = js.undefined
  /**
    * The server provides hover support.
    */
  var hoverProvider: js.UndefOr[Boolean | HoverOptions] = js.undefined
  /**
    * The server provides Goto Implementation support.
    */
  var implementationProvider: js.UndefOr[Boolean | ImplementationOptions | ImplementationRegistrationOptions] = js.undefined
  /**
    * The server provides find references support.
    */
  var referencesProvider: js.UndefOr[Boolean | ReferenceOptions] = js.undefined
  /**
    * The server provides rename support. RenameOptions may only be
    * specified if the client states that it supports
    * `prepareSupport` in its initial `initialize` request.
    */
  var renameProvider: js.UndefOr[Boolean | RenameOptions] = js.undefined
  /**
    * The server provides selection range support.
    */
  var selectionRangeProvider: js.UndefOr[Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions] = js.undefined
  /**
    * The server provides signature help support.
    */
  var signatureHelpProvider: js.UndefOr[SignatureHelpOptions] = js.undefined
  /**
    * Defines how text documents are synced. Is either a detailed structure defining each notification or
    * for backwards compatibility the TextDocumentSyncKind number.
    */
  var textDocumentSync: js.UndefOr[TextDocumentSyncOptions | TextDocumentSyncKind] = js.undefined
  /**
    * The server provides Goto Type Definition support.
    */
  var typeDefinitionProvider: js.UndefOr[Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions] = js.undefined
  /**
    * The server provides workspace symbol support.
    */
  var workspaceSymbolProvider: js.UndefOr[Boolean | WorkspaceSymbolOptions] = js.undefined
}

object _ServerCapabilities {
  @scala.inline
  def apply[T](
    codeActionProvider: Boolean | CodeActionOptions = null,
    codeLensProvider: CodeLensOptions = null,
    colorProvider: Boolean | DocumentColorOptions | DocumentColorRegistrationOptions = null,
    completionProvider: CompletionOptions = null,
    declarationProvider: Boolean | DeclarationOptions | DeclarationRegistrationOptions = null,
    definitionProvider: Boolean | DefinitionOptions = null,
    documentFormattingProvider: Boolean | DocumentFormattingOptions = null,
    documentHighlightProvider: Boolean | DocumentHighlightOptions = null,
    documentLinkProvider: DocumentLinkOptions = null,
    documentOnTypeFormattingProvider: DocumentOnTypeFormattingOptions = null,
    documentRangeFormattingProvider: Boolean | DocumentRangeFormattingOptions = null,
    documentSymbolProvider: Boolean | DocumentSymbolOptions = null,
    executeCommandProvider: ExecuteCommandOptions = null,
    experimental: T = null,
    foldingRangeProvider: Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions = null,
    hoverProvider: Boolean | HoverOptions = null,
    implementationProvider: Boolean | ImplementationOptions | ImplementationRegistrationOptions = null,
    referencesProvider: Boolean | ReferenceOptions = null,
    renameProvider: Boolean | RenameOptions = null,
    selectionRangeProvider: Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions = null,
    signatureHelpProvider: SignatureHelpOptions = null,
    textDocumentSync: TextDocumentSyncOptions | TextDocumentSyncKind = null,
    typeDefinitionProvider: Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions = null,
    workspaceSymbolProvider: Boolean | WorkspaceSymbolOptions = null
  ): _ServerCapabilities[T] = {
    val __obj = js.Dynamic.literal()
    if (codeActionProvider != null) __obj.updateDynamic("codeActionProvider")(codeActionProvider.asInstanceOf[js.Any])
    if (codeLensProvider != null) __obj.updateDynamic("codeLensProvider")(codeLensProvider.asInstanceOf[js.Any])
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider.asInstanceOf[js.Any])
    if (completionProvider != null) __obj.updateDynamic("completionProvider")(completionProvider.asInstanceOf[js.Any])
    if (declarationProvider != null) __obj.updateDynamic("declarationProvider")(declarationProvider.asInstanceOf[js.Any])
    if (definitionProvider != null) __obj.updateDynamic("definitionProvider")(definitionProvider.asInstanceOf[js.Any])
    if (documentFormattingProvider != null) __obj.updateDynamic("documentFormattingProvider")(documentFormattingProvider.asInstanceOf[js.Any])
    if (documentHighlightProvider != null) __obj.updateDynamic("documentHighlightProvider")(documentHighlightProvider.asInstanceOf[js.Any])
    if (documentLinkProvider != null) __obj.updateDynamic("documentLinkProvider")(documentLinkProvider.asInstanceOf[js.Any])
    if (documentOnTypeFormattingProvider != null) __obj.updateDynamic("documentOnTypeFormattingProvider")(documentOnTypeFormattingProvider.asInstanceOf[js.Any])
    if (documentRangeFormattingProvider != null) __obj.updateDynamic("documentRangeFormattingProvider")(documentRangeFormattingProvider.asInstanceOf[js.Any])
    if (documentSymbolProvider != null) __obj.updateDynamic("documentSymbolProvider")(documentSymbolProvider.asInstanceOf[js.Any])
    if (executeCommandProvider != null) __obj.updateDynamic("executeCommandProvider")(executeCommandProvider.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (foldingRangeProvider != null) __obj.updateDynamic("foldingRangeProvider")(foldingRangeProvider.asInstanceOf[js.Any])
    if (hoverProvider != null) __obj.updateDynamic("hoverProvider")(hoverProvider.asInstanceOf[js.Any])
    if (implementationProvider != null) __obj.updateDynamic("implementationProvider")(implementationProvider.asInstanceOf[js.Any])
    if (referencesProvider != null) __obj.updateDynamic("referencesProvider")(referencesProvider.asInstanceOf[js.Any])
    if (renameProvider != null) __obj.updateDynamic("renameProvider")(renameProvider.asInstanceOf[js.Any])
    if (selectionRangeProvider != null) __obj.updateDynamic("selectionRangeProvider")(selectionRangeProvider.asInstanceOf[js.Any])
    if (signatureHelpProvider != null) __obj.updateDynamic("signatureHelpProvider")(signatureHelpProvider.asInstanceOf[js.Any])
    if (textDocumentSync != null) __obj.updateDynamic("textDocumentSync")(textDocumentSync.asInstanceOf[js.Any])
    if (typeDefinitionProvider != null) __obj.updateDynamic("typeDefinitionProvider")(typeDefinitionProvider.asInstanceOf[js.Any])
    if (workspaceSymbolProvider != null) __obj.updateDynamic("workspaceSymbolProvider")(workspaceSymbolProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ServerCapabilities[T]]
  }
}

