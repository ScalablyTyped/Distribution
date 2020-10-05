package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createAssignment")
@js.native
object createAssignment extends js.Object {
  def apply(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def apply(left: Expression, right: Expression): BinaryExpression = js.native
  def apply(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
}

