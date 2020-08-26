package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createCall")
@js.native
object createCall extends js.Object {
  def apply(expression: Expression): CallExpression = js.native
  def apply(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
}

