package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the StatusUpdated event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatusUpdatedEventArgs")
@js.native
abstract class CashDrawerStatusUpdatedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatusUpdatedEventArgs {
  /** Gets the data associated with the StatusUpdated event. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatus = js.native
}

