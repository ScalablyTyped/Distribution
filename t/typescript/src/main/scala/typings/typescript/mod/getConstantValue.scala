package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getConstantValue")
@js.native
object getConstantValue extends js.Object {
  
  /**
    * Gets the constant value to emit for an expression representing an enum.
    */
  def apply(node: AccessExpression): js.UndefOr[java.lang.String | Double] = js.native
}
