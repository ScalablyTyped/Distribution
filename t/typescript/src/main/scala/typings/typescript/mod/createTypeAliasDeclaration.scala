package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createTypeAliasDeclaration")
@js.native
object createTypeAliasDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
}

