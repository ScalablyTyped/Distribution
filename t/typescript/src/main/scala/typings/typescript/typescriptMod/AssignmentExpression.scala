package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpression[TOperator /* <: AssignmentOperatorToken */] extends BinaryExpression {
  @JSName("left")
  var left_AssignmentExpression: LeftHandSideExpression = js.native
  @JSName("operatorToken")
  var operatorToken_AssignmentExpression: TOperator = js.native
}

