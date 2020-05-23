package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateInterfaceDeclaration")
@js.native
object updateInterfaceDeclaration extends js.Object {
  def apply(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: Identifier,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
}

