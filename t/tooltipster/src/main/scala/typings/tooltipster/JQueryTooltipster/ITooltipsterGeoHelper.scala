package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.AnonFixedLineage
import typings.tooltipster.AnonScroll
import typings.tooltipster.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipsterGeoHelper extends js.Object {
  var document: AnonSize
  var origin: AnonFixedLineage
  var window: AnonScroll
}

object ITooltipsterGeoHelper {
  @scala.inline
  def apply(document: AnonSize, origin: AnonFixedLineage, window: AnonScroll): ITooltipsterGeoHelper = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterGeoHelper]
  }
}

