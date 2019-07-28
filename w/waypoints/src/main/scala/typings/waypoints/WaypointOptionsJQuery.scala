package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointOptionsJQuery extends WaypointOptionsBase {
  var context: js.UndefOr[HTMLElement | String] = js.undefined
  var handler: js.UndefOr[js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]] = js.undefined
}

object WaypointOptionsJQuery {
  @scala.inline
  def apply(
    context: HTMLElement | String = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    handler: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    offset: String | Double | js.Function0[Double] = null
  ): WaypointOptionsJQuery = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointOptionsJQuery]
  }
}

