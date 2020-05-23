package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateConstructSignature")
@js.native
object updateConstructSignature extends js.Object {
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}

