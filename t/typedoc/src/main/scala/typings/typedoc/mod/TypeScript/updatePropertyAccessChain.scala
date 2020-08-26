package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.PropertyAccessChain
import typings.typescript.mod.QuestionDotToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updatePropertyAccessChain")
@js.native
object updatePropertyAccessChain extends js.Object {
  def apply(
    node: PropertyAccessChain,
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    name: Identifier
  ): PropertyAccessChain = js.native
  def apply(
    node: PropertyAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    name: Identifier
  ): PropertyAccessChain = js.native
}

