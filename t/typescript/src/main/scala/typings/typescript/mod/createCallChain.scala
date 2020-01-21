package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createCallChain")
@js.native
object createCallChain extends js.Object {
  def apply(expression: Expression): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode]
  ): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, typeArguments: js.Array[TypeNode]): CallChain = js.native
  def apply(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
}

