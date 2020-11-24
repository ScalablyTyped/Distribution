package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateElementAccessChain")
@js.native
object updateElementAccessChain extends js.Object {
  
  def apply(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: js.UndefOr[scala.Nothing],
    argumentExpression: Expression
  ): ElementAccessChain = js.native
  /** @deprecated Use `factory.updateElementAccessChain` or the factory supplied by your transformation context instead. */
  def apply(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    argumentExpression: Expression
  ): ElementAccessChain = js.native
}
