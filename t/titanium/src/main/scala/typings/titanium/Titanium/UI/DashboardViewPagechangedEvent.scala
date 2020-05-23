package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the current page of the dashboard view changes.
  */
trait DashboardViewPagechangedEvent extends DashboardViewBaseEvent {
  /**
    * The current page number.
    */
  var pageNo: Double
}

object DashboardViewPagechangedEvent {
  @scala.inline
  def apply(pageNo: Double, source: DashboardView): DashboardViewPagechangedEvent = {
    val __obj = js.Dynamic.literal(pageNo = pageNo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardViewPagechangedEvent]
  }
}

