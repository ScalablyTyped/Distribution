package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortInfo extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var ignoreSort: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
}

object ISortInfo {
  @scala.inline
  def apply(
    direction: String = null,
    ignoreSort: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined
  ): ISortInfo = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSort)) __obj.updateDynamic("ignoreSort")(ignoreSort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortInfo]
  }
}

