package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getConstantValue")
@js.native
object getConstantValue extends js.Object {
  def apply(node: ElementAccessExpression): js.UndefOr[java.lang.String | Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression): js.UndefOr[java.lang.String | Double] = js.native
}

