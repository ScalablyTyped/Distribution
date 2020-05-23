package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var expression: IExpressionSyntax = js.native
  var returnKeyword: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ReturnStatementSyntax = js.native
  def withReturnKeyword(returnKeyword: ISyntaxToken): ReturnStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
}

