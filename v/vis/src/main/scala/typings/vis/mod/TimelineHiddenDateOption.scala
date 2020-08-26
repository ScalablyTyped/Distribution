package typings.vis.mod

import typings.vis.visStrings.daily
import typings.vis.visStrings.monthly
import typings.vis.visStrings.weekly
import typings.vis.visStrings.yearly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineHiddenDateOption extends js.Object {
  var end: DateType = js.native
  var repeat: js.UndefOr[daily | weekly | monthly | yearly] = js.native
  var start: DateType = js.native
}

object TimelineHiddenDateOption {
  @scala.inline
  def apply(end: DateType, start: DateType): TimelineHiddenDateOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHiddenDateOption]
  }
  @scala.inline
  implicit class TimelineHiddenDateOptionOps[Self <: TimelineHiddenDateOption] (val x: Self) extends AnyVal {
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
    def setEnd(value: DateType): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: DateType): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: daily | weekly | monthly | yearly): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

