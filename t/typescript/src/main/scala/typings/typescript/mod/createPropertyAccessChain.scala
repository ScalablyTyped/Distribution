package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createPropertyAccessChain")
@js.native
object createPropertyAccessChain extends js.Object {
  
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: java.lang.String): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: Identifier): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], name: PrivateIdentifier): PropertyAccessChain = js.native
  /** @deprecated Use `factory.createPropertyAccessChain` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, questionDotToken: QuestionDotToken, name: java.lang.String): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, name: Identifier): PropertyAccessChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, name: PrivateIdentifier): PropertyAccessChain = js.native
}
