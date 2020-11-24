package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateBinary")
@js.native
object updateBinary extends js.Object {
  
  /** @deprecated Use `factory.updateBinary` or the factory supplied by your transformation context instead. */
  def apply(node: BinaryExpression, left: Expression, right: Expression): BinaryExpression = js.native
  def apply(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperator): BinaryExpression = js.native
  def apply(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperatorToken): BinaryExpression = js.native
}
