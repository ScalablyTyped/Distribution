package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var expression: IExpressionSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  var throwKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ThrowStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def withThrowKeyword(throwKeyword: ISyntaxToken): ThrowStatementSyntax = js.native
}

