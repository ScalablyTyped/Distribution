package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var elseClause: ElseClauseSyntax = js.native
  var ifKeyword: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): IfStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): IfStatementSyntax = js.native
  def withElseClause(elseClause: ElseClauseSyntax): IfStatementSyntax = js.native
  def withIfKeyword(ifKeyword: ISyntaxToken): IfStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): IfStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): IfStatementSyntax = js.native
}

