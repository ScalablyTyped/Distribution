package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EnumMember
import typings.typescript.mod.Expression
import typings.typescript.mod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateEnumMember")
@js.native
object updateEnumMember extends js.Object {
  
  /** @deprecated Use `factory.updateEnumMember` or the factory supplied by your transformation context instead. */
  def apply(node: EnumMember, name: PropertyName): EnumMember = js.native
  def apply(node: EnumMember, name: PropertyName, initializer: Expression): EnumMember = js.native
}
