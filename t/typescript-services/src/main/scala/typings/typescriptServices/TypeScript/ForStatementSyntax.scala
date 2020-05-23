package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatementSyntax
  extends IIterationStatementSyntax
     with SyntaxNode {
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var firstSemicolonToken: ISyntaxToken = js.native
  var forKeyword: ISyntaxToken = js.native
  var incrementor: IExpressionSyntax = js.native
  var initializer: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var secondSemicolonToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var variableDeclaration: VariableDeclarationSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ForStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): ForStatementSyntax = js.native
  def withFirstSemicolonToken(firstSemicolonToken: ISyntaxToken): ForStatementSyntax = js.native
  def withForKeyword(forKeyword: ISyntaxToken): ForStatementSyntax = js.native
  def withIncrementor(incrementor: IExpressionSyntax): ForStatementSyntax = js.native
  def withInitializer(initializer: IExpressionSyntax): ForStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ForStatementSyntax = js.native
  def withSecondSemicolonToken(secondSemicolonToken: ISyntaxToken): ForStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): ForStatementSyntax = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): ForStatementSyntax = js.native
}

