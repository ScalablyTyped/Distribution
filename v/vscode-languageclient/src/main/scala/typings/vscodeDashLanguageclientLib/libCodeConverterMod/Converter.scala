package typings
package vscodeDashLanguageclientLib.libCodeConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def asChangeTextDocumentParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidChangeTextDocumentParams = js.native
  def asCloseTextDocumentParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidCloseTextDocumentParams = js.native
  def asCodeActionContext(
    context: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeActionContext */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
  def asCodeLens(item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CodeLens */ js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
  def asCodeLensParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CodeLensParams = js.native
  def asCommand(item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Command */ js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Command = js.native
  def asCompletionItem(
    item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionItem */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CompletionItem = js.native
  def asCompletionParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any,
    position: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any,
    context: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.CompletionContext */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.CompletionParams = js.native
  def asDiagnostic(
    item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Diagnostic */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  def asDiagnosticSeverity(
    value: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DiagnosticSeverity */ js.Any
  ): scala.Double = js.native
  def asDiagnostics(
    items: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Diagnostic */ _
    ]
  ): js.Array[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic
  ] = js.native
  def asDocumentLink(
    item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.DocumentLink */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod.DocumentLink = js.native
  def asDocumentLinkParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentLinkParams = js.native
  def asDocumentSymbolParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams = js.native
  def asFormattingOptions(
    item: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.FormattingOptions */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FormattingOptions = js.native
  def asOpenTextDocumentParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidOpenTextDocumentParams = js.native
  def asPosition(): js.UndefOr[scala.Nothing] = js.native
  def asPosition(
    value: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
  @JSName("asPosition")
  def asPosition_Null(): scala.Null = js.native
  @JSName("asPosition")
  def asPosition_UndefOr(
    value: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any
  ): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position | scala.Null
  ] = js.native
  def asRange(): js.UndefOr[scala.Nothing] = js.native
  def asRange(value: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Range */ js.Any): js.UndefOr[
    vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range | scala.Null
  ] = js.native
  @JSName("asRange")
  def asRange_Null(): scala.Null = js.native
  @JSName("asRange")
  def asRange_Range(value: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Range */ js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range = js.native
  def asReferenceParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any,
    position: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any,
    options: vscodeDashLanguageclientLib.Anon_IncludeDeclaration
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ReferenceParams = js.native
  def asSaveTextDocumentParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asSaveTextDocumentParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any,
    includeContent: scala.Boolean
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DidSaveTextDocumentParams = js.native
  def asTextDocumentIdentifier(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier = js.native
  def asTextDocumentPositionParams(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any,
    position: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.TextDocumentPositionParams = js.native
  def asTextEdit(edit: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextEdit */ js.Any): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
  def asUri(uri: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Uri */ js.Any): java.lang.String = js.native
  def asVersionedTextDocumentIdentifier(
    textDocument: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocument */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  def asWillSaveTextDocumentParams(
    event: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.TextDocumentWillSaveEvent */ js.Any
  ): vscodeDashLanguageserverDashProtocolLib.libProtocolMod.WillSaveTextDocumentParams = js.native
  def asWorkerPosition(
    position: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify code.Position */ js.Any
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position = js.native
}

