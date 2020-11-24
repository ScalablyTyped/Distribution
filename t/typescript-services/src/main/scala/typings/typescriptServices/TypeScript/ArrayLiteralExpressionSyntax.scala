package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLiteralExpressionSyntax
  extends IPrimaryExpressionSyntax
     with SyntaxNode {
  
  var closeBracketToken: ISyntaxToken = js.native
  
  var expressions: ISeparatedSyntaxList = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var openBracketToken: ISyntaxToken = js.native
  
  def update(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  
  def withCloseBracketToken(closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ArrayLiteralExpressionSyntax = js.native
  
  def withExpressions(expressions: ISeparatedSyntaxList): ArrayLiteralExpressionSyntax = js.native
  
  def withOpenBracketToken(openBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
}
