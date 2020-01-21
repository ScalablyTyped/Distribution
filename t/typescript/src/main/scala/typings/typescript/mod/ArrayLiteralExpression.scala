package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLiteralExpression
  extends PrimaryExpression
     with ArrayBindingOrAssignmentPattern
     with AssignmentPattern
     with DestructuringPattern
     with _BindingOrAssignmentElement {
  var elements: NodeArray[Expression] = js.native
  @JSName("kind")
  var kind_ArrayLiteralExpression: typings.typescript.mod.SyntaxKind.ArrayLiteralExpression = js.native
}

