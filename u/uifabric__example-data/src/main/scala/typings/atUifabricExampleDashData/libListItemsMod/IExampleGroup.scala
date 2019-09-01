package typings.atUifabricExampleDashData.libListItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleGroup extends js.Object {
  var children: js.UndefOr[js.Array[IExampleGroup]] = js.undefined
  var count: Double
  var isCollapsed: js.UndefOr[Boolean] = js.undefined
  var key: String
  var level: js.UndefOr[Double] = js.undefined
  var name: String
  var startIndex: Double
}

object IExampleGroup {
  @scala.inline
  def apply(
    count: Double,
    key: String,
    name: String,
    startIndex: Double,
    children: js.Array[IExampleGroup] = null,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    level: Int | Double = null
  ): IExampleGroup = {
    val __obj = js.Dynamic.literal(count = count, key = key, name = name, startIndex = startIndex)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleGroup]
  }
}

