package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.anon.FixedLineage
import typings.tooltipster.anon.Scroll
import typings.tooltipster.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipsterGeoHelper extends js.Object {
  var document: Size
  var origin: FixedLineage
  var window: Scroll
}

object ITooltipsterGeoHelper {
  @scala.inline
  def apply(document: Size, origin: FixedLineage, window: Scroll): ITooltipsterGeoHelper = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterGeoHelper]
  }
}

