package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createClassExpression")
@js.native
object createClassExpression extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[Identifier | java.lang.String],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
}

