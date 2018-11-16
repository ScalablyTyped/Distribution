package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ErrorOccurred event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs")
@js.native
abstract class BarcodeScannerErrorOccurredEventArgs () extends js.Object {
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData = js.native
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: scala.Boolean = js.native
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport = js.native
}

