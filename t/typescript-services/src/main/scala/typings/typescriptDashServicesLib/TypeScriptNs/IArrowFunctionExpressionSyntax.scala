package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrowFunctionExpressionSyntax extends IUnaryExpressionSyntax {
  var block: BlockSyntax
  var equalsGreaterThanToken: ISyntaxToken
  var expression: IExpressionSyntax
  def isArrowFunctionExpression(): scala.Boolean
}

object IArrowFunctionExpressionSyntax {
  @scala.inline
  def apply(
    accept: js.Function1[ISyntaxVisitor, js.Any],
    block: BlockSyntax,
    childAt: js.Function1[scala.Double, ISyntaxElement],
    childCount: js.Function0[scala.Double],
    collectTextElements: js.Function1[js.Array[java.lang.String], scala.Unit],
    equalsGreaterThanToken: ISyntaxToken,
    expression: IExpressionSyntax,
    firstToken: js.Function0[ISyntaxToken],
    fullText: js.Function0[java.lang.String],
    fullWidth: js.Function0[scala.Double],
    isArrowFunctionExpression: js.Function0[scala.Boolean],
    isExpression: js.Function0[scala.Boolean],
    isIncrementallyUnusable: js.Function0[scala.Boolean],
    isList: js.Function0[scala.Boolean],
    isNode: js.Function0[scala.Boolean],
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
  ): IArrowFunctionExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = accept, block = block, childAt = childAt, childCount = childCount, collectTextElements = collectTextElements, equalsGreaterThanToken = equalsGreaterThanToken, expression = expression, firstToken = firstToken, fullText = fullText, fullWidth = fullWidth, isArrowFunctionExpression = isArrowFunctionExpression, isExpression = isExpression, isIncrementallyUnusable = isIncrementallyUnusable, isList = isList, isNode = isNode, isSeparatedList = isSeparatedList, isToken = isToken, isTypeScriptSpecific = isTypeScriptSpecific, isUnaryExpression = isUnaryExpression, kind = kind, lastToken = lastToken, leadingTrivia = leadingTrivia, leadingTriviaWidth = leadingTriviaWidth, trailingTrivia = trailingTrivia, trailingTriviaWidth = trailingTriviaWidth, width = width, withLeadingTrivia = withLeadingTrivia, withTrailingTrivia = withTrailingTrivia)
  
    __obj.asInstanceOf[IArrowFunctionExpressionSyntax]
  }
}

