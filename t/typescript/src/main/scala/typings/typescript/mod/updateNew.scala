package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateNew")
@js.native
object updateNew extends js.Object {
  
  /** @deprecated Use `factory.updateNew` or the factory supplied by your transformation context instead. */
  def apply(node: NewExpression, expression: Expression): NewExpression = js.native
  def apply(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def apply(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def apply(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
}
