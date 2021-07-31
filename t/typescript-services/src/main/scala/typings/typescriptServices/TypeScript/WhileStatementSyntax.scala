package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhileStatementSyntax
  extends StObject
     with SyntaxNode
     with IIterationStatementSyntax {
  
  var closeParenToken: ISyntaxToken = js.native
  
  var condition: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var statement: IStatementSyntax = js.native
  
  def update(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  
  var whileKeyword: ISyntaxToken = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  
  def withCondition(condition: IExpressionSyntax): WhileStatementSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): WhileStatementSyntax = js.native
  
  def withWhileKeyword(whileKeyword: ISyntaxToken): WhileStatementSyntax = js.native
}
