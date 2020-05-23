package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhileStatementSyntax
  extends IIterationStatementSyntax
     with SyntaxNode {
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var whileKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): WhileStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): WhileStatementSyntax = js.native
  def withWhileKeyword(whileKeyword: ISyntaxToken): WhileStatementSyntax = js.native
}

