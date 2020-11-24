package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTemplateTail")
@js.native
object createTemplateTail extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateTail = js.native
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
  /** @deprecated Use `factory.createTemplateTail` or the factory supplied by your transformation context instead. */
  def apply(text: java.lang.String): TemplateTail = js.native
  def apply(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateTail = js.native
  def apply(text: java.lang.String, rawText: java.lang.String): TemplateTail = js.native
  def apply(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
}
