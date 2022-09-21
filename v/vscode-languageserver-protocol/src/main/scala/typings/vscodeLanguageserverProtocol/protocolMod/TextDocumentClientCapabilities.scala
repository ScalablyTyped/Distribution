package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolCallHierarchyMod.CallHierarchyClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolDiagnosticMod.DiagnosticClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolInlayHintMod.InlayHintClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolInlineValueMod.InlineValueClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolLinkedEditingRangeMod.LinkedEditingRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMonikerMod.MonikerClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSemanticTokensMod.SemanticTokensClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolTypeHierarchyMod.TypeHierarchyClientCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentClientCapabilities extends StObject {
  
  /**
    * Capabilities specific to the various call hierarchy requests.
    *
    * @since 3.16.0
    */
  var callHierarchy: js.UndefOr[CallHierarchyClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/codeAction` request.
    */
  var codeAction: js.UndefOr[CodeActionClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/codeLens` request.
    */
  var codeLens: js.UndefOr[CodeLensClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/documentColor` and the
    * `textDocument/colorPresentation` request.
    *
    * @since 3.6.0
    */
  var colorProvider: js.UndefOr[DocumentColorClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/completion` request.
    */
  var completion: js.UndefOr[CompletionClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/declaration` request.
    *
    * @since 3.14.0
    */
  var declaration: js.UndefOr[DeclarationClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/definition` request.
    */
  var definition: js.UndefOr[DefinitionClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the diagnostic pull model.
    *
    * @since 3.17.0
    */
  var diagnostic: js.UndefOr[DiagnosticClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/documentHighlight` request.
    */
  var documentHighlight: js.UndefOr[DocumentHighlightClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/documentLink` request.
    */
  var documentLink: js.UndefOr[DocumentLinkClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/documentSymbol` request.
    */
  var documentSymbol: js.UndefOr[DocumentSymbolClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/foldingRange` request.
    *
    * @since 3.10.0
    */
  var foldingRange: js.UndefOr[FoldingRangeClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/formatting` request.
    */
  var formatting: js.UndefOr[DocumentFormattingClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/hover` request.
    */
  var hover: js.UndefOr[HoverClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/implementation` request.
    *
    * @since 3.6.0
    */
  var implementation: js.UndefOr[ImplementationClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/inlayHint` request.
    *
    * @since 3.17.0
    */
  var inlayHint: js.UndefOr[InlayHintClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/inlineValue` request.
    *
    * @since 3.17.0
    */
  var inlineValue: js.UndefOr[InlineValueClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/linkedEditingRange` request.
    *
    * @since 3.16.0
    */
  var linkedEditingRange: js.UndefOr[LinkedEditingRangeClientCapabilities] = js.undefined
  
  /**
    * Client capabilities specific to the `textDocument/moniker` request.
    *
    * @since 3.16.0
    */
  var moniker: js.UndefOr[MonikerClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting` request.
    */
  var onTypeFormatting: js.UndefOr[DocumentOnTypeFormattingClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/publishDiagnostics` notification.
    */
  var publishDiagnostics: js.UndefOr[PublishDiagnosticsClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/rangeFormatting` request.
    */
  var rangeFormatting: js.UndefOr[DocumentRangeFormattingClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/references` request.
    */
  var references: js.UndefOr[ReferenceClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/rename` request.
    */
  var rename: js.UndefOr[RenameClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/selectionRange` request.
    *
    * @since 3.15.0
    */
  var selectionRange: js.UndefOr[SelectionRangeClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the various semantic token request.
    *
    * @since 3.16.0
    */
  var semanticTokens: js.UndefOr[SemanticTokensClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/signatureHelp` request.
    */
  var signatureHelp: js.UndefOr[SignatureHelpClientCapabilities] = js.undefined
  
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[TextDocumentSyncClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the `textDocument/typeDefinition` request.
    *
    * @since 3.6.0
    */
  var typeDefinition: js.UndefOr[TypeDefinitionClientCapabilities] = js.undefined
  
  /**
    * Capabilities specific to the various type hierarchy requests.
    *
    * @since 3.17.0
    */
  var typeHierarchy: js.UndefOr[TypeHierarchyClientCapabilities] = js.undefined
}
object TextDocumentClientCapabilities {
  
  inline def apply(): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
  
  extension [Self <: TextDocumentClientCapabilities](x: Self) {
    
    inline def setCallHierarchy(value: CallHierarchyClientCapabilities): Self = StObject.set(x, "callHierarchy", value.asInstanceOf[js.Any])
    
    inline def setCallHierarchyUndefined: Self = StObject.set(x, "callHierarchy", js.undefined)
    
    inline def setCodeAction(value: CodeActionClientCapabilities): Self = StObject.set(x, "codeAction", value.asInstanceOf[js.Any])
    
    inline def setCodeActionUndefined: Self = StObject.set(x, "codeAction", js.undefined)
    
    inline def setCodeLens(value: CodeLensClientCapabilities): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
    
    inline def setCodeLensUndefined: Self = StObject.set(x, "codeLens", js.undefined)
    
    inline def setColorProvider(value: DocumentColorClientCapabilities): Self = StObject.set(x, "colorProvider", value.asInstanceOf[js.Any])
    
    inline def setColorProviderUndefined: Self = StObject.set(x, "colorProvider", js.undefined)
    
    inline def setCompletion(value: CompletionClientCapabilities): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
    
    inline def setDeclaration(value: DeclarationClientCapabilities): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setDefinition(value: DefinitionClientCapabilities): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDiagnostic(value: DiagnosticClientCapabilities): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticUndefined: Self = StObject.set(x, "diagnostic", js.undefined)
    
    inline def setDocumentHighlight(value: DocumentHighlightClientCapabilities): Self = StObject.set(x, "documentHighlight", value.asInstanceOf[js.Any])
    
    inline def setDocumentHighlightUndefined: Self = StObject.set(x, "documentHighlight", js.undefined)
    
    inline def setDocumentLink(value: DocumentLinkClientCapabilities): Self = StObject.set(x, "documentLink", value.asInstanceOf[js.Any])
    
    inline def setDocumentLinkUndefined: Self = StObject.set(x, "documentLink", js.undefined)
    
    inline def setDocumentSymbol(value: DocumentSymbolClientCapabilities): Self = StObject.set(x, "documentSymbol", value.asInstanceOf[js.Any])
    
    inline def setDocumentSymbolUndefined: Self = StObject.set(x, "documentSymbol", js.undefined)
    
    inline def setFoldingRange(value: FoldingRangeClientCapabilities): Self = StObject.set(x, "foldingRange", value.asInstanceOf[js.Any])
    
    inline def setFoldingRangeUndefined: Self = StObject.set(x, "foldingRange", js.undefined)
    
    inline def setFormatting(value: DocumentFormattingClientCapabilities): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    inline def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    inline def setHover(value: HoverClientCapabilities): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setImplementation(value: ImplementationClientCapabilities): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
    
    inline def setInlayHint(value: InlayHintClientCapabilities): Self = StObject.set(x, "inlayHint", value.asInstanceOf[js.Any])
    
    inline def setInlayHintUndefined: Self = StObject.set(x, "inlayHint", js.undefined)
    
    inline def setInlineValue(value: InlineValueClientCapabilities): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    
    inline def setInlineValueUndefined: Self = StObject.set(x, "inlineValue", js.undefined)
    
    inline def setLinkedEditingRange(value: LinkedEditingRangeClientCapabilities): Self = StObject.set(x, "linkedEditingRange", value.asInstanceOf[js.Any])
    
    inline def setLinkedEditingRangeUndefined: Self = StObject.set(x, "linkedEditingRange", js.undefined)
    
    inline def setMoniker(value: MonikerClientCapabilities): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
    
    inline def setMonikerUndefined: Self = StObject.set(x, "moniker", js.undefined)
    
    inline def setOnTypeFormatting(value: DocumentOnTypeFormattingClientCapabilities): Self = StObject.set(x, "onTypeFormatting", value.asInstanceOf[js.Any])
    
    inline def setOnTypeFormattingUndefined: Self = StObject.set(x, "onTypeFormatting", js.undefined)
    
    inline def setPublishDiagnostics(value: PublishDiagnosticsClientCapabilities): Self = StObject.set(x, "publishDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setPublishDiagnosticsUndefined: Self = StObject.set(x, "publishDiagnostics", js.undefined)
    
    inline def setRangeFormatting(value: DocumentRangeFormattingClientCapabilities): Self = StObject.set(x, "rangeFormatting", value.asInstanceOf[js.Any])
    
    inline def setRangeFormattingUndefined: Self = StObject.set(x, "rangeFormatting", js.undefined)
    
    inline def setReferences(value: ReferenceClientCapabilities): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setRename(value: RenameClientCapabilities): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setSelectionRange(value: SelectionRangeClientCapabilities): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    inline def setSelectionRangeUndefined: Self = StObject.set(x, "selectionRange", js.undefined)
    
    inline def setSemanticTokens(value: SemanticTokensClientCapabilities): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    
    inline def setSemanticTokensUndefined: Self = StObject.set(x, "semanticTokens", js.undefined)
    
    inline def setSignatureHelp(value: SignatureHelpClientCapabilities): Self = StObject.set(x, "signatureHelp", value.asInstanceOf[js.Any])
    
    inline def setSignatureHelpUndefined: Self = StObject.set(x, "signatureHelp", js.undefined)
    
    inline def setSynchronization(value: TextDocumentSyncClientCapabilities): Self = StObject.set(x, "synchronization", value.asInstanceOf[js.Any])
    
    inline def setSynchronizationUndefined: Self = StObject.set(x, "synchronization", js.undefined)
    
    inline def setTypeDefinition(value: TypeDefinitionClientCapabilities): Self = StObject.set(x, "typeDefinition", value.asInstanceOf[js.Any])
    
    inline def setTypeDefinitionUndefined: Self = StObject.set(x, "typeDefinition", js.undefined)
    
    inline def setTypeHierarchy(value: TypeHierarchyClientCapabilities): Self = StObject.set(x, "typeHierarchy", value.asInstanceOf[js.Any])
    
    inline def setTypeHierarchyUndefined: Self = StObject.set(x, "typeHierarchy", js.undefined)
  }
}
