package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShorthandPropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement
     with _HasJSDoc {
  var equalsToken: js.UndefOr[Token[SyntaxKind]] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("name")
  var name_ShorthandPropertyAssignment: Identifier = js.native
  var objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

