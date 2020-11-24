package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var closeParenToken: ISyntaxToken = js.native
  
  var condition: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var statement: IStatementSyntax = js.native
  
  def update(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): WithStatementSyntax = js.native
  
  def withCondition(condition: IExpressionSyntax): WithStatementSyntax = js.native
  
  var withKeyword: ISyntaxToken = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): WithStatementSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): WithStatementSyntax = js.native
  
  def withWithKeyword(withKeyword: ISyntaxToken): WithStatementSyntax = js.native
}
