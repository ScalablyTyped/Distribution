package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvocationExpressionSyntax
  extends StObject
     with SyntaxNode
     with IMemberExpressionSyntax {
  
  var argumentList: ArgumentListSyntax = js.native
  
  var expression: IMemberExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  def update(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  
  def withArgumentList(argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  
  def withExpression(expression: IMemberExpressionSyntax): InvocationExpressionSyntax = js.native
}
