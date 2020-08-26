package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointOptionsJQuery extends WaypointOptionsBase {
  var context: js.UndefOr[HTMLElement | String] = js.native
  var handler: js.UndefOr[js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]] = js.native
}

object WaypointOptionsJQuery {
  @scala.inline
  def apply(): WaypointOptionsJQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptionsJQuery]
  }
  @scala.inline
  implicit class WaypointOptionsJQueryOps[Self <: WaypointOptionsJQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: HTMLElement | String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setHandler(value: js.ThisFunction1[/* this */ Waypoint, /* direction */ js.UndefOr[String], Unit]): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
  }
  
}

