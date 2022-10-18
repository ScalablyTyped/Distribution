package typings.vscodeLanguageclient

import typings.vscode.mod.CallHierarchyItem
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.CodeAction
import typings.vscode.mod.CodeActionContext
import typings.vscode.mod.CodeLens
import typings.vscode.mod.Command
import typings.vscode.mod.CompletionContext
import typings.vscode.mod.CompletionItem
import typings.vscode.mod.Diagnostic
import typings.vscode.mod.DiagnosticSeverity
import typings.vscode.mod.DiagnosticTag
import typings.vscode.mod.DocumentLink
import typings.vscode.mod.FileCreateEvent
import typings.vscode.mod.FileDeleteEvent
import typings.vscode.mod.FileRenameEvent
import typings.vscode.mod.FormattingOptions
import typings.vscode.mod.InlayHint
import typings.vscode.mod.InlineValueContext
import typings.vscode.mod.Position
import typings.vscode.mod.SignatureHelpContext
import typings.vscode.mod.SymbolInformation
import typings.vscode.mod.SymbolKind
import typings.vscode.mod.SymbolTag
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TextDocumentChangeEvent
import typings.vscode.mod.TextDocumentWillSaveEvent
import typings.vscode.mod.TextEdit
import typings.vscode.mod.TypeHierarchyItem
import typings.vscode.mod.Uri
import typings.vscodeLanguageclient.anon.IncludeDeclaration
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidCloseTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidOpenTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCodeConverterMod {
  
  @JSImport("vscode-languageclient/lib/common/codeConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConverter(): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")().asInstanceOf[Converter]
  inline def createConverter(uriConverter: URIConverter): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")(uriConverter.asInstanceOf[js.Any]).asInstanceOf[Converter]
  
  @js.native
  trait Converter extends StObject {
    
    def asCallHierarchyItem(value: CallHierarchyItem): typings.vscodeLanguageserverTypes.mod.CallHierarchyItem = js.native
    
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    
    def asCodeAction(item: CodeAction): js.Promise[typings.vscodeLanguageserverTypes.mod.CodeAction] = js.native
    def asCodeAction(item: CodeAction, token: CancellationToken): js.Promise[typings.vscodeLanguageserverTypes.mod.CodeAction] = js.native
    
    def asCodeActionContext(context: CodeActionContext): js.Promise[typings.vscodeLanguageserverTypes.mod.CodeActionContext] = js.native
    def asCodeActionContext(context: CodeActionContext, token: CancellationToken): js.Promise[typings.vscodeLanguageserverTypes.mod.CodeActionContext] = js.native
    
    def asCodeLens(item: CodeLens): typings.vscodeLanguageserverTypes.mod.CodeLens = js.native
    
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    
    def asCommand(item: Command): typings.vscodeLanguageserverTypes.mod.Command = js.native
    
    def asCompletionItem(item: CompletionItem): typings.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    def asCompletionItem(item: CompletionItem, labelDetailsSupport: Boolean): typings.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    
    def asDiagnostic(item: Diagnostic): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
    
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    
    def asDiagnosticTag(value: DiagnosticTag): js.UndefOr[Double] = js.native
    
    def asDiagnostics(items: js.Array[Diagnostic]): js.Promise[js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]] = js.native
    def asDiagnostics(items: js.Array[Diagnostic], token: CancellationToken): js.Promise[js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic]] = js.native
    
    def asDidCreateFilesParams(event: FileCreateEvent): CreateFilesParams = js.native
    
    def asDidDeleteFilesParams(event: FileDeleteEvent): DeleteFilesParams = js.native
    
    def asDidRenameFilesParams(event: FileRenameEvent): RenameFilesParams = js.native
    
    def asDocumentLink(item: DocumentLink): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
    
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    
    def asDocumentSymbolParams(textDocument: TextDocument): DocumentSymbolParams = js.native
    
    def asFormattingOptions(options: FormattingOptions, fileOptions: FileFormattingOptions): typings.vscodeLanguageserverTypes.mod.FormattingOptions = js.native
    
    def asInlayHint(value: InlayHint): typings.vscodeLanguageserverTypes.mod.InlayHint = js.native
    
    def asInlineValueContext(context: InlineValueContext): typings.vscodeLanguageserverTypes.mod.InlineValueContext = js.native
    
    def asLocation(): js.UndefOr[Location | Null] = js.native
    def asLocation(value: Null): Null = js.native
    def asLocation(value: Unit): Unit = js.native
    def asLocation(value: typings.vscode.mod.Location): js.UndefOr[Location | Null] = js.native
    @JSName("asLocation")
    def asLocation_Location(value: typings.vscode.mod.Location): Location = js.native
    
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    
    def asPosition(): js.UndefOr[typings.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    def asPosition(value: Null): Null = js.native
    def asPosition(value: Unit): Unit = js.native
    def asPosition(value: Position): js.UndefOr[typings.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typings.vscodeLanguageserverTypes.mod.Position = js.native
    
    def asPositions(value: js.Array[Position]): js.Promise[js.Array[typings.vscodeLanguageserverTypes.mod.Position]] = js.native
    def asPositions(value: js.Array[Position], token: CancellationToken): js.Promise[js.Array[typings.vscodeLanguageserverTypes.mod.Position]] = js.native
    
    def asRange(): js.UndefOr[Range | Null] = js.native
    def asRange(value: Null): Null = js.native
    def asRange(value: Unit): Unit = js.native
    def asRange(value: typings.vscode.mod.Range): js.UndefOr[Range | Null] = js.native
    @JSName("asRange")
    def asRange_Range(value: typings.vscode.mod.Range): Range = js.native
    
    def asReferenceParams(textDocument: TextDocument, position: Position, options: IncludeDeclaration): ReferenceParams = js.native
    
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    
    def asSignatureHelpParams(textDocument: TextDocument, position: Position, context: SignatureHelpContext): SignatureHelpParams = js.native
    
    def asSymbolKind(item: SymbolKind): typings.vscodeLanguageserverTypes.mod.SymbolKind = js.native
    
    def asSymbolTag(item: SymbolTag): typings.vscodeLanguageserverTypes.mod.SymbolTag = js.native
    
    def asSymbolTags(items: js.Array[SymbolTag]): js.Array[typings.vscodeLanguageserverTypes.mod.SymbolTag] = js.native
    
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    
    def asTextDocumentItem(textDocument: TextDocument): TextDocumentItem = js.native
    
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    
    def asTextEdit(edit: TextEdit): typings.vscodeLanguageserverTypes.mod.TextEdit = js.native
    
    def asTypeHierarchyItem(value: TypeHierarchyItem): typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem = js.native
    
    def asUri(uri: Uri): String = js.native
    
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    
    def asWillCreateFilesParams(event: FileCreateEvent): CreateFilesParams = js.native
    
    def asWillDeleteFilesParams(event: FileDeleteEvent): DeleteFilesParams = js.native
    
    def asWillRenameFilesParams(event: FileRenameEvent): RenameFilesParams = js.native
    
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    
    def asWorkerPosition(position: Position): typings.vscodeLanguageserverTypes.mod.Position = js.native
    
    def asWorkspaceSymbol(item: SymbolInformation): WorkspaceSymbol = js.native
  }
  
  trait FileFormattingOptions extends StObject {
    
    var insertFinalNewline: js.UndefOr[Boolean] = js.undefined
    
    var trimFinalNewlines: js.UndefOr[Boolean] = js.undefined
    
    var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  object FileFormattingOptions {
    
    inline def apply(): FileFormattingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileFormattingOptions]
    }
    
    extension [Self <: FileFormattingOptions](x: Self) {
      
      inline def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
      
      inline def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
      
      inline def setTrimFinalNewlines(value: Boolean): Self = StObject.set(x, "trimFinalNewlines", value.asInstanceOf[js.Any])
      
      inline def setTrimFinalNewlinesUndefined: Self = StObject.set(x, "trimFinalNewlines", js.undefined)
      
      inline def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
    }
  }
  
  type URIConverter = js.Function1[/* value */ Uri, String]
}
