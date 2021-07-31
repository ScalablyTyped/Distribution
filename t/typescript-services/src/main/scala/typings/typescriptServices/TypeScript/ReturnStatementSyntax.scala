package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatementSyntax
  extends StObject
     with SyntaxNode
     with IStatementSyntax {
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var returnKeyword: ISyntaxToken = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ReturnStatementSyntax = js.native
  
  def withReturnKeyword(returnKeyword: ISyntaxToken): ReturnStatementSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
}
