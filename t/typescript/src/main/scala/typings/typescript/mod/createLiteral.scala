package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createLiteral")
@js.native
object createLiteral extends js.Object {
  /** If a node is passed, creates a string literal whose source text is read from a source node during emit. */
  def apply(value: java.lang.String): StringLiteral = js.native
  def apply(value: Boolean): BooleanLiteral = js.native
  def apply(value: Double): NumericLiteral = js.native
  def apply(value: Identifier): StringLiteral = js.native
  def apply(value: NoSubstitutionTemplateLiteral): StringLiteral = js.native
  def apply(value: NumericLiteral): StringLiteral = js.native
  def apply(value: PseudoBigInt): NumericLiteral = js.native
  def apply(value: StringLiteral): StringLiteral = js.native
}

