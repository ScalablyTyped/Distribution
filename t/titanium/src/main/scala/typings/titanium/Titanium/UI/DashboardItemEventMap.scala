package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardItemEventMap extends ProxyEventMap {
  var click: DashboardItemClickEvent = js.native
  var delete: DashboardItemDeleteEvent = js.native
  var move: DashboardItemMoveEvent = js.native
}

object DashboardItemEventMap {
  @scala.inline
  def apply(click: DashboardItemClickEvent, delete: DashboardItemDeleteEvent, move: DashboardItemMoveEvent): DashboardItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemEventMap]
  }
  @scala.inline
  implicit class DashboardItemEventMapOps[Self <: DashboardItemEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: DashboardItemClickEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: DashboardItemDeleteEvent): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: DashboardItemMoveEvent): Self = this.set("move", value.asInstanceOf[js.Any])
  }
  
}

