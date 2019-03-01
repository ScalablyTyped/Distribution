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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("childAt")(childAt)
    __obj.updateDynamic("childCount")(childCount)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("collectTextElements")(collectTextElements)
    __obj.updateDynamic("firstToken")(firstToken)
    __obj.updateDynamic("fullText")(fullText)
    __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.updateDynamic("hasLeadingComment")(hasLeadingComment)
    __obj.updateDynamic("hasLeadingNewLine")(hasLeadingNewLine)
    __obj.updateDynamic("hasLeadingSkippedText")(hasLeadingSkippedText)
    __obj.updateDynamic("hasLeadingTrivia")(hasLeadingTrivia)
    __obj.updateDynamic("hasSkippedToken")(hasSkippedToken)
    __obj.updateDynamic("hasTrailingComment")(hasTrailingComment)
    __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine)
    __obj.updateDynamic("hasTrailingSkippedText")(hasTrailingSkippedText)
    __obj.updateDynamic("hasTrailingTrivia")(hasTrailingTrivia)
    __obj.updateDynamic("isExpression")(isExpression)
    __obj.updateDynamic("isIncrementallyUnusable")(isIncrementallyUnusable)
    __obj.updateDynamic("isList")(isList)
    __obj.updateDynamic("isMemberExpression")(isMemberExpression)
    __obj.updateDynamic("isNode")(isNode)
    __obj.updateDynamic("isPostfixExpression")(isPostfixExpression)
    __obj.updateDynamic("isPrimaryExpression")(isPrimaryExpression)
    __obj.updateDynamic("isSeparatedList")(isSeparatedList)
    __obj.updateDynamic("isToken")(isToken)
    __obj.updateDynamic("isTypeScriptSpecific")(isTypeScriptSpecific)
    __obj.updateDynamic("isUnaryExpression")(isUnaryExpression)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("lastToken")(lastToken)
    __obj.updateDynamic("leadingTrivia")(leadingTrivia)
    __obj.updateDynamic("leadingTriviaWidth")(leadingTriviaWidth)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("tokenKind")(tokenKind)
    __obj.updateDynamic("trailingTrivia")(trailingTrivia)
    __obj.updateDynamic("trailingTriviaWidth")(trailingTriviaWidth)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("valueText")(valueText)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("withLeadingTrivia")(withLeadingTrivia)
    __obj.updateDynamic("withTrailingTrivia")(withTrailingTrivia)
    __obj.asInstanceOf[ISyntaxToken]
  }
}

