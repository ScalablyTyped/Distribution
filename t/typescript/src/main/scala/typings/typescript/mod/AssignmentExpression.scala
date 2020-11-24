package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression[TOperator /* <: AssignmentOperatorToken */] extends BinaryExpression {
  
  @JSName("left")
  val left_AssignmentExpression: LeftHandSideExpression = js.native
  
  @JSName("operatorToken")
  val operatorToken_AssignmentExpression: TOperator = js.native
}
