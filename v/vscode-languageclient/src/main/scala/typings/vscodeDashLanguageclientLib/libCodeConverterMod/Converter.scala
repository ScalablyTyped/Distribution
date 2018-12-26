package typings
package vscodeDashLanguageclientLib.libCodeConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def asChangeTextDocumentParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeTextDocumentParams = js.native
  def asCloseTextDocumentParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidCloseTextDocumentParams = js.native
  def asCodeActionContext(context: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  def asCodeLens(item: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
  def asCodeLensParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CodeLensParams = js.native
  def asCommand(item: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command = js.native
  def asCompletionItem(item: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem = js.native
  def asCompletionParams(textDocument: js.Any, position: js.Any, context: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CompletionParams = js.native
  def asDiagnostic(item: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def asDiagnosticSeverity(value: js.Any): scala.Double = js.native
  def asDiagnostics(items: js.Array[_]): js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
  ] = js.native
  def asDocumentLink(item: js.Any): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink = js.native
  def asDocumentLinkParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentLinkParams = js.native
  def asDocumentSymbolParams(textDocument: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams = js.native
  def asFormattingOptions(item: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions = js.native
  def asOpenTextDocumentParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidOpenTextDocumentParams = js.native
  def asPosition(): js.UndefOr[scala.Nothing] = js.native
  def asPosition(value: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
  @JSName("asPosition")
  def asPosition_Null(): scala.Null = js.native
  @JSName("asPosition")
  def asPosition_UndefOr(value: js.Any): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position | scala.Null
  ] = js.native
  def asRange(): js.UndefOr[scala.Nothing] = js.native
  def asRange(value: js.Any): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range | scala.Null
  ] = js.native
  @JSName("asRange")
  def asRange_Null(): scala.Null = js.native
  @JSName("asRange")
  def asRange_Range(value: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range = js.native
  def asReferenceParams(
    textDocument: js.Any,
    position: js.Any,
    options: vscodeDashLanguageclientLib.Anon_IncludeDeclaration
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ReferenceParams = js.native
  def asSaveTextDocumentParams(textDocument: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asSaveTextDocumentParams(textDocument: js.Any, includeContent: scala.Boolean): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asTextDocumentIdentifier(textDocument: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier = js.native
  def asTextDocumentPositionParams(textDocument: js.Any, position: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams = js.native
  def asTextEdit(edit: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def asUri(uri: js.Any): java.lang.String = js.native
  def asVersionedTextDocumentIdentifier(textDocument: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  def asWillSaveTextDocumentParams(event: js.Any): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.WillSaveTextDocumentParams = js.native
  def asWorkerPosition(position: js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
}

