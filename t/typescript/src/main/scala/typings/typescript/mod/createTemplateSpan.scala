package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTemplateSpan")
@js.native
object createTemplateSpan extends js.Object {
  
  /** @deprecated Use `factory.createTemplateSpan` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def apply(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
}
