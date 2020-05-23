package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCreationExpressionSyntax
  extends IMemberExpressionSyntax
     with SyntaxNode {
  var argumentList: ArgumentListSyntax = js.native
  var expression: IMemberExpressionSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def withArgumentList(argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def withExpression(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ObjectCreationExpressionSyntax = js.native
}

