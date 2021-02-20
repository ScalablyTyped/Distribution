package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDeclaration
  extends ClassElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_PropertyDeclaration: typings.typescript.mod.SyntaxKind.PropertyDeclaration = js.native
  
  @JSName("name")
  val name_PropertyDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyDeclaration: ClassLikeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
