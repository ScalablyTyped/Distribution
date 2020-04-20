package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.tooltipsterStrings.appearing
import typings.tooltipster.tooltipsterStrings.closed
import typings.tooltipster.tooltipsterStrings.disappearing
import typings.tooltipster.tooltipsterStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipStatus extends js.Object {
  /** if the tooltip has been destroyed */
  var destroyed: Boolean
  /** if the tooltip is scheduled for destruction (which means that the tooltip is currently closing and may not be reopened) */
  var destroying: Boolean
  /** if the tooltip is enabled */
  var enabled: Boolean
  /** if the tooltip is open (either appearing, stable or disappearing) */
  var open: Boolean
  /** the state equals one of these four values: */
  var state: appearing | stable | disappearing | closed
}

object ITooltipStatus {
  @scala.inline
  def apply(
    destroyed: Boolean,
    destroying: Boolean,
    enabled: Boolean,
    open: Boolean,
    state: appearing | stable | disappearing | closed
  ): ITooltipStatus = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], destroying = destroying.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStatus]
  }
}

