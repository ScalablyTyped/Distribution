package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.setConstantValue")
@js.native
object setConstantValue extends js.Object {
  
  /**
    * Sets the constant value to emit for an expression.
    */
  def apply(node: AccessExpression, value: String): AccessExpression = js.native
  def apply(node: AccessExpression, value: Double): AccessExpression = js.native
}
