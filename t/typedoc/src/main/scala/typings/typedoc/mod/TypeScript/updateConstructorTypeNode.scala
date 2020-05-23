package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConstructorTypeNode
import typings.typescript.mod.NodeArray
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateConstructorTypeNode")
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

