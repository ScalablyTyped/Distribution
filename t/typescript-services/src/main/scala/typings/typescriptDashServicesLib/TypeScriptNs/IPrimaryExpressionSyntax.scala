package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimaryExpressionSyntax extends IMemberExpressionSyntax {
  def isPrimaryExpression(): scala.Boolean
}

object IPrimaryExpressionSyntax {
  @scala.inline
  def apply(
    accept: js.Function1[ISyntaxVisitor, js.Any],
    childAt: js.Function1[scala.Double, ISyntaxElement],
    childCount: js.Function0[scala.Double],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
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
    trailingTrivia: js.Function0[ISyntaxTriviaList],
    trailingTriviaWidth: js.Function0[scala.Double],
    width: js.Function0[scala.Double],
    withLeadingTrivia: js.Function1[ISyntaxTriviaList, IExpressionSyntax],
    withTrailingTrivia: js.Function1[ISyntaxTriviaList, IExpressionSyntax]
  ): IPrimaryExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = accept, childAt = childAt, childCount = childCount, collectTextElements = collectTextElements, firstToken = firstToken, fullText = fullText, fullWidth = fullWidth, isExpression = isExpression, isIncrementallyUnusable = isIncrementallyUnusable, isList = isList, isMemberExpression = isMemberExpression, isNode = isNode, isPostfixExpression = isPostfixExpression, isPrimaryExpression = isPrimaryExpression, isSeparatedList = isSeparatedList, isToken = isToken, isTypeScriptSpecific = isTypeScriptSpecific, isUnaryExpression = isUnaryExpression, kind = kind, lastToken = lastToken, leadingTrivia = leadingTrivia, leadingTriviaWidth = leadingTriviaWidth, trailingTrivia = trailingTrivia, trailingTriviaWidth = trailingTriviaWidth, width = width, withLeadingTrivia = withLeadingTrivia, withTrailingTrivia = withTrailingTrivia)
  
    __obj.asInstanceOf[IPrimaryExpressionSyntax]
  }
}

