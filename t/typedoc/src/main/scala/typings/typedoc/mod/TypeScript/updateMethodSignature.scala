package typings.typedoc.mod.TypeScript

import typings.typescript.mod.MethodSignature
import typings.typescript.mod.NodeArray
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateMethodSignature")
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

