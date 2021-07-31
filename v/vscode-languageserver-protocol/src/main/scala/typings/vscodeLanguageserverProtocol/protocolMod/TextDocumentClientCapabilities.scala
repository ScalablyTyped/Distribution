package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionClientCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentClientCapabilities extends StObject {
  
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
  def apply(): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
  
  @scala.inline
  implicit class TextDocumentClientCapabilitiesMutableBuilder[Self <: TextDocumentClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeAction(value: CodeActionClientCapabilities): Self = StObject.set(x, "codeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeActionUndefined: Self = StObject.set(x, "codeAction", js.undefined)
    
    @scala.inline
    def setCodeLens(value: CodeLensClientCapabilities): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeLensUndefined: Self = StObject.set(x, "codeLens", js.undefined)
    
    @scala.inline
    def setColorProvider(value: DocumentColorClientCapabilities): Self = StObject.set(x, "colorProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProviderUndefined: Self = StObject.set(x, "colorProvider", js.undefined)
    
    @scala.inline
    def setCompletion(value: CompletionClientCapabilities): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
    
    @scala.inline
    def setDeclaration(value: DeclarationClientCapabilities): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionClientCapabilities): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDocumentHighlight(value: DocumentHighlightClientCapabilities): Self = StObject.set(x, "documentHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHighlightUndefined: Self = StObject.set(x, "documentHighlight", js.undefined)
    
    @scala.inline
    def setDocumentLink(value: DocumentLinkClientCapabilities): Self = StObject.set(x, "documentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentLinkUndefined: Self = StObject.set(x, "documentLink", js.undefined)
    
    @scala.inline
    def setDocumentSymbol(value: DocumentSymbolClientCapabilities): Self = StObject.set(x, "documentSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSymbolUndefined: Self = StObject.set(x, "documentSymbol", js.undefined)
    
    @scala.inline
    def setFoldingRange(value: FoldingRangeClientCapabilities): Self = StObject.set(x, "foldingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldingRangeUndefined: Self = StObject.set(x, "foldingRange", js.undefined)
    
    @scala.inline
    def setFormatting(value: DocumentFormattingClientCapabilities): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    @scala.inline
    def setHover(value: HoverClientCapabilities): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setImplementation(value: ImplementationClientCapabilities): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    @scala.inline
    def setOnTypeFormatting(value: DocumentOnTypeFormattingClientCapabilities): Self = StObject.set(x, "onTypeFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTypeFormattingUndefined: Self = StObject.set(x, "onTypeFormatting", js.undefined)
    
    @scala.inline
    def setPublishDiagnostics(value: PublishDiagnosticsClientCapabilities): Self = StObject.set(x, "publishDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDiagnosticsUndefined: Self = StObject.set(x, "publishDiagnostics", js.undefined)
    
    @scala.inline
    def setRangeFormatting(value: DocumentRangeFormattingClientCapabilities): Self = StObject.set(x, "rangeFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeFormattingUndefined: Self = StObject.set(x, "rangeFormatting", js.undefined)
    
    @scala.inline
    def setReferences(value: ReferenceClientCapabilities): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setRename(value: RenameClientCapabilities): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setSelectionRange(value: SelectionRangeClientCapabilities): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRangeUndefined: Self = StObject.set(x, "selectionRange", js.undefined)
    
    @scala.inline
    def setSignatureHelp(value: SignatureHelpClientCapabilities): Self = StObject.set(x, "signatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureHelpUndefined: Self = StObject.set(x, "signatureHelp", js.undefined)
    
    @scala.inline
    def setSynchronization(value: TextDocumentSyncClientCapabilities): Self = StObject.set(x, "synchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronizationUndefined: Self = StObject.set(x, "synchronization", js.undefined)
    
    @scala.inline
    def setTypeDefinition(value: TypeDefinitionClientCapabilities): Self = StObject.set(x, "typeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeDefinitionUndefined: Self = StObject.set(x, "typeDefinition", js.undefined)
  }
}
