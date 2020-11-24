package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createEnumMember")
@js.native
object createEnumMember extends js.Object {
  
  /** @deprecated Use `factory.createEnumMember` or the factory supplied by your transformation context instead. */
  def apply(name: java.lang.String): EnumMember = js.native
  def apply(name: java.lang.String, initializer: Expression): EnumMember = js.native
  def apply(name: ComputedPropertyName): EnumMember = js.native
  def apply(name: ComputedPropertyName, initializer: Expression): EnumMember = js.native
  def apply(name: Identifier): EnumMember = js.native
  def apply(name: Identifier, initializer: Expression): EnumMember = js.native
  def apply(name: NumericLiteral): EnumMember = js.native
  def apply(name: NumericLiteral, initializer: Expression): EnumMember = js.native
  def apply(name: PrivateIdentifier): EnumMember = js.native
  def apply(name: PrivateIdentifier, initializer: Expression): EnumMember = js.native
  def apply(name: StringLiteral): EnumMember = js.native
  def apply(name: StringLiteral, initializer: Expression): EnumMember = js.native
}
