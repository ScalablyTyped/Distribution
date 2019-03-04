package typings
package urlDashTemplateLib.urlDashTemplateMod.UrlTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateParser extends js.Object {
  def parse(template: java.lang.String): Template
}

object TemplateParser {
  @scala.inline
  def apply(parse: js.Function1[java.lang.String, Template]): TemplateParser = {
    val __obj = js.Dynamic.literal(parse = parse)
  
    __obj.asInstanceOf[TemplateParser]
  }
}

