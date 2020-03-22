package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.TemplateMiddle
import typings.typescript.mod.TemplateSpan
import typings.typescript.mod.TemplateTail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTemplateSpan")
@js.native
object createTemplateSpan extends js.Object {
  def apply(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def apply(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
}

