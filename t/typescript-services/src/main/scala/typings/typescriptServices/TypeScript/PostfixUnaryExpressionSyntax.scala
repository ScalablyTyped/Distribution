package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixUnaryExpressionSyntax
  extends StObject
     with SyntaxNode
     with IPostfixExpressionSyntax {
  
  /* private */ var _kind: Any = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var operand: IMemberExpressionSyntax = js.native
  
  var operatorToken: ISyntaxToken = js.native
  
  def update(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
  
  def withKind(kind: SyntaxKind): PostfixUnaryExpressionSyntax = js.native
  
  def withOperand(operand: IMemberExpressionSyntax): PostfixUnaryExpressionSyntax = js.native
  
  def withOperatorToken(operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
}
