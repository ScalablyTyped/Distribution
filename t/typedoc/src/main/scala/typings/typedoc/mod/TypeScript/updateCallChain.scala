package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallChain
import typings.typescript.mod.Expression
import typings.typescript.mod.QuestionDotToken
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateCallChain")
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

