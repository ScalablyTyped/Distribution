package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.NewExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createNew")
@js.native
object createNew extends js.Object {
  def apply(expression: Expression): NewExpression = js.native
  def apply(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
}

