package typings.typedoc.mod.TypeScript

import typings.typescript.mod.FunctionTypeNode
import typings.typescript.mod.NodeArray
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateFunctionTypeNode")
@js.native
object updateFunctionTypeNode extends js.Object {
  def apply(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration]
  ): FunctionTypeNode = js.native
  def apply(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
}

