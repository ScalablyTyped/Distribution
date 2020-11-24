package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createStringLiteral")
@js.native
object createStringLiteral extends js.Object {
  
  /** @deprecated Use `factory.createStringLiteral` or the factory supplied by your transformation context instead. */
  def apply(text: java.lang.String): StringLiteral = js.native
  def apply(
    text: java.lang.String,
    isSingleQuote: js.UndefOr[scala.Nothing],
    hasExtendedUnicodeEscape: Boolean
  ): StringLiteral = js.native
  def apply(text: java.lang.String, isSingleQuote: Boolean): StringLiteral = js.native
  def apply(text: java.lang.String, isSingleQuote: Boolean, hasExtendedUnicodeEscape: Boolean): StringLiteral = js.native
}
