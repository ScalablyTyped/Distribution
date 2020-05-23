package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createArrowFunction")
@js.native
object createArrowFunction extends js.Object {
  def apply(
    modifiers: js.UndefOr[js.Array[Modifier]],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    equalsGreaterThanToken: js.UndefOr[EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
}

