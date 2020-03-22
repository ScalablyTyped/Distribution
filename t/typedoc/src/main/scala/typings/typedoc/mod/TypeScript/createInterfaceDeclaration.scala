package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Decorator
import typings.typescript.mod.HeritageClause
import typings.typescript.mod.Identifier
import typings.typescript.mod.InterfaceDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.TypeElement
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createInterfaceDeclaration")
@js.native
object createInterfaceDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: String | Identifier,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
}

