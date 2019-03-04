package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipStatus extends js.Object {
  /** if the tooltip has been destroyed */
  var destroyed: scala.Boolean
  /** if the tooltip is scheduled for destruction (which means that the tooltip is currently closing and may not be reopened) */
  var destroying: scala.Boolean
  /** if the tooltip is enabled */
  var enabled: scala.Boolean
  /** if the tooltip is open (either appearing, stable or disappearing) */
  var open: scala.Boolean
  /** the state equals one of these four values: */
  var state: tooltipsterLib.tooltipsterLibStrings.appearing | tooltipsterLib.tooltipsterLibStrings.stable | tooltipsterLib.tooltipsterLibStrings.disappearing | tooltipsterLib.tooltipsterLibStrings.closed
}

object ITooltipStatus {
  @scala.inline
  def apply(
    destroyed: scala.Boolean,
    destroying: scala.Boolean,
    enabled: scala.Boolean,
    open: scala.Boolean,
    state: tooltipsterLib.tooltipsterLibStrings.appearing | tooltipsterLib.tooltipsterLibStrings.stable | tooltipsterLib.tooltipsterLibStrings.disappearing | tooltipsterLib.tooltipsterLibStrings.closed
  ): ITooltipStatus = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, destroying = destroying, enabled = enabled, open = open, state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITooltipStatus]
  }
}

