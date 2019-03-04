package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxToken extends IPrimaryExpressionSyntax {
  var tokenKind: SyntaxKind
  def hasLeadingComment(): scala.Boolean
  def hasLeadingNewLine(): scala.Boolean
  def hasLeadingSkippedText(): scala.Boolean
  def hasLeadingTrivia(): scala.Boolean
  def hasSkippedToken(): scala.Boolean
  def hasTrailingComment(): scala.Boolean
  def hasTrailingNewLine(): scala.Boolean
  def hasTrailingSkippedText(): scala.Boolean
  def hasTrailingTrivia(): scala.Boolean
  def text(): java.lang.String
  def value(): js.Any
  def valueText(): java.lang.String
}

object ISyntaxToken {
  @scala.inline
  def apply(
    accept: js.Function1[ISyntaxVisitor, js.Any],
    childAt: js.Function1[scala.Double, ISyntaxElement],
    childCount: js.Function0[scala.Double],
    clone: js.Function0[ISyntaxToken],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    hasLeadingComment: js.Function0[scala.Boolean],
    hasLeadingNewLine: js.Function0[scala.Boolean],
    hasLeadingSkippedText: js.Function0[scala.Boolean],
    hasLeadingTrivia: js.Function0[scala.Boolean],
    hasSkippedToken: js.Function0[scala.Boolean],
    hasTrailingComment: js.Function0[scala.Boolean],
    hasTrailingNewLine: js.Function0[scala.Boolean],
    hasTrailingSkippedText: js.Function0[scala.Boolean],
    hasTrailingTrivia: js.Function0[scala.Boolean],
    isExpression: js.Function0[scala.Boolean],
    isIncrementallyUnusable: js.Function0[scala.Boolean],
    isList: js.Function0[scala.Boolean],
    isMemberExpression: js.Function0[scala.Boolean],
    isNode: js.Function0[scala.Boolean],
    isPostfixExpression: js.Function0[scala.Boolean],
    isPrimaryExpression: js.Function0[scala.Boolean],
    isSeparatedList: js.Function0[scala.Boolean],
    isToken: js.Function0[scala.Boolean],
    isTypeScriptSpecific: js.Function0[scala.Boolean],
    isUnaryExpression: js.Function0[scala.Boolean],
    kind: js.Function0[SyntaxKind],
    lastToken: js.Function0[ISyntaxToken],
    leadingTrivia: js.Function0[ISyntaxTriviaList],
    leadingTriviaWidth: js.Function0[scala.Double],
    text: js.Function0[java.lang.String],
    tokenKind: SyntaxKind,
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    value: js.Function0[js.Any],
    valueText: js.Function0[java.lang.String],
    width: js.Function0[scala.Double],
    withLeadingTrivia: js.Function1[ISyntaxTriviaList, ISyntaxToken],
    withTrailingTrivia: js.Function1[ISyntaxTriviaList, ISyntaxToken]
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = accept, childAt = childAt, childCount = childCount, clone = clone, collectTextElements = collectTextElements, firstToken = firstToken, fullText = fullText, fullWidth = fullWidth, hasLeadingComment = hasLeadingComment, hasLeadingNewLine = hasLeadingNewLine, hasLeadingSkippedText = hasLeadingSkippedText, hasLeadingTrivia = hasLeadingTrivia, hasSkippedToken = hasSkippedToken, hasTrailingComment = hasTrailingComment, hasTrailingNewLine = hasTrailingNewLine, hasTrailingSkippedText = hasTrailingSkippedText, hasTrailingTrivia = hasTrailingTrivia, isExpression = isExpression, isIncrementallyUnusable = isIncrementallyUnusable, isList = isList, isMemberExpression = isMemberExpression, isNode = isNode, isPostfixExpression = isPostfixExpression, isPrimaryExpression = isPrimaryExpression, isSeparatedList = isSeparatedList, isToken = isToken, isTypeScriptSpecific = isTypeScriptSpecific, isUnaryExpression = isUnaryExpression, kind = kind, lastToken = lastToken, leadingTrivia = leadingTrivia, leadingTriviaWidth = leadingTriviaWidth, text = text, tokenKind = tokenKind, trailingTrivia = trailingTrivia, trailingTriviaWidth = trailingTriviaWidth, value = value, valueText = valueText, width = width, withLeadingTrivia = withLeadingTrivia, withTrailingTrivia = withTrailingTrivia)
  
    __obj.asInstanceOf[ISyntaxToken]
  }
}

