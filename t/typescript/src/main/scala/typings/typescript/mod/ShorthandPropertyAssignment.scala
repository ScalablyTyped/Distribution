package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShorthandPropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with ObjectBindingOrAssignmentElement
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  val equalsToken: js.UndefOr[EqualsToken] = js.native
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  @JSName("kind")
  val kind_ShorthandPropertyAssignment: typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment = js.native
  
  @JSName("name")
  val name_ShorthandPropertyAssignment: Identifier = js.native
  
  val objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  
  @JSName("parent")
  val parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
