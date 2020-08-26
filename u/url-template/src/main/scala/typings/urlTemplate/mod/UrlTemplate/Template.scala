package typings.urlTemplate.mod.UrlTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  def expand(parameters: js.Any): String = js.native
}

object Template {
  @scala.inline
  def apply(expand: js.Any => String): Template = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setExpand(value: js.Any => String): Self = this.set("expand", js.Any.fromFunction1(value))
  }
  
}

