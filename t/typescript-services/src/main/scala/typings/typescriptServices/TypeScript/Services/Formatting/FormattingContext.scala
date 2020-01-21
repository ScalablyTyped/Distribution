package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.FormattingContext")
@js.native
class FormattingContext protected () extends js.Object {
  def this(snapshot: ITextSnapshot, formattingRequestKind: FormattingRequestKind) = this()
  var contextNode: IndentationNodeContext = js.native
  var contextNodeAllOnSameLine: js.Any = js.native
  var contextNodeBlockIsOnOneLine: js.Any = js.native
  var currentTokenParent: IndentationNodeContext = js.native
  var currentTokenSpan: TokenSpan = js.native
  var formattingRequestKind: FormattingRequestKind = js.native
  var nextNodeAllOnSameLine: js.Any = js.native
  var nextNodeBlockIsOnOneLine: js.Any = js.native
  var nextTokenParent: IndentationNodeContext = js.native
  var nextTokenSpan: TokenSpan = js.native
  var snapshot: js.Any = js.native
  var tokensAreOnSameLine: js.Any = js.native
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  def ContextNodeAllOnSameLine(): Boolean = js.native
  def ContextNodeBlockIsOnOneLine(): Boolean = js.native
  def NextNodeAllOnSameLine(): Boolean = js.native
  def NextNodeBlockIsOnOneLine(): Boolean = js.native
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean = js.native
  def TokensAreOnSameLine(): Boolean = js.native
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit = js.native
}

