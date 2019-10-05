package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateMappedTypeNode")
@js.native
object updateMappedTypeNode extends js.Object {
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
}

