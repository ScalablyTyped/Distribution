package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createFunctionTypeNode")
@js.native
object createFunctionTypeNode extends js.Object {
  
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  /** @deprecated Use `factory.createFunctionTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
}
