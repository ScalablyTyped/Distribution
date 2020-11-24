package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTemplateHead")
@js.native
object createTemplateHead extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String): TemplateHead = js.native
  def apply(text: js.UndefOr[scala.Nothing], rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
  /** @deprecated Use `factory.createTemplateHead` or the factory supplied by your transformation context instead. */
  def apply(text: java.lang.String): TemplateHead = js.native
  def apply(text: java.lang.String, rawText: js.UndefOr[scala.Nothing], templateFlags: TokenFlags): TemplateHead = js.native
  def apply(text: java.lang.String, rawText: java.lang.String): TemplateHead = js.native
  def apply(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
}
