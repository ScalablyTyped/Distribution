package typings.tooltipster

import typings.tooltipster.JQueryTooltipster.ITooltipsterStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  var tooltipster: ITooltipsterStatic = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(tooltipster: ITooltipsterStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
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
    def setTooltipster(value: ITooltipsterStatic): Self = this.set("tooltipster", value.asInstanceOf[js.Any])
  }
  
}

