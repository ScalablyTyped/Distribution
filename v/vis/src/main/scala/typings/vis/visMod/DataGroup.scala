package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroup extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var content: String
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  var options: js.UndefOr[DataGroupOptions] = js.undefined
  var showNested: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var subgroupOrder: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  var subgroupStack: js.UndefOr[SubGroupStackOptions | Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DataGroup {
  @scala.inline
  def apply(
    content: String,
    id: IdType,
    className: String = null,
    nestedGroups: js.Array[IdType] = null,
    options: DataGroupOptions = null,
    showNested: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    subgroupOrder: String | js.Function0[Unit] = null,
    subgroupStack: SubGroupStackOptions | Boolean = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DataGroup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (nestedGroups != null) __obj.updateDynamic("nestedGroups")(nestedGroups.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(showNested)) __obj.updateDynamic("showNested")(showNested.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subgroupOrder != null) __obj.updateDynamic("subgroupOrder")(subgroupOrder.asInstanceOf[js.Any])
    if (subgroupStack != null) __obj.updateDynamic("subgroupStack")(subgroupStack.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroup]
  }
}

