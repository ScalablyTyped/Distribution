package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectCreationExpressionSyntax
  extends StObject
     with SyntaxNode
     with IMemberExpressionSyntax {
  
  var argumentList: ArgumentListSyntax = js.native
  
  var expression: IMemberExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var newKeyword: ISyntaxToken = js.native
  
  def update(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  
  def withArgumentList(argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  
  def withExpression(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  
  def withNewKeyword(newKeyword: ISyntaxToken): ObjectCreationExpressionSyntax = js.native
}
