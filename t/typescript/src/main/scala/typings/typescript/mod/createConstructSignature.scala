package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createConstructSignature")
@js.native
object createConstructSignature extends js.Object {
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
}

