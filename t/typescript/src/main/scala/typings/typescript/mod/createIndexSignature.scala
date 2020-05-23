package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createIndexSignature")
@js.native
object createIndexSignature extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
}

