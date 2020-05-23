package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateCall")
@js.native
object updateCall extends js.Object {
  def apply(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.UndefOr[js.Array[TypeNode]],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
}

