package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.ClassElement
import typings.typescript.mod.Decorator
import typings.typescript.mod.HeritageClause
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createClassDeclaration")
@js.native
object createClassDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
}

