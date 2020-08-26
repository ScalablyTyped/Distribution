package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.PropertyAccessChain
import typings.typescript.mod.QuestionDotToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createPropertyAccessChain")
@js.native
object createPropertyAccessChain extends js.Object {
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: String): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: Identifier): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, name: String): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, name: Identifier): PropertyAccessChain = js.native
}

