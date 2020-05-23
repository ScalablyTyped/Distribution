package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleArrowFunctionExpressionSyntax
  extends IArrowFunctionExpressionSyntax
     with SyntaxNode {
  var identifier: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax = js.native
  def withBlock(block: BlockSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withEqualsGreaterThanToken(equalsGreaterThanToken: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimpleArrowFunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): SimpleArrowFunctionExpressionSyntax = js.native
}

