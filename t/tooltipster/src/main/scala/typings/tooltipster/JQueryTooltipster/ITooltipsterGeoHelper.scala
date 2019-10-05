package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.Anon_FixedLineage
import typings.tooltipster.Anon_Scroll
import typings.tooltipster.Anon_Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipsterGeoHelper extends js.Object {
  var document: Anon_Size
  var origin: Anon_FixedLineage
  var window: Anon_Scroll
}

object ITooltipsterGeoHelper {
  @scala.inline
  def apply(document: Anon_Size, origin: Anon_FixedLineage, window: Anon_Scroll): ITooltipsterGeoHelper = {
    val __obj = js.Dynamic.literal(document = document, origin = origin, window = window)
  
    __obj.asInstanceOf[ITooltipsterGeoHelper]
  }
}

