package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information for the ErrorOccurred event. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs")
@js.native
abstract class MagneticStripeReaderErrorOccurredEventArgs () extends js.Object {
  /** Gets the error information, such as cause of error, severity, error message, and any available vendor specific error information. */
  var errorData: UnifiedPosErrorData = js.native
  /** Gets the track data for tracks the did not have errors. */
  var partialInputData: MagneticStripeReaderReport = js.native
  /** Gets the Track 1 error information. */
  var track1Status: MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 2 error information. */
  var track2Status: MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 3 error information. */
  var track3Status: MagneticStripeReaderTrackErrorType = js.native
  /** Gets the Track 4 error information. */
  var track4Status: MagneticStripeReaderTrackErrorType = js.native
}

