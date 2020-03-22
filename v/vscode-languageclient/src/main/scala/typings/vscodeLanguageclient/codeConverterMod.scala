package typings.vscodeLanguageclient

import typings.vscode.mod.CodeActionContext
import typings.vscode.mod.CodeLens
import typings.vscode.mod.Command
import typings.vscode.mod.CompletionContext
import typings.vscode.mod.CompletionItem
import typings.vscode.mod.Diagnostic
import typings.vscode.mod.DiagnosticSeverity
import typings.vscode.mod.DiagnosticTag
import typings.vscode.mod.DocumentLink
import typings.vscode.mod.FormattingOptions
import typings.vscode.mod.Location
import typings.vscode.mod.Position
import typings.vscode.mod.Range
import typings.vscode.mod.SignatureHelpContext
import typings.vscode.mod.SymbolKind
import typings.vscode.mod.SymbolTag
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TextDocumentChangeEvent
import typings.vscode.mod.TextDocumentWillSaveEvent
import typings.vscode.mod.TextEdit
import typings.vscode.mod.Uri
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/codeConverter", JSImport.Namespace)
@js.native
object codeConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    def asCodeActionContext(context: CodeActionContext): typings.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
    def asCodeLens(item: CodeLens): typings.vscodeLanguageserverTypes.mod.CodeLens = js.native
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    def asCommand(item: Command): typings.vscodeLanguageserverTypes.mod.Command = js.native
    def asCompletionItem(item: CompletionItem): typings.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    def asDiagnostic(item: Diagnostic): typings.vscodeLanguageserverTypes.mod.Diagnostic = js.native
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    def asDiagnosticTag(value: DiagnosticTag): js.UndefOr[Double] = js.native
    def asDiagnostics(items: js.Array[Diagnostic]): js.Array[typings.vscodeLanguageserverTypes.mod.Diagnostic] = js.native
    def asDocumentLink(item: DocumentLink): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    def asDocumentSymbolParams(textDocument: TextDocument): DocumentSymbolParams = js.native
    def asFormattingOptions(item: FormattingOptions): typings.vscodeLanguageserverTypes.mod.FormattingOptions = js.native
    def asLocation(): Null = js.native
    def asLocation(value: Location): js.UndefOr[typings.vscodeLanguageserverTypes.mod.Location | Null] = js.native
    @JSName("asLocation")
    def asLocation_Location(value: Location): typings.vscodeLanguageserverTypes.mod.Location = js.native
    @JSName("asLocation")
    def asLocation_Union(): js.UndefOr[scala.Nothing] = js.native
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    def asPosition(): Null = js.native
    def asPosition(value: Position): js.UndefOr[typings.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typings.vscodeLanguageserverTypes.mod.Position = js.native
    @JSName("asPosition")
    def asPosition_Union(): js.UndefOr[scala.Nothing] = js.native
    def asPositions(value: js.Array[Position]): js.Array[typings.vscodeLanguageserverTypes.mod.Position] = js.native
    def asRange(): Null = js.native
    def asRange(value: Range): js.UndefOr[typings.vscodeLanguageserverTypes.mod.Range | Null] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typings.vscodeLanguageserverTypes.mod.Range = js.native
    @JSName("asRange")
    def asRange_Union(): js.UndefOr[scala.Nothing] = js.native
    def asReferenceParams(textDocument: TextDocument, position: Position, options: AnonIncludeDeclaration): ReferenceParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    def asSignatureHelpParams(textDocument: TextDocument, position: Position, context: SignatureHelpContext): SignatureHelpParams = js.native
    def asSymbolKind(item: SymbolKind): typings.vscodeLanguageserverTypes.mod.SymbolKind = js.native
    def asSymbolTag(item: SymbolTag): typings.vscodeLanguageserverTypes.mod.SymbolTag = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.Array[typings.vscodeLanguageserverTypes.mod.SymbolTag] = js.native
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    def asTextEdit(edit: TextEdit): typings.vscodeLanguageserverTypes.mod.TextEdit = js.native
    def asUri(uri: Uri): String = js.native
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    def asWorkerPosition(position: Position): typings.vscodeLanguageserverTypes.mod.Position = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ Uri, String]
}

