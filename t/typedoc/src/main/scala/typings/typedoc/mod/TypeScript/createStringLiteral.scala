package typings.typedoc.mod.TypeScript

import typings.typescript.mod.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createStringLiteral")
@js.native
object createStringLiteral extends js.Object {
  
  /** @deprecated Use `factory.createStringLiteral` or the factory supplied by your transformation context instead. */
  def apply(text: String): StringLiteral = js.native
  def apply(text: String, isSingleQuote: js.UndefOr[scala.Nothing], hasExtendedUnicodeEscape: Boolean): StringLiteral = js.native
  def apply(text: String, isSingleQuote: Boolean): StringLiteral = js.native
  def apply(text: String, isSingleQuote: Boolean, hasExtendedUnicodeEscape: Boolean): StringLiteral = js.native
}
