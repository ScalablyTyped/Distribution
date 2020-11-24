package typings.typedoc.mod.TypeScript

import typings.typescript.mod.NumericLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createNumericLiteral")
@js.native
object createNumericLiteral extends js.Object {
  
  /** @deprecated Use `factory.createNumericLiteral` or the factory supplied by your transformation context instead. */
  def apply(value: String): NumericLiteral = js.native
  def apply(value: String, numericLiteralFlags: typings.typescript.mod.TokenFlags): NumericLiteral = js.native
  def apply(value: Double): NumericLiteral = js.native
  def apply(value: Double, numericLiteralFlags: typings.typescript.mod.TokenFlags): NumericLiteral = js.native
}
