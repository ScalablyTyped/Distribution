package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateConditional")
@js.native
object updateConditional extends js.Object {
  
  /** @deprecated Use `factory.updateConditional` or the factory supplied by your transformation context instead. */
  def apply(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
}
