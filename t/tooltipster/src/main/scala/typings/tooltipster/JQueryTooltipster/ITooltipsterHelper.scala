package typings.tooltipster.JQueryTooltipster

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.tooltipster.tooltipsterStrings.constrained
import typings.tooltipster.tooltipsterStrings.natural
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipsterHelper extends js.Object {
  /** provided on functionBefore and functionAfter callbacks */
  var event: js.UndefOr[MouseEvent | TouchEvent | Null] = js.undefined
  /** provided on position callback */
  var geo: js.UndefOr[ITooltipsterGeoHelper] = js.undefined
  /** provided on position callback */
  var mode: js.UndefOr[natural | constrained] = js.undefined
  var origin: HTMLElement
  /** provided on functionReady and open callbacks */
  var tooltip: js.UndefOr[HTMLElement] = js.undefined
  /** provided on position callback */
  var tooltipClone: js.UndefOr[HTMLElement] = js.undefined
}

object ITooltipsterHelper {
  @scala.inline
  def apply(
    origin: HTMLElement,
    event: MouseEvent | TouchEvent = null,
    geo: ITooltipsterGeoHelper = null,
    mode: natural | constrained = null,
    tooltip: HTMLElement = null,
    tooltipClone: HTMLElement = null
  ): ITooltipsterHelper = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipClone != null) __obj.updateDynamic("tooltipClone")(tooltipClone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterHelper]
  }
}

