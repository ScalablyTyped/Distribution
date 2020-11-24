package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createArrayLiteral")
@js.native
object createArrayLiteral extends js.Object {
  
  /** @deprecated Use `factory.createArrayLiteral` or the factory supplied by your transformation context instead. */
  def apply(): ArrayLiteralExpression = js.native
  def apply(elements: js.UndefOr[scala.Nothing], multiLine: Boolean): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
}
