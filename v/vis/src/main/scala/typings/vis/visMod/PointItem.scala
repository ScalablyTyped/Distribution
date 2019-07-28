package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointItem extends DataItem {
  var x: String
  var y: Double
}

object PointItem {
  @scala.inline
  def apply(
    content: String,
    start: DateType,
    x: String,
    y: Double,
    className: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    end: DateType = null,
    group: js.Any = null,
    id: IdType = null,
    style: String = null,
    subgroup: SubgroupType = null,
    title: String = null,
    `type`: String = null
  ): PointItem = {
    val __obj = js.Dynamic.literal(content = content, start = start.asInstanceOf[js.Any], x = x, y = y)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (subgroup != null) __obj.updateDynamic("subgroup")(subgroup.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointItem]
  }
}

