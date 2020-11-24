package typings.typedoc.mod.TypeScript

import typings.typescript.mod.MappedTypeNode
import typings.typescript.mod.MinusToken
import typings.typescript.mod.PlusToken
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.ReadonlyKeyword
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createMappedTypeNode")
@js.native
object createMappedTypeNode extends js.Object {
  
  /** @deprecated Use `factory.createMappedTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode]
  ): MappedTypeNode = js.native
}
