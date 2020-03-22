package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ClassElement
import typings.typescript.mod.ClassExpression
import typings.typescript.mod.HeritageClause
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createClassExpression")
@js.native
object createClassExpression extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
}

