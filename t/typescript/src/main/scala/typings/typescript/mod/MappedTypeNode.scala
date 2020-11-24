package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.MappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedTypeNode
  extends TypeNode
     with Declaration
     with HasType {
  
  @JSName("kind")
  val kind_MappedTypeNode: MappedType = js.native
  
  val nameType: js.UndefOr[TypeNode] = js.native
  
  val questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken] = js.native
  
  val readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameter: TypeParameterDeclaration = js.native
}
