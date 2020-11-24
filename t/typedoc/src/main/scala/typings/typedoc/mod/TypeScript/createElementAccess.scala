package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ElementAccessExpression
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createElementAccess")
@js.native
object createElementAccess extends js.Object {
  
  /** @deprecated Use `factory.createElementAccess` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, index: Double): ElementAccessExpression = js.native
  def apply(expression: Expression, index: Expression): ElementAccessExpression = js.native
}
