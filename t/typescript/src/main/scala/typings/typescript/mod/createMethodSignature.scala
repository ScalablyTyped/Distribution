package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createMethodSignature")
@js.native
object createMethodSignature extends js.Object {
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: java.lang.String
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: java.lang.String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
}

