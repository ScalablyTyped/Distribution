package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EnumMember
import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createEnumMember")
@js.native
object createEnumMember extends js.Object {
  def apply(name: String): EnumMember = js.native
  def apply(name: String, initializer: Expression): EnumMember = js.native
  def apply(name: PropertyName): EnumMember = js.native
  def apply(name: PropertyName, initializer: Expression): EnumMember = js.native
}

