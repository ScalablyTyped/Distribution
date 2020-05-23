package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionSyntax
  extends SyntaxNode
     with IExpressionSyntax {
  var _kind: js.Any = js.native
  var left: IExpressionSyntax = js.native
  var operatorToken: ISyntaxToken = js.native
  var right: IExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax = js.native
  def withKind(kind: SyntaxKind): BinaryExpressionSyntax = js.native
  def withLeft(left: IExpressionSyntax): BinaryExpressionSyntax = js.native
  def withOperatorToken(operatorToken: ISyntaxToken): BinaryExpressionSyntax = js.native
  def withRight(right: IExpressionSyntax): BinaryExpressionSyntax = js.native
}

