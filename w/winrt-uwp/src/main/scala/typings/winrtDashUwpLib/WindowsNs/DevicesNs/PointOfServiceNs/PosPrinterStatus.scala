package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the status of a point-of-service printer, such as the power state of the printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterStatus")
@js.native
abstract class PosPrinterStatus () extends js.Object {
  /** Gets extended information about the power state of the point-of-service printer that the original equipment manufacturer (OEM) defines. Value is only valid if the PosPrinterStatus.StatusKind property is PosPrinterStatusKind.Extended. */
  var extendedStatus: scala.Double = js.native
  /** Gets the power state of a point-of-service printer. */
  var statusKind: PosPrinterStatusKind = js.native
}

