package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getConstantValue")
@js.native
object getConstantValue extends js.Object {
  def apply(node: ElementAccessExpression): js.UndefOr[String | Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression): js.UndefOr[String | Double] = js.native
}

