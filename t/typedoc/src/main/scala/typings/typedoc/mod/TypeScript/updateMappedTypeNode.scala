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

@JSImport("typedoc", "TypeScript.updateMappedTypeNode")
@js.native
object updateMappedTypeNode extends js.Object {
  
  /** @deprecated Use `factory.updateMappedTypeNode` or the factory supplied by your transformation context instead. */
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode]
  ): MappedTypeNode = js.native
}
