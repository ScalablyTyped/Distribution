package typings.urlTemplate.mod.UrlTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateParser extends js.Object {
  def parse(template: String): Template = js.native
}

object TemplateParser {
  @scala.inline
  def apply(parse: String => Template): TemplateParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[TemplateParser]
  }
  @scala.inline
  implicit class TemplateParserOps[Self <: TemplateParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParse(value: String => Template): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

