package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLiteralExpression
  extends ObjectLiteralExpressionBase[ObjectLiteralElementLike]
     with AssignmentPattern
     with DestructuringPattern
     with ObjectBindingOrAssignmentPattern
     with _BindingOrAssignmentElement {
  @JSName("kind")
  var kind_ObjectLiteralExpression: typings.typescript.mod.SyntaxKind.ObjectLiteralExpression = js.native
}

