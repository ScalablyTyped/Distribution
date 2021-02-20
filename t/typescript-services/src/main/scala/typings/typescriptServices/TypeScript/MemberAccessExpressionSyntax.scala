package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberAccessExpressionSyntax
  extends IMemberExpressionSyntax
     with SyntaxNode {
  
  var dotToken: ISyntaxToken = js.native
  
  var expression: IExpressionSyntax = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var name: ISyntaxToken = js.native
  
  def update(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  
  def withDotToken(dotToken: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  
  def withExpression(expression: IExpressionSyntax): MemberAccessExpressionSyntax = js.native
  
  def withName(name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
}
