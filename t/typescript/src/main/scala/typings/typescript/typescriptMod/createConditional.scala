package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createConditional")
@js.native
object createConditional extends js.Object {
  def apply(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  /** @deprecated */ def apply(condition: Expression, whenTrue: Expression, whenFalse: Expression): ConditionalExpression = js.native
}

