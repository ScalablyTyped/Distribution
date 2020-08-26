package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItemEditableOption extends js.Object {
  var remove: js.UndefOr[Boolean] = js.native
  var updateGroup: js.UndefOr[Boolean] = js.native
  var updateTime: js.UndefOr[Boolean] = js.native
}

object TimelineItemEditableOption {
  @scala.inline
  def apply(): TimelineItemEditableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemEditableOption]
  }
  @scala.inline
  implicit class TimelineItemEditableOptionOps[Self <: TimelineItemEditableOption] (val x: Self) extends AnyVal {
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
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setUpdateGroup(value: Boolean): Self = this.set("updateGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateGroup: Self = this.set("updateGroup", js.undefined)
    @scala.inline
    def setUpdateTime(value: Boolean): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

