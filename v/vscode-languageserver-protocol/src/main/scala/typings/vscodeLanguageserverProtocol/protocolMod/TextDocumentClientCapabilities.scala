package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionClientCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentClientCapabilities extends js.Object {
  
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[CodeActionClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[CodeLensClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/documentColor`
    */
  var colorProvider: js.UndefOr[DocumentColorClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[CompletionClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/declaration`
    *
    * @since 3.14.0
    */
  var declaration: js.UndefOr[DeclarationClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[DefinitionClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[DocumentHighlightClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[DocumentLinkClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[DocumentSymbolClientCapabilities] = js.native
  
  /**
    * Capabilities specific to `textDocument/foldingRange` requests.
    *
    * @since 3.10.0
    */
  var foldingRange: js.UndefOr[FoldingRangeClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[DocumentFormattingClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[HoverClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/implementation`
    *
    * @since 3.6.0
    */
  var implementation: js.UndefOr[ImplementationClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[DocumentOnTypeFormattingClientCapabilities] = js.native
  
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[PublishDiagnosticsClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[DocumentRangeFormattingClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[ReferenceClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[RenameClientCapabilities] = js.native
  
  /**
    * Capabilities specific to `textDocument/selectionRange` requests
    *
    * @since 3.15.0
    */
  var selectionRange: js.UndefOr[SelectionRangeClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[SignatureHelpClientCapabilities] = js.native
  
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[TextDocumentSyncClientCapabilities] = js.native
  
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    *
    * @since 3.6.0
    */
  var typeDefinition: js.UndefOr[TypeDefinitionClientCapabilities] = js.native
}
object TextDocumentClientCapabilities {
  
  @scala.inline
  def apply(): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
  
  @scala.inline
  implicit class TextDocumentClientCapabilitiesOps[Self <: TextDocumentClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCodeAction(value: CodeActionClientCapabilities): Self = this.set("codeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeAction: Self = this.set("codeAction", js.undefined)
    
    @scala.inline
    def setCodeLens(value: CodeLensClientCapabilities): Self = this.set("codeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeLens: Self = this.set("codeLens", js.undefined)
    
    @scala.inline
    def setColorProvider(value: DocumentColorClientCapabilities): Self = this.set("colorProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorProvider: Self = this.set("colorProvider", js.undefined)
    
    @scala.inline
    def setCompletion(value: CompletionClientCapabilities): Self = this.set("completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletion: Self = this.set("completion", js.undefined)
    
    @scala.inline
    def setDeclaration(value: DeclarationClientCapabilities): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionClientCapabilities): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDocumentHighlight(value: DocumentHighlightClientCapabilities): Self = this.set("documentHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentHighlight: Self = this.set("documentHighlight", js.undefined)
    
    @scala.inline
    def setDocumentLink(value: DocumentLinkClientCapabilities): Self = this.set("documentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentLink: Self = this.set("documentLink", js.undefined)
    
    @scala.inline
    def setDocumentSymbol(value: DocumentSymbolClientCapabilities): Self = this.set("documentSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentSymbol: Self = this.set("documentSymbol", js.undefined)
    
    @scala.inline
    def setFoldingRange(value: FoldingRangeClientCapabilities): Self = this.set("foldingRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldingRange: Self = this.set("foldingRange", js.undefined)
    
    @scala.inline
    def setFormatting(value: DocumentFormattingClientCapabilities): Self = this.set("formatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatting: Self = this.set("formatting", js.undefined)
    
    @scala.inline
    def setHover(value: HoverClientCapabilities): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setImplementation(value: ImplementationClientCapabilities): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setOnTypeFormatting(value: DocumentOnTypeFormattingClientCapabilities): Self = this.set("onTypeFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTypeFormatting: Self = this.set("onTypeFormatting", js.undefined)
    
    @scala.inline
    def setPublishDiagnostics(value: PublishDiagnosticsClientCapabilities): Self = this.set("publishDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishDiagnostics: Self = this.set("publishDiagnostics", js.undefined)
    
    @scala.inline
    def setRangeFormatting(value: DocumentRangeFormattingClientCapabilities): Self = this.set("rangeFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeFormatting: Self = this.set("rangeFormatting", js.undefined)
    
    @scala.inline
    def setReferences(value: ReferenceClientCapabilities): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setRename(value: RenameClientCapabilities): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setSelectionRange(value: SelectionRangeClientCapabilities): Self = this.set("selectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionRange: Self = this.set("selectionRange", js.undefined)
    
    @scala.inline
    def setSignatureHelp(value: SignatureHelpClientCapabilities): Self = this.set("signatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureHelp: Self = this.set("signatureHelp", js.undefined)
    
    @scala.inline
    def setSynchronization(value: TextDocumentSyncClientCapabilities): Self = this.set("synchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronization: Self = this.set("synchronization", js.undefined)
    
    @scala.inline
    def setTypeDefinition(value: TypeDefinitionClientCapabilities): Self = this.set("typeDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeDefinition: Self = this.set("typeDefinition", js.undefined)
  }
}
