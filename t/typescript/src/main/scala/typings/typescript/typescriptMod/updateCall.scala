package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateCall")
@js.native
object updateCall extends js.Object {
  def apply(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def apply(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
}

