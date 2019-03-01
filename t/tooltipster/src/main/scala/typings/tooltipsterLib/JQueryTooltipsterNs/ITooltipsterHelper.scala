package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipsterHelper extends js.Object {
  /** provided on functionBefore and functionAfter callbacks */
  var event: js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | scala.Null] = js.undefined
  /** provided on position callback */
  var geo: js.UndefOr[ITooltipsterGeoHelper] = js.undefined
  /** provided on position callback */
  var mode: js.UndefOr[
    tooltipsterLib.tooltipsterLibStrings.natural | tooltipsterLib.tooltipsterLibStrings.constrained
  ] = js.undefined
  var origin: stdLib.HTMLElement
  /** provided on functionReady and open callbacks */
  var tooltip: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** provided on position callback */
  var tooltipClone: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object ITooltipsterHelper {
  @scala.inline
  def apply(
    origin: stdLib.HTMLElement,
    event: stdLib.MouseEvent | stdLib.TouchEvent = null,
    geo: ITooltipsterGeoHelper = null,
    mode: tooltipsterLib.tooltipsterLibStrings.natural | tooltipsterLib.tooltipsterLibStrings.constrained = null,
    tooltip: stdLib.HTMLElement = null,
    tooltipClone: stdLib.HTMLElement = null
  ): ITooltipsterHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin)
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipClone != null) __obj.updateDynamic("tooltipClone")(tooltipClone)
    __obj.asInstanceOf[ITooltipsterHelper]
  }
}

