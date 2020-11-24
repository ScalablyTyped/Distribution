package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updatePropertyAccessChain")
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
    questionDotToken: js.UndefOr[scala.Nothing],
    name: PrivateIdentifier
  ): PropertyAccessChain = js.native
  /** @deprecated Use `factory.updatePropertyAccessChain` or the factory supplied by your transformation context instead. */
  def apply(
    node: PropertyAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    name: Identifier
  ): PropertyAccessChain = js.native
  def apply(
    node: PropertyAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    name: PrivateIdentifier
  ): PropertyAccessChain = js.native
}
