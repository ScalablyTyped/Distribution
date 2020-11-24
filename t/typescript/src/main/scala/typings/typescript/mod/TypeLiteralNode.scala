package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.TypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeLiteralNode
  extends TypeNode
     with Declaration
     with ObjectTypeDeclaration {
  
  @JSName("kind")
  val kind_TypeLiteralNode: TypeLiteral = js.native
  
  val members: NodeArray[TypeElement] = js.native
}
