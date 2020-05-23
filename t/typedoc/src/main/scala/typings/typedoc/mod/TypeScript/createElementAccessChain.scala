package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ElementAccessChain
import typings.typescript.mod.Expression
import typings.typescript.mod.QuestionDotToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createElementAccessChain")
@js.native
object createElementAccessChain extends js.Object {
  def apply(expression: Expression, questionDotToken: js.UndefOr[QuestionDotToken], index: Double): ElementAccessChain = js.native
  def apply(expression: Expression, questionDotToken: js.UndefOr[QuestionDotToken], index: Expression): ElementAccessChain = js.native
}

