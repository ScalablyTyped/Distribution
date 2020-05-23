package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateCallSignature")
@js.native
object updateCallSignature extends js.Object {
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def apply(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
}

