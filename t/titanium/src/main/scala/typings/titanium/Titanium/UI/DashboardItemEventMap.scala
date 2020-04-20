package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardItemEventMap extends ProxyEventMap {
  var click: DashboardItemClickEvent
  var delete: DashboardItemDeleteEvent
  var move: DashboardItemMoveEvent
}

object DashboardItemEventMap {
  @scala.inline
  def apply(click: DashboardItemClickEvent, delete: DashboardItemDeleteEvent, move: DashboardItemMoveEvent): DashboardItemEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemEventMap]
  }
}

