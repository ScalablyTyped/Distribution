package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccessExpressionSyntax
  extends IMemberExpressionSyntax
     with SyntaxNode {
  var dotToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var name: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def withDotToken(dotToken: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): MemberAccessExpressionSyntax = js.native
  def withName(name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
}

