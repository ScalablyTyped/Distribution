package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateConstructSignature")
@js.native
object updateConstructSignature extends js.Object {
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def apply(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}

