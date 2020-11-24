package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSwitchClauseSyntax
  extends SyntaxNode
     with ISwitchClauseSyntax {
  
  var caseKeyword: ISyntaxToken = js.native
  
  var colonToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isSwitchClause(): Boolean = js.native
  
  def update(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax = js.native
  
  def withCaseKeyword(caseKeyword: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  
  def withColonToken(colonToken: ISyntaxToken): CaseSwitchClauseSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): CaseSwitchClauseSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): CaseSwitchClauseSyntax = js.native
  
  def withStatements(statements: ISyntaxList): CaseSwitchClauseSyntax = js.native
}
