package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "setConstantValue")
@js.native
object setConstantValue extends js.Object {
  def apply(node: ElementAccessExpression, value: java.lang.String): ElementAccessExpression | PropertyAccessExpression = js.native
  def apply(node: ElementAccessExpression, value: Double): ElementAccessExpression | PropertyAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression, value: java.lang.String): ElementAccessExpression | PropertyAccessExpression = js.native
  def apply(node: PropertyAccessExpression, value: Double): ElementAccessExpression | PropertyAccessExpression = js.native
}

