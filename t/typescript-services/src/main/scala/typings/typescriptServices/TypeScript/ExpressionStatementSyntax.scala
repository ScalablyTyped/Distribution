package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var expression: IExpressionSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ExpressionStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
}

