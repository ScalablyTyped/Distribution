package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createFunctionDeclaration")
@js.native
object createFunctionDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
}

