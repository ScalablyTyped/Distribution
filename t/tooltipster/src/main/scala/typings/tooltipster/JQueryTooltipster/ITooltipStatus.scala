package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.tooltipsterStrings.appearing
import typings.tooltipster.tooltipsterStrings.closed
import typings.tooltipster.tooltipsterStrings.disappearing
import typings.tooltipster.tooltipsterStrings.stable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipStatus extends js.Object {
  /** if the tooltip has been destroyed */
  var destroyed: Boolean = js.native
  /** if the tooltip is scheduled for destruction (which means that the tooltip is currently closing and may not be reopened) */
  var destroying: Boolean = js.native
  /** if the tooltip is enabled */
  var enabled: Boolean = js.native
  /** if the tooltip is open (either appearing, stable or disappearing) */
  var open: Boolean = js.native
  /** the state equals one of these four values: */
  var state: appearing | stable | disappearing | closed = js.native
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
  @scala.inline
  implicit class ITooltipStatusOps[Self <: ITooltipStatus] (val x: Self) extends AnyVal {
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
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroying(value: Boolean): Self = this.set("destroying", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: appearing | stable | disappearing | closed): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

