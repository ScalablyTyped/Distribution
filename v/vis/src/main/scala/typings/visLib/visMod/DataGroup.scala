package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var options: js.UndefOr[DataGroupOptions] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var subgroupOrder: js.UndefOr[java.lang.String | js.Function0[scala.Unit]] = js.undefined
  var subgroupStack: js.UndefOr[SubGroupStackOptions | scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DataGroup {
  @scala.inline
  def apply(
    content: java.lang.String,
    id: IdType,
    className: java.lang.String = null,
    nestedGroups: js.Array[scala.Double] = null,
    options: DataGroupOptions = null,
    style: java.lang.String = null,
    subgroupOrder: java.lang.String | js.Function0[scala.Unit] = null,
    subgroupStack: SubGroupStackOptions | scala.Boolean = null,
    title: java.lang.String = null
  ): DataGroup = {
    val __obj = js.Dynamic.literal(content = content, id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (nestedGroups != null) __obj.updateDynamic("nestedGroups")(nestedGroups)
    if (options != null) __obj.updateDynamic("options")(options)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subgroupOrder != null) __obj.updateDynamic("subgroupOrder")(subgroupOrder.asInstanceOf[js.Any])
    if (subgroupStack != null) __obj.updateDynamic("subgroupStack")(subgroupStack.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DataGroup]
  }
}

