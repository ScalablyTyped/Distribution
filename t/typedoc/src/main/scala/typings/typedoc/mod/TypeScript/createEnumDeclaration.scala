package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.EnumDeclaration
import typings.typescript.mod.EnumMember
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createEnumDeclaration")
@js.native
object createEnumDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
}

