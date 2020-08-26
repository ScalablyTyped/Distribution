package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ArrayLiteralExpression
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createArrayLiteral")
@js.native
object createArrayLiteral extends js.Object {
  def apply(): ArrayLiteralExpression = js.native
  def apply(elements: js.UndefOr[scala.Nothing], multiLine: Boolean): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def apply(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
}

