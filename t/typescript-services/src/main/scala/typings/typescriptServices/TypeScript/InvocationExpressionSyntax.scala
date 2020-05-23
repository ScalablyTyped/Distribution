package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationExpressionSyntax
  extends IMemberExpressionSyntax
     with SyntaxNode {
  var argumentList: ArgumentListSyntax = js.native
  var expression: IMemberExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def withArgumentList(argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def withExpression(expression: IMemberExpressionSyntax): InvocationExpressionSyntax = js.native
}

