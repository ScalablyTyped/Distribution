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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ServerCapabilities[T] extends StObject {
  
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
  
  inline def apply[T](): _ServerCapabilities[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ServerCapabilities[T]]
  }
  
  extension [Self <: _ServerCapabilities[?], T](x: Self & _ServerCapabilities[T]) {
    
    inline def setCodeActionProvider(value: Boolean | CodeActionOptions): Self = StObject.set(x, "codeActionProvider", value.asInstanceOf[js.Any])
    
    inline def setCodeActionProviderUndefined: Self = StObject.set(x, "codeActionProvider", js.undefined)
    
    inline def setCodeLensProvider(value: CodeLensOptions): Self = StObject.set(x, "codeLensProvider", value.asInstanceOf[js.Any])
    
    inline def setCodeLensProviderUndefined: Self = StObject.set(x, "codeLensProvider", js.undefined)
    
    inline def setColorProvider(value: Boolean | DocumentColorOptions | DocumentColorRegistrationOptions): Self = StObject.set(x, "colorProvider", value.asInstanceOf[js.Any])
    
    inline def setColorProviderUndefined: Self = StObject.set(x, "colorProvider", js.undefined)
    
    inline def setCompletionProvider(value: CompletionOptions): Self = StObject.set(x, "completionProvider", value.asInstanceOf[js.Any])
    
    inline def setCompletionProviderUndefined: Self = StObject.set(x, "completionProvider", js.undefined)
    
    inline def setDeclarationProvider(value: Boolean | DeclarationOptions | DeclarationRegistrationOptions): Self = StObject.set(x, "declarationProvider", value.asInstanceOf[js.Any])
    
    inline def setDeclarationProviderUndefined: Self = StObject.set(x, "declarationProvider", js.undefined)
    
    inline def setDefinitionProvider(value: Boolean | DefinitionOptions): Self = StObject.set(x, "definitionProvider", value.asInstanceOf[js.Any])
    
    inline def setDefinitionProviderUndefined: Self = StObject.set(x, "definitionProvider", js.undefined)
    
    inline def setDocumentFormattingProvider(value: Boolean | DocumentFormattingOptions): Self = StObject.set(x, "documentFormattingProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentFormattingProviderUndefined: Self = StObject.set(x, "documentFormattingProvider", js.undefined)
    
    inline def setDocumentHighlightProvider(value: Boolean | DocumentHighlightOptions): Self = StObject.set(x, "documentHighlightProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentHighlightProviderUndefined: Self = StObject.set(x, "documentHighlightProvider", js.undefined)
    
    inline def setDocumentLinkProvider(value: DocumentLinkOptions): Self = StObject.set(x, "documentLinkProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentLinkProviderUndefined: Self = StObject.set(x, "documentLinkProvider", js.undefined)
    
    inline def setDocumentOnTypeFormattingProvider(value: DocumentOnTypeFormattingOptions): Self = StObject.set(x, "documentOnTypeFormattingProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentOnTypeFormattingProviderUndefined: Self = StObject.set(x, "documentOnTypeFormattingProvider", js.undefined)
    
    inline def setDocumentRangeFormattingProvider(value: Boolean | DocumentRangeFormattingOptions): Self = StObject.set(x, "documentRangeFormattingProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentRangeFormattingProviderUndefined: Self = StObject.set(x, "documentRangeFormattingProvider", js.undefined)
    
    inline def setDocumentSymbolProvider(value: Boolean | DocumentSymbolOptions): Self = StObject.set(x, "documentSymbolProvider", value.asInstanceOf[js.Any])
    
    inline def setDocumentSymbolProviderUndefined: Self = StObject.set(x, "documentSymbolProvider", js.undefined)
    
    inline def setExecuteCommandProvider(value: ExecuteCommandOptions): Self = StObject.set(x, "executeCommandProvider", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandProviderUndefined: Self = StObject.set(x, "executeCommandProvider", js.undefined)
    
    inline def setExperimental(value: T): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFoldingRangeProvider(value: Boolean | FoldingRangeOptions | FoldingRangeRegistrationOptions): Self = StObject.set(x, "foldingRangeProvider", value.asInstanceOf[js.Any])
    
    inline def setFoldingRangeProviderUndefined: Self = StObject.set(x, "foldingRangeProvider", js.undefined)
    
    inline def setHoverProvider(value: Boolean | HoverOptions): Self = StObject.set(x, "hoverProvider", value.asInstanceOf[js.Any])
    
    inline def setHoverProviderUndefined: Self = StObject.set(x, "hoverProvider", js.undefined)
    
    inline def setImplementationProvider(value: Boolean | ImplementationOptions | ImplementationRegistrationOptions): Self = StObject.set(x, "implementationProvider", value.asInstanceOf[js.Any])
    
    inline def setImplementationProviderUndefined: Self = StObject.set(x, "implementationProvider", js.undefined)
    
    inline def setReferencesProvider(value: Boolean | ReferenceOptions): Self = StObject.set(x, "referencesProvider", value.asInstanceOf[js.Any])
    
    inline def setReferencesProviderUndefined: Self = StObject.set(x, "referencesProvider", js.undefined)
    
    inline def setRenameProvider(value: Boolean | RenameOptions): Self = StObject.set(x, "renameProvider", value.asInstanceOf[js.Any])
    
    inline def setRenameProviderUndefined: Self = StObject.set(x, "renameProvider", js.undefined)
    
    inline def setSelectionRangeProvider(value: Boolean | SelectionRangeOptions | SelectionRangeRegistrationOptions): Self = StObject.set(x, "selectionRangeProvider", value.asInstanceOf[js.Any])
    
    inline def setSelectionRangeProviderUndefined: Self = StObject.set(x, "selectionRangeProvider", js.undefined)
    
    inline def setSignatureHelpProvider(value: SignatureHelpOptions): Self = StObject.set(x, "signatureHelpProvider", value.asInstanceOf[js.Any])
    
    inline def setSignatureHelpProviderUndefined: Self = StObject.set(x, "signatureHelpProvider", js.undefined)
    
    inline def setTextDocumentSync(value: TextDocumentSyncOptions | TextDocumentSyncKind): Self = StObject.set(x, "textDocumentSync", value.asInstanceOf[js.Any])
    
    inline def setTextDocumentSyncUndefined: Self = StObject.set(x, "textDocumentSync", js.undefined)
    
    inline def setTypeDefinitionProvider(value: Boolean | TypeDefinitionOptions | TypeDefinitionRegistrationOptions): Self = StObject.set(x, "typeDefinitionProvider", value.asInstanceOf[js.Any])
    
    inline def setTypeDefinitionProviderUndefined: Self = StObject.set(x, "typeDefinitionProvider", js.undefined)
    
    inline def setWorkspaceSymbolProvider(value: Boolean | WorkspaceSymbolOptions): Self = StObject.set(x, "workspaceSymbolProvider", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceSymbolProviderUndefined: Self = StObject.set(x, "workspaceSymbolProvider", js.undefined)
  }
}
