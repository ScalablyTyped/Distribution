package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.TemplateMiddle
import typings.typescript.mod.TemplateSpan
import typings.typescript.mod.TemplateTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateTemplateSpan")
@js.native
object updateTemplateSpan extends js.Object {
  
  /** @deprecated Use `factory.updateTemplateSpan` or the factory supplied by your transformation context instead. */
  def apply(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def apply(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan = js.native
}
