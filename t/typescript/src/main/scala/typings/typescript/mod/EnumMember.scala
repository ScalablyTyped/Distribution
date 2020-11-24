package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumMember
  extends NamedDeclaration
     with JSDocContainer
     with HasExpressionInitializer
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_EnumMember: typings.typescript.mod.SyntaxKind.EnumMember = js.native
  
  @JSName("name")
  val name_EnumMember: PropertyName = js.native
  
  @JSName("parent")
  val parent_EnumMember: EnumDeclaration = js.native
}
