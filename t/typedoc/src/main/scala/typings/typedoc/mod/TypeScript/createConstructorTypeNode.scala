package typings.typedoc.mod.TypeScript

import typings.typescript.mod.ConstructorTypeNode
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createConstructorTypeNode")
@js.native
object createConstructorTypeNode extends js.Object {
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorTypeNode = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
}

