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
    accept: ISyntaxVisitor => js.Any,
    childAt: scala.Double => ISyntaxElement,
    childCount: () => scala.Double,
    clone: () => ISyntaxToken,
    collectTextElements: js.Array[java.lang.String] => scala.Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    hasLeadingComment: () => scala.Boolean,
    hasLeadingNewLine: () => scala.Boolean,
    hasLeadingSkippedText: () => scala.Boolean,
    hasLeadingTrivia: () => scala.Boolean,
    hasSkippedToken: () => scala.Boolean,
    hasTrailingComment: () => scala.Boolean,
    hasTrailingNewLine: () => scala.Boolean,
    hasTrailingSkippedText: () => scala.Boolean,
    hasTrailingTrivia: () => scala.Boolean,
    isExpression: () => scala.Boolean,
    isIncrementallyUnusable: () => scala.Boolean,
    isList: () => scala.Boolean,
    isMemberExpression: () => scala.Boolean,
    isNode: () => scala.Boolean,
    isPostfixExpression: () => scala.Boolean,
    isPrimaryExpression: () => scala.Boolean,
    isSeparatedList: () => scala.Boolean,
    isToken: () => scala.Boolean,
    isTypeScriptSpecific: () => scala.Boolean,
    isUnaryExpression: () => scala.Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => scala.Double,
    text: () => java.lang.String,
    tokenKind: SyntaxKind,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => scala.Double,
    value: () => js.Any,
    valueText: () => java.lang.String,
    width: () => scala.Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxToken
  ): ISyntaxToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), clone = js.Any.fromFunction0(clone), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), text = js.Any.fromFunction0(text), tokenKind = tokenKind, trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
  
    __obj.asInstanceOf[ISyntaxToken]
  }
}

