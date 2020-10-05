package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "setConstantValue")
@js.native
object setConstantValue extends js.Object {
  def apply(node: ElementAccessExpression, value: java.lang.String): PropertyAccessExpression | ElementAccessExpression = js.native
  def apply(node: ElementAccessExpression, value: Double): PropertyAccessExpression | ElementAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression, value: java.lang.String): PropertyAccessExpression | ElementAccessExpression = js.native
  def apply(node: PropertyAccessExpression, value: Double): PropertyAccessExpression | ElementAccessExpression = js.native
}

