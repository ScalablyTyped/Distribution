package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementAccessExpression
  extends MemberExpression
     with BindingOrAssignmentElementTarget
     with _BindingOrAssignmentElement {
  var argumentExpression: Expression = js.native
  var expression: LeftHandSideExpression = js.native
  @JSName("kind")
  var kind_ElementAccessExpression: typings.typescript.typescriptMod.SyntaxKind.ElementAccessExpression = js.native
}

