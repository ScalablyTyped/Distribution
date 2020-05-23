package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ErrorOccurred event. */
trait BarcodeScannerErrorOccurredEventArgs extends js.Object {
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: Boolean
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport
}

object BarcodeScannerErrorOccurredEventArgs {
  @scala.inline
  def apply(errorData: UnifiedPosErrorData, isRetriable: Boolean, partialInputData: BarcodeScannerReport): BarcodeScannerErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], isRetriable = isRetriable.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerErrorOccurredEventArgs]
  }
}

