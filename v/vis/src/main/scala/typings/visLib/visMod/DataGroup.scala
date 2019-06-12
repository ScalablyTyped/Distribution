package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[IdType]] = js.undefined
  var options: js.UndefOr[DataGroupOptions] = js.undefined
  var showNested: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var subgroupOrder: js.UndefOr[java.lang.String | js.Function0[scala.Unit]] = js.undefined
  var subgroupStack: js.UndefOr[SubGroupStackOptions | scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object DataGroup {
  @scala.inline
  def apply(
    content: java.lang.String,
    id: IdType,
    className: java.lang.String = null,
    nestedGroups: js.Array[IdType] = null,
    options: DataGroupOptions = null,
    showNested: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null,
    subgroupOrder: java.lang.String | js.Function0[scala.Unit] = null,
    subgroupStack: SubGroupStackOptions | scala.Boolean = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DataGroup = {
    val __obj = js.Dynamic.literal(content = content, id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (nestedGroups != null) __obj.updateDynamic("nestedGroups")(nestedGroups)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(showNested)) __obj.updateDynamic("showNested")(showNested)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subgroupOrder != null) __obj.updateDynamic("subgroupOrder")(subgroupOrder.asInstanceOf[js.Any])
    if (subgroupStack != null) __obj.updateDynamic("subgroupStack")(subgroupStack.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DataGroup]
  }
}

