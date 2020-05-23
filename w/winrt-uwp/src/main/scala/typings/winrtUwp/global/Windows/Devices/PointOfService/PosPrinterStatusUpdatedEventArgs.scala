package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the PosPrinter.StatusUpdated event that occurs when the status of a point-of-service printer changes. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs")
@js.native
abstract class PosPrinterStatusUpdatedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs {
  /** Gets the new status of the point-of-service printer after the status of the printer changes. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterStatus = js.native
}

