package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateIndexSignature")
@js.native
object updateIndexSignature extends js.Object {
  def apply(
    node: IndexSignatureDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
}

