package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidExpressionSyntax
  extends StObject
     with SyntaxNode
     with IUnaryExpressionSyntax {
  
  var expression: IUnaryExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  def update(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  
  var voidKeyword: ISyntaxToken = js.native
  
  def withExpression(expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  
  def withVoidKeyword(voidKeyword: ISyntaxToken): VoidExpressionSyntax = js.native
}
