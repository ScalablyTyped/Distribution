package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the current page of the dashboard view changes.
  */
@js.native
trait DashboardViewPagechangedEvent extends DashboardViewBaseEvent {
  /**
    * The current page number.
    */
  var pageNo: Double = js.native
}

object DashboardViewPagechangedEvent {
  @scala.inline
  def apply(pageNo: Double, source: DashboardView): DashboardViewPagechangedEvent = {
    val __obj = js.Dynamic.literal(pageNo = pageNo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewPagechangedEvent]
  }
  @scala.inline
  implicit class DashboardViewPagechangedEventOps[Self <: DashboardViewPagechangedEvent] (val x: Self) extends AnyVal {
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
    def setPageNo(value: Double): Self = this.set("pageNo", value.asInstanceOf[js.Any])
  }
  
}

