package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BinaryExpression
import typings.typescript.mod.BinaryOperator
import typings.typescript.mod.BinaryOperatorToken
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBinary")
@js.native
object createBinary extends js.Object {
  def apply(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def apply(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
}

