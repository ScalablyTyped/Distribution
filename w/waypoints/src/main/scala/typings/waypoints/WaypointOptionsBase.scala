package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointOptionsBase extends js.Object {
  var continuous: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[String | Double | js.Function0[Double]] = js.undefined
}

object WaypointOptionsBase {
  @scala.inline
  def apply(
    continuous: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    offset: String | Double | js.Function0[Double] = null
  ): WaypointOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointOptionsBase]
  }
}

