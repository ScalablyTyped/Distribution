package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ArrayLiteralExpression
import typings.typescript.mod.BinaryExpression
import typings.typescript.mod.DestructuringAssignment
import typings.typescript.mod.Expression
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createAssignment")
@js.native
object createAssignment extends js.Object {
  def apply(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def apply(left: Expression, right: Expression): BinaryExpression = js.native
  def apply(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
}

