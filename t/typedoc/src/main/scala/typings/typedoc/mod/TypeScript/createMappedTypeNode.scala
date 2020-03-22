package typings.typedoc.mod.TypeScript

import typings.typescript.mod.MappedTypeNode
import typings.typescript.mod.MinusToken
import typings.typescript.mod.PlusToken
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.ReadonlyToken
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createMappedTypeNode")
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
    questionToken: MinusToken | PlusToken | QuestionToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
}

