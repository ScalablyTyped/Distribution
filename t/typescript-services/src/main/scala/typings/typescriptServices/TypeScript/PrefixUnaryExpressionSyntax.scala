package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixUnaryExpressionSyntax
  extends IUnaryExpressionSyntax
     with SyntaxNode {
  var _kind: js.Any = js.native
  var operand: IUnaryExpressionSyntax = js.native
  var operatorToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  def withKind(kind: SyntaxKind): PrefixUnaryExpressionSyntax = js.native
  def withOperand(operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  def withOperatorToken(operatorToken: ISyntaxToken): PrefixUnaryExpressionSyntax = js.native
}

