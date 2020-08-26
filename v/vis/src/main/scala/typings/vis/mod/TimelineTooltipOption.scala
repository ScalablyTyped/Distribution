package typings.vis.mod

import typings.vis.visStrings.cap
import typings.vis.visStrings.flip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineTooltipOption extends js.Object {
  var followMouse: js.UndefOr[Boolean] = js.native
  var overflowMethod: js.UndefOr[cap | flip] = js.native
}

object TimelineTooltipOption {
  @scala.inline
  def apply(): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTooltipOption]
  }
  @scala.inline
  implicit class TimelineTooltipOptionOps[Self <: TimelineTooltipOption] (val x: Self) extends AnyVal {
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
    def setFollowMouse(value: Boolean): Self = this.set("followMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowMouse: Self = this.set("followMouse", js.undefined)
    @scala.inline
    def setOverflowMethod(value: cap | flip): Self = this.set("overflowMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowMethod: Self = this.set("overflowMethod", js.undefined)
  }
  
}

