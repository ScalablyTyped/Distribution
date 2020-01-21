package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataItem extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var content: String
  var editable: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[DateType] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[IdType] = js.undefined
  var start: DateType
  var style: js.UndefOr[String] = js.undefined
  var subgroup: js.UndefOr[SubgroupType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DataItem {
  @scala.inline
  def apply(
    content: String,
    start: DateType,
    className: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    end: DateType = null,
    group: js.Any = null,
    id: IdType = null,
    style: String = null,
    subgroup: SubgroupType = null,
    title: String = null,
    `type`: String = null
  ): DataItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subgroup != null) __obj.updateDynamic("subgroup")(subgroup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
}

