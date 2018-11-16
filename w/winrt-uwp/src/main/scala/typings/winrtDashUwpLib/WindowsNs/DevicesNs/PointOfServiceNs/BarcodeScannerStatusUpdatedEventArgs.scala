package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerStatusUpdatedEventArgs")
@js.native
abstract class BarcodeScannerStatusUpdatedEventArgs () extends js.Object {
  /** Gets the vendor specific status code. */
  var extendedStatus: scala.Double = js.native
  /** Gets the status change information. */
  var status: BarcodeScannerStatus = js.native
}

