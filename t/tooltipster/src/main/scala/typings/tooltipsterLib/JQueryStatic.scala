package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var tooltipster: tooltipsterLib.JQueryTooltipsterNs.ITooltipsterStatic
}

object JQueryStatic {
  @scala.inline
  def apply(tooltipster: tooltipsterLib.JQueryTooltipsterNs.ITooltipsterStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

