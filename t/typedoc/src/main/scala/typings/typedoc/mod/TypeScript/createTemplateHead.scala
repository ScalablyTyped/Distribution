package typings.typedoc.mod.TypeScript

import typings.typescript.mod.TemplateHead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTemplateHead")
@js.native
object createTemplateHead extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: String): TemplateHead = js.native
  def apply(text: js.UndefOr[scala.Nothing], rawText: String, templateFlags: typings.typescript.mod.TokenFlags): TemplateHead = js.native
  /** @deprecated Use `factory.createTemplateHead` or the factory supplied by your transformation context instead. */
  def apply(text: String): TemplateHead = js.native
  def apply(text: String, rawText: js.UndefOr[scala.Nothing], templateFlags: typings.typescript.mod.TokenFlags): TemplateHead = js.native
  def apply(text: String, rawText: String): TemplateHead = js.native
  def apply(text: String, rawText: String, templateFlags: typings.typescript.mod.TokenFlags): TemplateHead = js.native
}
