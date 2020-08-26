package typings.titanium.Titanium.UI

import typings.titanium.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a click is detected against the view.
  */
@js.native
trait DashboardItemClickEvent extends DashboardItemBaseEvent {
  /**
    * Item that was clicked.
    */
  var item: DashboardItem = js.native
  /**
    * Coordinates `x` and `y` of the event from the parent view's coordinate system.
    */
  var location: Point = js.native
}

object DashboardItemClickEvent {
  @scala.inline
  def apply(item: DashboardItem, location: Point, source: DashboardItem): DashboardItemClickEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardItemClickEvent]
  }
  @scala.inline
  implicit class DashboardItemClickEventOps[Self <: DashboardItemClickEvent] (val x: Self) extends AnyVal {
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
    def setItem(value: DashboardItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Point): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

