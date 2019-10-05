package typings.winrtDashUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the StatusUpdated event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatusUpdatedEventArgs")
@js.native
abstract class CashDrawerStatusUpdatedEventArgs () extends js.Object {
  /** Gets the data associated with the StatusUpdated event. */
  var status: CashDrawerStatus = js.native
}

