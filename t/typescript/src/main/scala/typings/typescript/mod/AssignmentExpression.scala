package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression[TOperator /* <: AssignmentOperatorToken */] extends BinaryExpression {
  @JSName("left")
  var left_AssignmentExpression: LeftHandSideExpression = js.native
  @JSName("operatorToken")
  var operatorToken_AssignmentExpression: TOperator = js.native
}

