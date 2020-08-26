package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.EnumDeclaration
import typings.typescript.mod.EnumMember
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateEnumDeclaration")
@js.native
object updateEnumDeclaration extends js.Object {
  def apply(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
}

