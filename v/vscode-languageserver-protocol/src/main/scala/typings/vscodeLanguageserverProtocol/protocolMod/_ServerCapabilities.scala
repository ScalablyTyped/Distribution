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

@js.native
trait _ServerCapabilities[T] extends js.Object {
  /**
    * The server provides code actions. CodeActionOptions may only be
    * specified if the client states that it supports
    * `codeActionLiteralSupport` in its initial `initialize` request.
    */
  var codeActionProvider: js.UndefOr[Boolean | CodeActionOptions] = js.native
  /**
    * The server provides code lens.
    */
  var codeLensProvider: js.UndefOr[CodeLensOptions] = js.native
  /**
    * The server provides color provider support.
    */
  var colorProvider: js.UndefOr[Boolean | DocumentColorOptions | DocumentColorRegistrationOptions] = js.native
  /**
    * The server provides completion support.
    */
  var completionProvider: js.UndefOr[CompletionOptions] = js.native
  /**
    * The server provides Goto Declaration support.
    */
  var declarationProvider: js.UndefOr[Boolean | DeclarationOptions | DeclarationRegistrationOptions] = js.native
  /**
    * The server provides goto definition support.
    */
  var definitionProvider: js.UndefOr[Boolean | DefinitionOptions] = js.native
  /**
    * The server provides document formatting.
    */
  var documentFormattingProvider: js.UndefOr[Boolean | DocumentFormattingOptions] = js.native
  /**
    * The server provides document highlight support.
    */
  var documentHighlightProvider: js.UndefOr[Boolean | DocumentHighlightOptions] = js.native
  /**
    * The server provides document link support.
    */
  var documentLinkProvider: js.UndefOr[DocumentLinkOptions] = js.native
  /**
    * The server provides document formatting on typing.
    */
  var documentOnTypeFormattingProvider: js.UndefOr[DocumentOnTypeFormattingOptions] = js.native
  /**
    * The server provides document range formatting.
    */
  var documentRangeFormattingProvider: js.UndefOr[Boolean | DocumentRangeFormattingOptions] = js.native
  /**
    * The server provides document symbol support.
    */
  var documentSymbolProvider: js.UndefOr[Boolean | DocumentSymbolOptions] = js.native
  /**
    * The server provides execute command support.
    */
  var executeCommandProvider: js.UndefOr[ExecuteCommandOptions] = js.native
  /**
    * Experimental server capabilities.
    */
  var experimental: js.UndefOr[T] = js.native
  /**
    * The server provides folding provider support.
    */
  var foldingRangeProvider: js.UndefOr[Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions] = js.native
  /**
    * The server provides hover support.
    */
  var hoverProvider: js.UndefOr[Boolean | HoverOptions] = js.native
  /**
    * The server provides Goto Implementation support.
    */
  var implementationProvider: js.UndefOr[Boolean | ImplementationOptions | ImplementationRegistrationOptions] = js.native
  /**
    * The server provides find references support.
    */
  var referencesProvider: js.UndefOr[Boolean | ReferenceOptions] = js.native
  /**
    * The server provides rename support. RenameOptions may only be
    * specified if the client states that it supports
    * `prepareSupport` in its initial `initialize` request.
    */
  var renameProvider: js.UndefOr[Boolean | RenameOptions] = js.native
  /**
    * The server provides selection range support.
    */
  var selectionRangeProvider: js.UndefOr[Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions] = js.native
  /**
    * The server provides signature help support.
    */
  var signatureHelpProvider: js.UndefOr[SignatureHelpOptions] = js.native
  /**
    * Defines how text documents are synced. Is either a detailed structure defining each notification or
    * for backwards compatibility the TextDocumentSyncKind number.
    */
  var textDocumentSync: js.UndefOr[TextDocumentSyncOptions | TextDocumentSyncKind] = js.native
  /**
    * The server provides Goto Type Definition support.
    */
  var typeDefinitionProvider: js.UndefOr[Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions] = js.native
  /**
    * The server provides workspace symbol support.
    */
  var workspaceSymbolProvider: js.UndefOr[Boolean | WorkspaceSymbolOptions] = js.native
}

object _ServerCapabilities {
  @scala.inline
  def apply[T](): _ServerCapabilities[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ServerCapabilities[T]]
  }
  @scala.inline
  implicit class _ServerCapabilitiesOps[Self <: _ServerCapabilities[_], T] (val x: Self with _ServerCapabilities[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeActionProvider(value: Boolean | CodeActionOptions): Self = this.set("codeActionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeActionProvider: Self = this.set("codeActionProvider", js.undefined)
    @scala.inline
    def setCodeLensProvider(value: CodeLensOptions): Self = this.set("codeLensProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeLensProvider: Self = this.set("codeLensProvider", js.undefined)
    @scala.inline
    def setColorProvider(value: Boolean | DocumentColorOptions | DocumentColorRegistrationOptions): Self = this.set("colorProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorProvider: Self = this.set("colorProvider", js.undefined)
    @scala.inline
    def setCompletionProvider(value: CompletionOptions): Self = this.set("completionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionProvider: Self = this.set("completionProvider", js.undefined)
    @scala.inline
    def setDeclarationProvider(value: Boolean | DeclarationOptions | DeclarationRegistrationOptions): Self = this.set("declarationProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarationProvider: Self = this.set("declarationProvider", js.undefined)
    @scala.inline
    def setDefinitionProvider(value: Boolean | DefinitionOptions): Self = this.set("definitionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionProvider: Self = this.set("definitionProvider", js.undefined)
    @scala.inline
    def setDocumentFormattingProvider(value: Boolean | DocumentFormattingOptions): Self = this.set("documentFormattingProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentFormattingProvider: Self = this.set("documentFormattingProvider", js.undefined)
    @scala.inline
    def setDocumentHighlightProvider(value: Boolean | DocumentHighlightOptions): Self = this.set("documentHighlightProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentHighlightProvider: Self = this.set("documentHighlightProvider", js.undefined)
    @scala.inline
    def setDocumentLinkProvider(value: DocumentLinkOptions): Self = this.set("documentLinkProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentLinkProvider: Self = this.set("documentLinkProvider", js.undefined)
    @scala.inline
    def setDocumentOnTypeFormattingProvider(value: DocumentOnTypeFormattingOptions): Self = this.set("documentOnTypeFormattingProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentOnTypeFormattingProvider: Self = this.set("documentOnTypeFormattingProvider", js.undefined)
    @scala.inline
    def setDocumentRangeFormattingProvider(value: Boolean | DocumentRangeFormattingOptions): Self = this.set("documentRangeFormattingProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentRangeFormattingProvider: Self = this.set("documentRangeFormattingProvider", js.undefined)
    @scala.inline
    def setDocumentSymbolProvider(value: Boolean | DocumentSymbolOptions): Self = this.set("documentSymbolProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentSymbolProvider: Self = this.set("documentSymbolProvider", js.undefined)
    @scala.inline
    def setExecuteCommandProvider(value: ExecuteCommandOptions): Self = this.set("executeCommandProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteCommandProvider: Self = this.set("executeCommandProvider", js.undefined)
    @scala.inline
    def setExperimental(value: T): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setFoldingRangeProvider(value: Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions): Self = this.set("foldingRangeProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoldingRangeProvider: Self = this.set("foldingRangeProvider", js.undefined)
    @scala.inline
    def setHoverProvider(value: Boolean | HoverOptions): Self = this.set("hoverProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverProvider: Self = this.set("hoverProvider", js.undefined)
    @scala.inline
    def setImplementationProvider(value: Boolean | ImplementationOptions | ImplementationRegistrationOptions): Self = this.set("implementationProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplementationProvider: Self = this.set("implementationProvider", js.undefined)
    @scala.inline
    def setReferencesProvider(value: Boolean | ReferenceOptions): Self = this.set("referencesProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencesProvider: Self = this.set("referencesProvider", js.undefined)
    @scala.inline
    def setRenameProvider(value: Boolean | RenameOptions): Self = this.set("renameProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenameProvider: Self = this.set("renameProvider", js.undefined)
    @scala.inline
    def setSelectionRangeProvider(value: Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions): Self = this.set("selectionRangeProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionRangeProvider: Self = this.set("selectionRangeProvider", js.undefined)
    @scala.inline
    def setSignatureHelpProvider(value: SignatureHelpOptions): Self = this.set("signatureHelpProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureHelpProvider: Self = this.set("signatureHelpProvider", js.undefined)
    @scala.inline
    def setTextDocumentSync(value: TextDocumentSyncOptions | TextDocumentSyncKind): Self = this.set("textDocumentSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDocumentSync: Self = this.set("textDocumentSync", js.undefined)
    @scala.inline
    def setTypeDefinitionProvider(value: Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions): Self = this.set("typeDefinitionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeDefinitionProvider: Self = this.set("typeDefinitionProvider", js.undefined)
    @scala.inline
    def setWorkspaceSymbolProvider(value: Boolean | WorkspaceSymbolOptions): Self = this.set("workspaceSymbolProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceSymbolProvider: Self = this.set("workspaceSymbolProvider", js.undefined)
  }
  
}

