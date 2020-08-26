package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItemsAlwaysDraggableOption extends js.Object {
  var item: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[Boolean] = js.native
}

object TimelineItemsAlwaysDraggableOption {
  @scala.inline
  def apply(): TimelineItemsAlwaysDraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItemsAlwaysDraggableOption]
  }
  @scala.inline
  implicit class TimelineItemsAlwaysDraggableOptionOps[Self <: TimelineItemsAlwaysDraggableOption] (val x: Self) extends AnyVal {
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
    def setItem(value: Boolean): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

