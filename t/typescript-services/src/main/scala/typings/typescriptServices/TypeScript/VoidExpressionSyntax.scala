package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoidExpressionSyntax
  extends IUnaryExpressionSyntax
     with SyntaxNode {
  var expression: IUnaryExpressionSyntax = js.native
  var voidKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def withVoidKeyword(voidKeyword: ISyntaxToken): VoidExpressionSyntax = js.native
}

