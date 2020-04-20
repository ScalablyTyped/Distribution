package typings.tooltipster

import typings.tooltipster.JQueryTooltipster.ITooltipsterStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var tooltipster: ITooltipsterStatic
}

object JQueryStatic {
  @scala.inline
  def apply(tooltipster: ITooltipsterStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

