package typings.vis.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroup extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var content: String | HTMLElement
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var showNested: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var subgroupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TimelineGroup {
  @scala.inline
  def apply(
    content: String | HTMLElement,
    id: IdType,
    className: String = null,
    nestedGroups: js.Array[IdType] = null,
    order: Int | Double = null,
    showNested: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    subgroupOrder: TimelineOptionsGroupOrderType = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TimelineGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (nestedGroups != null) __obj.updateDynamic("nestedGroups")(nestedGroups.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(showNested)) __obj.updateDynamic("showNested")(showNested.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subgroupOrder != null) __obj.updateDynamic("subgroupOrder")(subgroupOrder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
}

