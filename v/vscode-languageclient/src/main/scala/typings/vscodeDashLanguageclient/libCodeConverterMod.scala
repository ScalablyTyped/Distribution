package typings.vscodeDashLanguageclient

import typings.vscode.vscodeMod.CodeActionContext
import typings.vscode.vscodeMod.CodeLens
import typings.vscode.vscodeMod.Command
import typings.vscode.vscodeMod.CompletionContext
import typings.vscode.vscodeMod.CompletionItem
import typings.vscode.vscodeMod.Diagnostic
import typings.vscode.vscodeMod.DiagnosticSeverity
import typings.vscode.vscodeMod.DocumentLink
import typings.vscode.vscodeMod.FormattingOptions
import typings.vscode.vscodeMod.Position
import typings.vscode.vscodeMod.Range
import typings.vscode.vscodeMod.TextDocument
import typings.vscode.vscodeMod.TextDocumentChangeEvent
import typings.vscode.vscodeMod.TextDocumentWillSaveEvent
import typings.vscode.vscodeMod.TextEdit
import typings.vscode.vscodeMod.Uri
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidChangeTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidCloseTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidOpenTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidSaveTextDocumentParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ReferenceParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.WillSaveTextDocumentParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/codeConverter", JSImport.Namespace)
@js.native
object libCodeConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    def asCodeActionContext(context: CodeActionContext): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
    def asCodeLens(item: CodeLens): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    def asCommand(item: Command): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command = js.native
    def asCompletionItem(item: CompletionItem): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem = js.native
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    def asDiagnostic(item: Diagnostic): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    def asDiagnostics(items: js.Array[Diagnostic]): js.Array[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
      ] = js.native
    def asDocumentLink(item: DocumentLink): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentLink = js.native
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    def asDocumentSymbolParams(textDocument: TextDocument): js.Any = js.native
    def asFormattingOptions(item: FormattingOptions): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FormattingOptions = js.native
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position | Null
      ] = js.native
    @JSName("asPosition")
    def asPosition_Null(): Null = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[
        typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range | Null
      ] = js.native
    @JSName("asRange")
    def asRange_Null(): Null = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range = js.native
    def asReferenceParams(textDocument: TextDocument, position: Position, options: Anon_IncludeDeclaration): ReferenceParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    def asTextEdit(edit: TextEdit): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
    def asUri(uri: Uri): String = js.native
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    def asWorkerPosition(position: Position): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ Uri, String]
}

