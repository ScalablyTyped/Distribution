package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createConstructorTypeNode")
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

