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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _ServerCapabilities[T] extends StObject {
  
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
  implicit class _ServerCapabilitiesMutableBuilder[Self <: _ServerCapabilities[_], T] (val x: Self with _ServerCapabilities[T]) extends AnyVal {
    
    @scala.inline
    def setCodeActionProvider(value: Boolean | CodeActionOptions): Self = StObject.set(x, "codeActionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionProviderUndefined: Self = StObject.set(x, "codeActionProvider", js.undefined)
    
    @scala.inline
    def setCodeLensProvider(value: CodeLensOptions): Self = StObject.set(x, "codeLensProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeLensProviderUndefined: Self = StObject.set(x, "codeLensProvider", js.undefined)
    
    @scala.inline
    def setColorProvider(value: Boolean | DocumentColorOptions | DocumentColorRegistrationOptions): Self = StObject.set(x, "colorProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProviderUndefined: Self = StObject.set(x, "colorProvider", js.undefined)
    
    @scala.inline
    def setCompletionProvider(value: CompletionOptions): Self = StObject.set(x, "completionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionProviderUndefined: Self = StObject.set(x, "completionProvider", js.undefined)
    
    @scala.inline
    def setDeclarationProvider(value: Boolean | DeclarationOptions | DeclarationRegistrationOptions): Self = StObject.set(x, "declarationProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationProviderUndefined: Self = StObject.set(x, "declarationProvider", js.undefined)
    
    @scala.inline
    def setDefinitionProvider(value: Boolean | DefinitionOptions): Self = StObject.set(x, "definitionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionProviderUndefined: Self = StObject.set(x, "definitionProvider", js.undefined)
    
    @scala.inline
    def setDocumentFormattingProvider(value: Boolean | DocumentFormattingOptions): Self = StObject.set(x, "documentFormattingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormattingProviderUndefined: Self = StObject.set(x, "documentFormattingProvider", js.undefined)
    
    @scala.inline
    def setDocumentHighlightProvider(value: Boolean | DocumentHighlightOptions): Self = StObject.set(x, "documentHighlightProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHighlightProviderUndefined: Self = StObject.set(x, "documentHighlightProvider", js.undefined)
    
    @scala.inline
    def setDocumentLinkProvider(value: DocumentLinkOptions): Self = StObject.set(x, "documentLinkProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLinkProviderUndefined: Self = StObject.set(x, "documentLinkProvider", js.undefined)
    
    @scala.inline
    def setDocumentOnTypeFormattingProvider(value: DocumentOnTypeFormattingOptions): Self = StObject.set(x, "documentOnTypeFormattingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentOnTypeFormattingProviderUndefined: Self = StObject.set(x, "documentOnTypeFormattingProvider", js.undefined)
    
    @scala.inline
    def setDocumentRangeFormattingProvider(value: Boolean | DocumentRangeFormattingOptions): Self = StObject.set(x, "documentRangeFormattingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRangeFormattingProviderUndefined: Self = StObject.set(x, "documentRangeFormattingProvider", js.undefined)
    
    @scala.inline
    def setDocumentSymbolProvider(value: Boolean | DocumentSymbolOptions): Self = StObject.set(x, "documentSymbolProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSymbolProviderUndefined: Self = StObject.set(x, "documentSymbolProvider", js.undefined)
    
    @scala.inline
    def setExecuteCommandProvider(value: ExecuteCommandOptions): Self = StObject.set(x, "executeCommandProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteCommandProviderUndefined: Self = StObject.set(x, "executeCommandProvider", js.undefined)
    
    @scala.inline
    def setExperimental(value: T): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setFoldingRangeProvider(value: Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions): Self = StObject.set(x, "foldingRangeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingRangeProviderUndefined: Self = StObject.set(x, "foldingRangeProvider", js.undefined)
    
    @scala.inline
    def setHoverProvider(value: Boolean | HoverOptions): Self = StObject.set(x, "hoverProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverProviderUndefined: Self = StObject.set(x, "hoverProvider", js.undefined)
    
    @scala.inline
    def setImplementationProvider(value: Boolean | ImplementationOptions | ImplementationRegistrationOptions): Self = StObject.set(x, "implementationProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationProviderUndefined: Self = StObject.set(x, "implementationProvider", js.undefined)
    
    @scala.inline
    def setReferencesProvider(value: Boolean | ReferenceOptions): Self = StObject.set(x, "referencesProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesProviderUndefined: Self = StObject.set(x, "referencesProvider", js.undefined)
    
    @scala.inline
    def setRenameProvider(value: Boolean | RenameOptions): Self = StObject.set(x, "renameProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameProviderUndefined: Self = StObject.set(x, "renameProvider", js.undefined)
    
    @scala.inline
    def setSelectionRangeProvider(value: Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions): Self = StObject.set(x, "selectionRangeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRangeProviderUndefined: Self = StObject.set(x, "selectionRangeProvider", js.undefined)
    
    @scala.inline
    def setSignatureHelpProvider(value: SignatureHelpOptions): Self = StObject.set(x, "signatureHelpProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureHelpProviderUndefined: Self = StObject.set(x, "signatureHelpProvider", js.undefined)
    
    @scala.inline
    def setTextDocumentSync(value: TextDocumentSyncOptions | TextDocumentSyncKind): Self = StObject.set(x, "textDocumentSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocumentSyncUndefined: Self = StObject.set(x, "textDocumentSync", js.undefined)
    
    @scala.inline
    def setTypeDefinitionProvider(value: Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions): Self = StObject.set(x, "typeDefinitionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeDefinitionProviderUndefined: Self = StObject.set(x, "typeDefinitionProvider", js.undefined)
    
    @scala.inline
    def setWorkspaceSymbolProvider(value: Boolean | WorkspaceSymbolOptions): Self = StObject.set(x, "workspaceSymbolProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceSymbolProviderUndefined: Self = StObject.set(x, "workspaceSymbolProvider", js.undefined)
  }
}
