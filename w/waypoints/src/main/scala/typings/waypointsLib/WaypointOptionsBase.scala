package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointOptionsBase extends js.Object {
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[java.lang.String | scala.Double | js.Function0[scala.Double]] = js.undefined
}

object WaypointOptionsBase {
  @scala.inline
  def apply(
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    offset: java.lang.String | scala.Double | js.Function0[scala.Double] = null
  ): WaypointOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointOptionsBase]
  }
}

