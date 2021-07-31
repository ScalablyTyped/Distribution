package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOfExpressionSyntax
  extends StObject
     with SyntaxNode
     with IUnaryExpressionSyntax {
  
  var expression: IUnaryExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var typeOfKeyword: ISyntaxToken = js.native
  
  def update(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  
  def withExpression(expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeOfExpressionSyntax = js.native
}
