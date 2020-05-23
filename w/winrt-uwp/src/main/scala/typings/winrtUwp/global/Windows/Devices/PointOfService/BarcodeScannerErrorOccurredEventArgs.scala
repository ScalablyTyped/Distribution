package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ErrorOccurred event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs")
@js.native
abstract class BarcodeScannerErrorOccurredEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerErrorOccurredEventArgs {
  /** Gets the data associated with the ErrorOccurred event. */
  /* CompleteClass */
  override var errorData: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosErrorData = js.native
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  /* CompleteClass */
  override var isRetriable: Boolean = js.native
  /** Gets any data that was successfully read. */
  /* CompleteClass */
  override var partialInputData: typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport = js.native
}

