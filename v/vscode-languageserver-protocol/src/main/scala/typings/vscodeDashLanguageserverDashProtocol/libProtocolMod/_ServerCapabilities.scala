package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_FirstTriggerCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ServerCapabilities extends js.Object {
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
    * The server provides completion support.
    */
  var completionProvider: js.UndefOr[CompletionOptions] = js.undefined
  /**
    * The server provides goto definition support.
    */
  var definitionProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides document formatting.
    */
  var documentFormattingProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides document highlight support.
    */
  var documentHighlightProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides document link support.
    */
  var documentLinkProvider: js.UndefOr[DocumentLinkOptions] = js.undefined
  /**
    * The server provides document formatting on typing.
    */
  var documentOnTypeFormattingProvider: js.UndefOr[Anon_FirstTriggerCharacter] = js.undefined
  /**
    * The server provides document range formatting.
    */
  var documentRangeFormattingProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides document symbol support.
    */
  var documentSymbolProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides execute command support.
    */
  var executeCommandProvider: js.UndefOr[ExecuteCommandOptions] = js.undefined
  /**
    * Experimental server capabilities.
    */
  var experimental: js.UndefOr[js.Any] = js.undefined
  /**
    * The server provides hover support.
    */
  var hoverProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides find references support.
    */
  var referencesProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * The server provides rename support. RenameOptions may only be
    * specified if the client states that it supports
    * `prepareSupport` in its initial `initialize` request.
    */
  var renameProvider: js.UndefOr[Boolean | RenameOptions] = js.undefined
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
    * The server provides workspace symbol support.
    */
  var workspaceSymbolProvider: js.UndefOr[Boolean] = js.undefined
}

object _ServerCapabilities {
  @scala.inline
  def apply(
    codeActionProvider: Boolean | CodeActionOptions = null,
    codeLensProvider: CodeLensOptions = null,
    completionProvider: CompletionOptions = null,
    definitionProvider: js.UndefOr[Boolean] = js.undefined,
    documentFormattingProvider: js.UndefOr[Boolean] = js.undefined,
    documentHighlightProvider: js.UndefOr[Boolean] = js.undefined,
    documentLinkProvider: DocumentLinkOptions = null,
    documentOnTypeFormattingProvider: Anon_FirstTriggerCharacter = null,
    documentRangeFormattingProvider: js.UndefOr[Boolean] = js.undefined,
    documentSymbolProvider: js.UndefOr[Boolean] = js.undefined,
    executeCommandProvider: ExecuteCommandOptions = null,
    experimental: js.Any = null,
    hoverProvider: js.UndefOr[Boolean] = js.undefined,
    referencesProvider: js.UndefOr[Boolean] = js.undefined,
    renameProvider: Boolean | RenameOptions = null,
    signatureHelpProvider: SignatureHelpOptions = null,
    textDocumentSync: TextDocumentSyncOptions | TextDocumentSyncKind = null,
    workspaceSymbolProvider: js.UndefOr[Boolean] = js.undefined
  ): _ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeActionProvider != null) __obj.updateDynamic("codeActionProvider")(codeActionProvider.asInstanceOf[js.Any])
    if (codeLensProvider != null) __obj.updateDynamic("codeLensProvider")(codeLensProvider)
    if (completionProvider != null) __obj.updateDynamic("completionProvider")(completionProvider)
    if (!js.isUndefined(definitionProvider)) __obj.updateDynamic("definitionProvider")(definitionProvider)
    if (!js.isUndefined(documentFormattingProvider)) __obj.updateDynamic("documentFormattingProvider")(documentFormattingProvider)
    if (!js.isUndefined(documentHighlightProvider)) __obj.updateDynamic("documentHighlightProvider")(documentHighlightProvider)
    if (documentLinkProvider != null) __obj.updateDynamic("documentLinkProvider")(documentLinkProvider)
    if (documentOnTypeFormattingProvider != null) __obj.updateDynamic("documentOnTypeFormattingProvider")(documentOnTypeFormattingProvider)
    if (!js.isUndefined(documentRangeFormattingProvider)) __obj.updateDynamic("documentRangeFormattingProvider")(documentRangeFormattingProvider)
    if (!js.isUndefined(documentSymbolProvider)) __obj.updateDynamic("documentSymbolProvider")(documentSymbolProvider)
    if (executeCommandProvider != null) __obj.updateDynamic("executeCommandProvider")(executeCommandProvider)
    if (experimental != null) __obj.updateDynamic("experimental")(experimental)
    if (!js.isUndefined(hoverProvider)) __obj.updateDynamic("hoverProvider")(hoverProvider)
    if (!js.isUndefined(referencesProvider)) __obj.updateDynamic("referencesProvider")(referencesProvider)
    if (renameProvider != null) __obj.updateDynamic("renameProvider")(renameProvider.asInstanceOf[js.Any])
    if (signatureHelpProvider != null) __obj.updateDynamic("signatureHelpProvider")(signatureHelpProvider)
    if (textDocumentSync != null) __obj.updateDynamic("textDocumentSync")(textDocumentSync.asInstanceOf[js.Any])
    if (!js.isUndefined(workspaceSymbolProvider)) __obj.updateDynamic("workspaceSymbolProvider")(workspaceSymbolProvider)
    __obj.asInstanceOf[_ServerCapabilities]
  }
}

