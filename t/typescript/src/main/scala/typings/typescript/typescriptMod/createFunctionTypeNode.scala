package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createFunctionTypeNode")
@js.native
object createFunctionTypeNode extends js.Object {
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def apply(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
}

