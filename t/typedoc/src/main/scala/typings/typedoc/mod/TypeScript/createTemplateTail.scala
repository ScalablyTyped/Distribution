package typings.typedoc.mod.TypeScript

import typings.typescript.mod.TemplateTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTemplateTail")
@js.native
object createTemplateTail extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: String): TemplateTail = js.native
  def apply(text: js.UndefOr[scala.Nothing], rawText: String, templateFlags: typings.typescript.mod.TokenFlags): TemplateTail = js.native
  /** @deprecated Use `factory.createTemplateTail` or the factory supplied by your transformation context instead. */
  def apply(text: String): TemplateTail = js.native
  def apply(text: String, rawText: js.UndefOr[scala.Nothing], templateFlags: typings.typescript.mod.TokenFlags): TemplateTail = js.native
  def apply(text: String, rawText: String): TemplateTail = js.native
  def apply(text: String, rawText: String, templateFlags: typings.typescript.mod.TokenFlags): TemplateTail = js.native
}
