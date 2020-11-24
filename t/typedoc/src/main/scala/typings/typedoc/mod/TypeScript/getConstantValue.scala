package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getConstantValue")
@js.native
object getConstantValue extends js.Object {
  
  /**
    * Gets the constant value to emit for an expression representing an enum.
    */
  def apply(node: AccessExpression): js.UndefOr[String | Double] = js.native
}
