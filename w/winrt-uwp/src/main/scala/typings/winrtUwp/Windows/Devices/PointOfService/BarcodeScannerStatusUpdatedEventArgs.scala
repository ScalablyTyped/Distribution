package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
trait BarcodeScannerStatusUpdatedEventArgs extends js.Object {
  /** Gets the vendor specific status code. */
  var extendedStatus: Double
  /** Gets the status change information. */
  var status: BarcodeScannerStatus
}

object BarcodeScannerStatusUpdatedEventArgs {
  @scala.inline
  def apply(extendedStatus: Double, status: BarcodeScannerStatus): BarcodeScannerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerStatusUpdatedEventArgs]
  }
}

