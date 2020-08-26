package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createMappedTypeNode")
@js.native
object createMappedTypeNode extends js.Object {
  def apply(
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def apply(
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: MinusToken | PlusToken | QuestionToken
  ): MappedTypeNode = js.native
  def apply(
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: js.UndefOr[MinusToken | PlusToken | QuestionToken],
    `type`: TypeNode
  ): MappedTypeNode = js.native
}

