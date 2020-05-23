package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateMethodSignature")
@js.native
object updateMethodSignature extends js.Object {
  def apply(
    node: MethodSignature,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName
  ): MethodSignature = js.native
  def apply(
    node: MethodSignature,
    typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
}

