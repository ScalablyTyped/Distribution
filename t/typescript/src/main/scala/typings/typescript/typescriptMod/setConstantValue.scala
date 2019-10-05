package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "setConstantValue")
@js.native
object setConstantValue extends js.Object {
  def apply(node: ElementAccessExpression, value: String): PropertyAccessExpression | ElementAccessExpression = js.native
  def apply(node: ElementAccessExpression, value: Double): PropertyAccessExpression | ElementAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression, value: String): PropertyAccessExpression | ElementAccessExpression = js.native
  def apply(node: PropertyAccessExpression, value: Double): PropertyAccessExpression | ElementAccessExpression = js.native
}

