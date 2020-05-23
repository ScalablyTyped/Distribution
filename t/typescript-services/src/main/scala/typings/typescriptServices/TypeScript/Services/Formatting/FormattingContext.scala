package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingContext extends js.Object {
  var contextNode: IndentationNodeContext
  var contextNodeAllOnSameLine: js.Any
  var contextNodeBlockIsOnOneLine: js.Any
  var currentTokenParent: IndentationNodeContext
  var currentTokenSpan: TokenSpan
  var formattingRequestKind: FormattingRequestKind
  var nextNodeAllOnSameLine: js.Any
  var nextNodeBlockIsOnOneLine: js.Any
  var nextTokenParent: IndentationNodeContext
  var nextTokenSpan: TokenSpan
  var snapshot: js.Any
  var tokensAreOnSameLine: js.Any
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean
  def ContextNodeAllOnSameLine(): Boolean
  def ContextNodeBlockIsOnOneLine(): Boolean
  def NextNodeAllOnSameLine(): Boolean
  def NextNodeBlockIsOnOneLine(): Boolean
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean
  def TokensAreOnSameLine(): Boolean
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit
}

object FormattingContext {
  @scala.inline
  def apply(
    BlockIsOnOneLine: IndentationNodeContext => Boolean,
    ContextNodeAllOnSameLine: () => Boolean,
    ContextNodeBlockIsOnOneLine: () => Boolean,
    NextNodeAllOnSameLine: () => Boolean,
    NextNodeBlockIsOnOneLine: () => Boolean,
    NodeIsOnOneLine: IndentationNodeContext => Boolean,
    TokensAreOnSameLine: () => Boolean,
    contextNode: IndentationNodeContext,
    contextNodeAllOnSameLine: js.Any,
    contextNodeBlockIsOnOneLine: js.Any,
    currentTokenParent: IndentationNodeContext,
    currentTokenSpan: TokenSpan,
    formattingRequestKind: FormattingRequestKind,
    nextNodeAllOnSameLine: js.Any,
    nextNodeBlockIsOnOneLine: js.Any,
    nextTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    snapshot: js.Any,
    tokensAreOnSameLine: js.Any,
    updateContext: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Unit
  ): FormattingContext = {
    val __obj = js.Dynamic.literal(BlockIsOnOneLine = js.Any.fromFunction1(BlockIsOnOneLine), ContextNodeAllOnSameLine = js.Any.fromFunction0(ContextNodeAllOnSameLine), ContextNodeBlockIsOnOneLine = js.Any.fromFunction0(ContextNodeBlockIsOnOneLine), NextNodeAllOnSameLine = js.Any.fromFunction0(NextNodeAllOnSameLine), NextNodeBlockIsOnOneLine = js.Any.fromFunction0(NextNodeBlockIsOnOneLine), NodeIsOnOneLine = js.Any.fromFunction1(NodeIsOnOneLine), TokensAreOnSameLine = js.Any.fromFunction0(TokensAreOnSameLine), contextNode = contextNode.asInstanceOf[js.Any], contextNodeAllOnSameLine = contextNodeAllOnSameLine.asInstanceOf[js.Any], contextNodeBlockIsOnOneLine = contextNodeBlockIsOnOneLine.asInstanceOf[js.Any], currentTokenParent = currentTokenParent.asInstanceOf[js.Any], currentTokenSpan = currentTokenSpan.asInstanceOf[js.Any], formattingRequestKind = formattingRequestKind.asInstanceOf[js.Any], nextNodeAllOnSameLine = nextNodeAllOnSameLine.asInstanceOf[js.Any], nextNodeBlockIsOnOneLine = nextNodeBlockIsOnOneLine.asInstanceOf[js.Any], nextTokenParent = nextTokenParent.asInstanceOf[js.Any], nextTokenSpan = nextTokenSpan.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], tokensAreOnSameLine = tokensAreOnSameLine.asInstanceOf[js.Any], updateContext = js.Any.fromFunction5(updateContext))
    __obj.asInstanceOf[FormattingContext]
  }
}

