package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointItem extends DataItem {
  var x: java.lang.String
  var y: scala.Double
}

object PointItem {
  @scala.inline
  def apply(
    content: java.lang.String,
    start: DateType,
    x: java.lang.String,
    y: scala.Double,
    className: java.lang.String = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    end: DateType = null,
    group: js.Any = null,
    id: IdType = null,
    style: java.lang.String = null,
    subgroup: SubgroupType = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): PointItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
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

