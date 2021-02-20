package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArrowFunctionExpressionSyntax extends IUnaryExpressionSyntax {
  
  var block: BlockSyntax = js.native
  
  var equalsGreaterThanToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  def isArrowFunctionExpression(): Boolean = js.native
}
object IArrowFunctionExpressionSyntax {
  
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => js.Any,
    block: BlockSyntax,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    equalsGreaterThanToken: ISyntaxToken,
    expression: IExpressionSyntax,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isArrowFunctionExpression: () => Boolean,
    isExpression: () => Boolean,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    isUnaryExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): IArrowFunctionExpressionSyntax = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), block = block.asInstanceOf[js.Any], childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), equalsGreaterThanToken = equalsGreaterThanToken.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isArrowFunctionExpression = js.Any.fromFunction0(isArrowFunctionExpression), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[IArrowFunctionExpressionSyntax]
  }
  
  @scala.inline
  implicit class IArrowFunctionExpressionSyntaxMutableBuilder[Self <: IArrowFunctionExpressionSyntax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockSyntax): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsGreaterThanToken(value: ISyntaxToken): Self = StObject.set(x, "equalsGreaterThanToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: IExpressionSyntax): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArrowFunctionExpression(value: () => Boolean): Self = StObject.set(x, "isArrowFunctionExpression", js.Any.fromFunction0(value))
  }
}
