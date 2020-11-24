package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createConditional")
@js.native
object createConditional extends js.Object {
  
  /** @deprecated Use `factory.createConditional` or the factory supplied by your transformation context instead. */
  def apply(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  /** @deprecated Use `factory.createConditional` or the factory supplied by your transformation context instead. */
  def apply(condition: Expression, whenTrue: Expression, whenFalse: Expression): ConditionalExpression = js.native
}
