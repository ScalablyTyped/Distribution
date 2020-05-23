package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.TypeAliasDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTypeAliasDeclaration")
@js.native
object updateTypeAliasDeclaration extends js.Object {
  def apply(
    node: TypeAliasDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
}

