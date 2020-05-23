package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateTypeAliasDeclaration")
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

