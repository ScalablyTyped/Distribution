package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the PosPrinter.StatusUpdated event that occurs when the status of a point-of-service printer changes. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterStatusUpdatedEventArgs")
@js.native
abstract class PosPrinterStatusUpdatedEventArgs () extends js.Object {
  /** Gets the new status of the point-of-service printer after the status of the printer changes. */
  var status: PosPrinterStatus = js.native
}

