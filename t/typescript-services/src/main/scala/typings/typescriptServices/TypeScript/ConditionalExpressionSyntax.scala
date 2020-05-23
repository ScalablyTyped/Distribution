package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpressionSyntax
  extends SyntaxNode
     with IExpressionSyntax {
  var colonToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var questionToken: ISyntaxToken = js.native
  var whenFalse: IExpressionSyntax = js.native
  var whenTrue: IExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): ConditionalExpressionSyntax = js.native
  def withCondition(condition: IExpressionSyntax): ConditionalExpressionSyntax = js.native
  def withQuestionToken(questionToken: ISyntaxToken): ConditionalExpressionSyntax = js.native
  def withWhenFalse(whenFalse: IExpressionSyntax): ConditionalExpressionSyntax = js.native
  def withWhenTrue(whenTrue: IExpressionSyntax): ConditionalExpressionSyntax = js.native
}

