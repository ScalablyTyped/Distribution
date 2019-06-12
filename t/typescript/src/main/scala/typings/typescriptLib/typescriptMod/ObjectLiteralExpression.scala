package typings
package typescriptLib.typescriptMod

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
  var kind_ObjectLiteralExpression: typescriptLib.typescriptMod.SyntaxKind.ObjectLiteralExpression = js.native
}

