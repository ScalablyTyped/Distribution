package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateArrowFunction")
@js.native
object updateArrowFunction extends js.Object {
  def apply(
    node: ArrowFunction,
    modifiers: js.UndefOr[js.Array[Modifier]],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    equalsGreaterThanToken: Token[typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
}

