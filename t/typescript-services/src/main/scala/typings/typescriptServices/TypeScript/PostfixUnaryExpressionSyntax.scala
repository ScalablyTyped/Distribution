package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostfixUnaryExpressionSyntax
  extends IPostfixExpressionSyntax
     with SyntaxNode {
  var _kind: js.Any = js.native
  var operand: IMemberExpressionSyntax = js.native
  var operatorToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
  def withKind(kind: SyntaxKind): PostfixUnaryExpressionSyntax = js.native
  def withOperand(operand: IMemberExpressionSyntax): PostfixUnaryExpressionSyntax = js.native
  def withOperatorToken(operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
}

