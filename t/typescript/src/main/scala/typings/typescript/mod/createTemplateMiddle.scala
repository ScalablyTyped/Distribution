package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTemplateMiddle")
@js.native
object createTemplateMiddle extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateMiddle = js.native
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
  /** @deprecated Use `factory.createTemplateMiddle` or the factory supplied by your transformation context instead. */
  def apply(text: java.lang.String): TemplateMiddle = js.native
  def apply(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateMiddle = js.native
  def apply(text: java.lang.String, rawText: java.lang.String): TemplateMiddle = js.native
  def apply(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
}
