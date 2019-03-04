package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String | stdLib.HTMLElement
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var showNested: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var subgroupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineGroup {
  @scala.inline
  def apply(
    content: java.lang.String | stdLib.HTMLElement,
    id: IdType,
    className: java.lang.String = null,
    nestedGroups: js.Array[IdType] = null,
    order: scala.Int | scala.Double = null,
    showNested: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    subgroupOrder: TimelineOptionsGroupOrderType = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TimelineGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (nestedGroups != null) __obj.updateDynamic("nestedGroups")(nestedGroups)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(showNested)) __obj.updateDynamic("showNested")(showNested)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subgroupOrder != null) __obj.updateDynamic("subgroupOrder")(subgroupOrder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TimelineGroup]
  }
}

