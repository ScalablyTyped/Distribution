package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateClassExpression")
@js.native
object updateClassExpression extends js.Object {
  def apply(
    node: ClassExpression,
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
}

