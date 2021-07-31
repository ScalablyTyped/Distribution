package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAccessExpressionSyntax
  extends StObject
     with SyntaxNode
     with IMemberExpressionSyntax {
  
  var argumentExpression: IExpressionSyntax = js.native
  
  var closeBracketToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var openBracketToken: ISyntaxToken = js.native
  
  def update(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax = js.native
  
  def withArgumentExpression(argumentExpression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ElementAccessExpressionSyntax = js.native
  
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ElementAccessExpressionSyntax = js.native
}
