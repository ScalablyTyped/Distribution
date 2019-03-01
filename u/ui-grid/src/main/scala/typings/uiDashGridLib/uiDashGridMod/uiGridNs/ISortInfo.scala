package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortInfo extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var ignoreSort: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object ISortInfo {
  @scala.inline
  def apply(
    direction: java.lang.String = null,
    ignoreSort: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null
  ): ISortInfo = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(ignoreSort)) __obj.updateDynamic("ignoreSort")(ignoreSort)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortInfo]
  }
}

