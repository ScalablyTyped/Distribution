package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createLiteral")
@js.native
object createLiteral extends js.Object {
  def apply(value: String): PrimaryExpression = js.native
  def apply(value: Boolean): BooleanLiteral = js.native
  def apply(value: Double): NumericLiteral = js.native
  def apply(value: Identifier): StringLiteral = js.native
  def apply(value: NoSubstitutionTemplateLiteral): StringLiteral = js.native
  def apply(value: NumericLiteral): StringLiteral = js.native
  def apply(value: PseudoBigInt): NumericLiteral = js.native
  def apply(value: StringLiteral): StringLiteral = js.native
}

