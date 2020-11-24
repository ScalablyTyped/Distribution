package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.EnumDeclaration
import typings.typescript.mod.EnumMember
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createEnumDeclaration")
@js.native
object createEnumDeclaration extends js.Object {
  
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  /** @deprecated Use `factory.createEnumDeclaration` or the factory supplied by your transformation context instead. */
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
}
