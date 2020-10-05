package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with HasExpressionInitializer
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement
     with _HasJSDoc {
  var initializer: Expression = js.native
  @JSName("kind")
  var kind_PropertyAssignment: typings.typescript.mod.SyntaxKind.PropertyAssignment = js.native
  @JSName("name")
  var name_PropertyAssignment: PropertyName = js.native
  @JSName("parent")
  var parent_PropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

