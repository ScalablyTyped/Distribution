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
    accept: ISyntaxVisitor => js.Any,
    block: BlockSyntax,
    childAt: scala.Double => ISyntaxElement,
    childCount: () => scala.Double,
    collectTextElements: js.Array[java.lang.String] => scala.Unit,
    equalsGreaterThanToken: ISyntaxToken,
    expression: IExpressionSyntax,
    firstToken: () => ISyntaxToken,
    fullText: () => java.lang.String,
    fullWidth: () => scala.Double,
    isArrowFunctionExpression: () => scala.Boolean,
    isExpression: () => scala.Boolean,
    isIncrementallyUnusable: () => scala.Boolean,
    isList: () => scala.Boolean,
    isNode: () => scala.Boolean,
    isSeparatedList: () => scala.Boolean,
    isToken: () => scala.Boolean,
    isTypeScriptSpecific: () => scala.Boolean,
    isUnaryExpression: () => scala.Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => scala.Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => scala.Double,
    width: () => scala.Double,
    withLeadingTrivia: ISyntaxTriviaList => IExpressionSyntax,
    withTrailingTrivia: ISyntaxTriviaList => IExpressionSyntax
  ): IArrowFunctionExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), block = block, childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), equalsGreaterThanToken = equalsGreaterThanToken, expression = expression, firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isArrowFunctionExpression = js.Any.fromFunction0(isArrowFunctionExpression), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
  
    __obj.asInstanceOf[IArrowFunctionExpressionSyntax]
  }
}

