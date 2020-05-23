package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the StatusUpdated event. */
trait CashDrawerStatusUpdatedEventArgs extends js.Object {
  /** Gets the data associated with the StatusUpdated event. */
  var status: CashDrawerStatus
}

object CashDrawerStatusUpdatedEventArgs {
  @scala.inline
  def apply(status: CashDrawerStatus): CashDrawerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatusUpdatedEventArgs]
  }
}

