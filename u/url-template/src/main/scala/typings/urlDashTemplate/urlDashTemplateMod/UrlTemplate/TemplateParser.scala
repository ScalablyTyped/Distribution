package typings.urlDashTemplate.urlDashTemplateMod.UrlTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParser extends js.Object {
  def parse(template: String): Template
}

object TemplateParser {
  @scala.inline
  def apply(parse: String => Template): TemplateParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[TemplateParser]
  }
}

