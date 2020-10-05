package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShorthandPropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement
     with _HasJSDoc {
  var equalsToken: js.UndefOr[Token[typings.typescript.mod.SyntaxKind.EqualsToken]] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("kind")
  var kind_ShorthandPropertyAssignment: typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment = js.native
  @JSName("name")
  var name_ShorthandPropertyAssignment: Identifier = js.native
  var objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

