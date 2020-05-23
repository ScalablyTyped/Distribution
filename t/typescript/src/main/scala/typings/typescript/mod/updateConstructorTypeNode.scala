package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateConstructorTypeNode")
@js.native
object updateConstructorTypeNode extends js.Object {
  def apply(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructorTypeNode = js.native
  def apply(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
}

