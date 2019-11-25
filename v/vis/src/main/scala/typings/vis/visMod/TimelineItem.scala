package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: String
  var editable: js.UndefOr[TimelineItemEditableType] = js.undefined
  var end: js.UndefOr[DateType] = js.undefined
  var group: js.UndefOr[IdType] = js.undefined
  var id: IdType
  var start: DateType
  var style: js.UndefOr[String] = js.undefined
  var subgroup: js.UndefOr[IdType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[TimelineItemType] = js.undefined
}

object TimelineItem {
  @scala.inline
  def apply(
    content: String,
    id: IdType,
    start: DateType,
    align: TimelineAlignType = null,
    className: String = null,
    editable: TimelineItemEditableType = null,
    end: DateType = null,
    group: IdType = null,
    style: String = null,
    subgroup: IdType = null,
    title: String = null,
    `type`: TimelineItemType = null
  ): TimelineItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subgroup != null) __obj.updateDynamic("subgroup")(subgroup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItem]
  }
}

