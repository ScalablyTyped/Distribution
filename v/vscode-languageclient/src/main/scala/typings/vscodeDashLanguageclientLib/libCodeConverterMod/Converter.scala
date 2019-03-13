package typings
package vscodeDashLanguageclientLib.libCodeConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def asChangeTextDocumentParams(event: vscodeLib.vscodeMod.TextDocumentChangeEvent): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeTextDocumentParams = js.native
  def asChangeTextDocumentParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeTextDocumentParams = js.native
  def asCloseTextDocumentParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidCloseTextDocumentParams = js.native
  def asCodeActionContext(context: vscodeLib.vscodeMod.CodeActionContext): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  def asCodeLens(item: vscodeLib.vscodeMod.CodeLens): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
  def asCodeLensParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CodeLensParams = js.native
  def asCommand(item: vscodeLib.vscodeMod.Command): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command = js.native
  def asCompletionItem(item: vscodeLib.vscodeMod.CompletionItem): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem = js.native
  def asCompletionParams(
    textDocument: vscodeLib.vscodeMod.TextDocument,
    position: vscodeLib.vscodeMod.Position,
    context: vscodeLib.vscodeMod.CompletionContext
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CompletionParams = js.native
  def asDiagnostic(item: vscodeLib.vscodeMod.Diagnostic): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def asDiagnosticSeverity(value: vscodeLib.vscodeMod.DiagnosticSeverity): scala.Double = js.native
  def asDiagnostics(items: js.Array[vscodeLib.vscodeMod.Diagnostic]): js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
  ] = js.native
  def asDocumentLink(item: vscodeLib.vscodeMod.DocumentLink): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink = js.native
  def asDocumentLinkParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentLinkParams = js.native
  def asDocumentSymbolParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams = js.native
  def asFormattingOptions(item: vscodeLib.vscodeMod.FormattingOptions): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions = js.native
  def asOpenTextDocumentParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidOpenTextDocumentParams = js.native
  def asPosition(): js.UndefOr[scala.Nothing] = js.native
  def asPosition(value: vscodeLib.vscodeMod.Position): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
  @JSName("asPosition")
  def asPosition_Null(): scala.Null = js.native
  @JSName("asPosition")
  def asPosition_UndefOr(value: vscodeLib.vscodeMod.Position): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position | scala.Null
  ] = js.native
  def asRange(): js.UndefOr[scala.Nothing] = js.native
  def asRange(value: vscodeLib.vscodeMod.Range): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range | scala.Null
  ] = js.native
  @JSName("asRange")
  def asRange_Null(): scala.Null = js.native
  @JSName("asRange")
  def asRange_Range(value: vscodeLib.vscodeMod.Range): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range = js.native
  def asReferenceParams(
    textDocument: vscodeLib.vscodeMod.TextDocument,
    position: vscodeLib.vscodeMod.Position,
    options: vscodeDashLanguageclientLib.Anon_IncludeDeclaration
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ReferenceParams = js.native
  def asSaveTextDocumentParams(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asSaveTextDocumentParams(textDocument: vscodeLib.vscodeMod.TextDocument, includeContent: scala.Boolean): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asTextDocumentIdentifier(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier = js.native
  def asTextDocumentPositionParams(textDocument: vscodeLib.vscodeMod.TextDocument, position: vscodeLib.vscodeMod.Position): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams = js.native
  def asTextEdit(edit: vscodeLib.vscodeMod.TextEdit): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def asUri(uri: vscodeLib.vscodeMod.Uri): java.lang.String = js.native
  def asVersionedTextDocumentIdentifier(textDocument: vscodeLib.vscodeMod.TextDocument): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  def asWillSaveTextDocumentParams(event: vscodeLib.vscodeMod.TextDocumentWillSaveEvent): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.WillSaveTextDocumentParams = js.native
  def asWorkerPosition(position: vscodeLib.vscodeMod.Position): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
}

