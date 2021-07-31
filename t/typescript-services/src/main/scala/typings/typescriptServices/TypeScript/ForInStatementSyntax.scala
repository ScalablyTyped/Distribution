package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForInStatementSyntax
  extends StObject
     with SyntaxNode
     with IIterationStatementSyntax {
  
  var closeParenToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  var forKeyword: ISyntaxToken = js.native
  
  var inKeyword: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var left: IExpressionSyntax = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var statement: IStatementSyntax = js.native
  
  def update(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  
  var variableDeclaration: VariableDeclarationSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ForInStatementSyntax = js.native
  
  def withForKeyword(forKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  
  def withInKeyword(inKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  
  def withLeft(left: IExpressionSyntax): ForInStatementSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  
  def withStatement(statement: IStatementSyntax): ForInStatementSyntax = js.native
  
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): ForInStatementSyntax = js.native
}
