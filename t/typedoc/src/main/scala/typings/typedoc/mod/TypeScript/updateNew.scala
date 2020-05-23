package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.NewExpression
import typings.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateNew")
@js.native
object updateNew extends js.Object {
  def apply(node: NewExpression, expression: Expression): NewExpression = js.native
  def apply(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def apply(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
}

