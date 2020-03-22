package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createPropertyAssignment")
@js.native
object createPropertyAssignment extends js.Object {
  def apply(name: String, initializer: Expression): PropertyAssignment = js.native
  def apply(name: PropertyName, initializer: Expression): PropertyAssignment = js.native
}

