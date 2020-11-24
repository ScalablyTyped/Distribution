package typings.typedoc.mod.TypeScript

import typings.typescript.mod.FunctionTypeNode
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createFunctionTypeNode")
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
