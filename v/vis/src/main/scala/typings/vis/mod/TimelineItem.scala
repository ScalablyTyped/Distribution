package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItem extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.native
  var className: js.UndefOr[String] = js.native
  var content: String = js.native
  var editable: js.UndefOr[TimelineItemEditableType] = js.native
  var end: js.UndefOr[DateType] = js.native
  var group: js.UndefOr[IdType] = js.native
  var id: IdType = js.native
  var start: DateType = js.native
  var style: js.UndefOr[String] = js.native
  var subgroup: js.UndefOr[IdType] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[TimelineItemType] = js.native
}

object TimelineItem {
  @scala.inline
  def apply(content: String, id: IdType, start: DateType): TimelineItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItem]
  }
  @scala.inline
  implicit class TimelineItemOps[Self <: TimelineItem] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: IdType): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: DateType): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: TimelineAlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEditable(value: TimelineItemEditableType): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEnd(value: DateType): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setGroup(value: IdType): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubgroup(value: IdType): Self = this.set("subgroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubgroup: Self = this.set("subgroup", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: TimelineItemType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

