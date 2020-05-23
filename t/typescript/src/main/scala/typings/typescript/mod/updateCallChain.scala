package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateCallChain")
@js.native
object updateCallChain extends js.Object {
  def apply(
    node: CallChain,
    expression: Expression,
    questionDotToken: js.UndefOr[QuestionDotToken],
    typeArguments: js.UndefOr[js.Array[TypeNode]],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
}

