package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLiteralExpression
  extends ObjectLiteralExpressionBase[ObjectLiteralElementLike]
     with AssignmentPattern
     with DestructuringPattern
     with JsonObjectExpression
     with ObjectBindingOrAssignmentPattern
     with _ArrayBindingOrAssignmentElement {
  
  @JSName("kind")
  val kind_ObjectLiteralExpression: typings.typescript.mod.SyntaxKind.ObjectLiteralExpression = js.native
}
