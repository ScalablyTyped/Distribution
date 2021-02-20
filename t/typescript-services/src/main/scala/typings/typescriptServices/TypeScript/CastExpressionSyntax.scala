package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastExpressionSyntax
  extends IUnaryExpressionSyntax
     with SyntaxNode {
  
  var expression: IUnaryExpressionSyntax = js.native
  
  var greaterThanToken: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var lessThanToken: ISyntaxToken = js.native
  
  var `type`: ITypeSyntax = js.native
  
  def update(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax = js.native
  
  def withExpression(expression: IUnaryExpressionSyntax): CastExpressionSyntax = js.native
  
  def withGreaterThanToken(greaterThanToken: ISyntaxToken): CastExpressionSyntax = js.native
  
  def withLessThanToken(lessThanToken: ISyntaxToken): CastExpressionSyntax = js.native
  
  def withType(`type`: ITypeSyntax): CastExpressionSyntax = js.native
}
