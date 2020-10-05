package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateFunctionTypeNode")
@js.native
object updateFunctionTypeNode extends js.Object {
  def apply(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): FunctionTypeNode = js.native
  def apply(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def apply(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): FunctionTypeNode = js.native
  def apply(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
}

