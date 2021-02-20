package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedExpressionSyntax
  extends IPrimaryExpressionSyntax
     with SyntaxNode {
  
  var closeParenToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  def update(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): ParenthesizedExpressionSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
}
