package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createNumericLiteral")
@js.native
object createNumericLiteral extends js.Object {
  
  /** @deprecated Use `factory.createNumericLiteral` or the factory supplied by your transformation context instead. */
  def apply(value: java.lang.String): NumericLiteral = js.native
  def apply(value: java.lang.String, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  def apply(value: Double): NumericLiteral = js.native
  def apply(value: Double, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
}
