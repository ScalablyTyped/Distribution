package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ElementAccessChain
import typings.typescript.mod.Expression
import typings.typescript.mod.QuestionDotToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateElementAccessChain")
@js.native
object updateElementAccessChain extends js.Object {
  def apply(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: js.UndefOr[QuestionDotToken],
    argumentExpression: Expression
  ): ElementAccessChain = js.native
}

