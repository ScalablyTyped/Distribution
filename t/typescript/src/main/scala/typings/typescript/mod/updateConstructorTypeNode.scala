package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateConstructorTypeNode")
@js.native
object updateConstructorTypeNode extends js.Object {
  
  def apply(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  /** @deprecated Use `factory.updateConstructorTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
}
