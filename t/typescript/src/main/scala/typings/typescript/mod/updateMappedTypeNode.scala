package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateMappedTypeNode")
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
