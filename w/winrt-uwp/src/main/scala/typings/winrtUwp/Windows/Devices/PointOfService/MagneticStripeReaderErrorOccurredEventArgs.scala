package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides error information for the ErrorOccurred event. */
trait MagneticStripeReaderErrorOccurredEventArgs extends js.Object {
  /** Gets the error information, such as cause of error, severity, error message, and any available vendor specific error information. */
  var errorData: UnifiedPosErrorData
  /** Gets the track data for tracks the did not have errors. */
  var partialInputData: MagneticStripeReaderReport
  /** Gets the Track 1 error information. */
  var track1Status: MagneticStripeReaderTrackErrorType
  /** Gets the Track 2 error information. */
  var track2Status: MagneticStripeReaderTrackErrorType
  /** Gets the Track 3 error information. */
  var track3Status: MagneticStripeReaderTrackErrorType
  /** Gets the Track 4 error information. */
  var track4Status: MagneticStripeReaderTrackErrorType
}

object MagneticStripeReaderErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorData: UnifiedPosErrorData,
    partialInputData: MagneticStripeReaderReport,
    track1Status: MagneticStripeReaderTrackErrorType,
    track2Status: MagneticStripeReaderTrackErrorType,
    track3Status: MagneticStripeReaderTrackErrorType,
    track4Status: MagneticStripeReaderTrackErrorType
  ): MagneticStripeReaderErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any], track1Status = track1Status.asInstanceOf[js.Any], track2Status = track2Status.asInstanceOf[js.Any], track3Status = track3Status.asInstanceOf[js.Any], track4Status = track4Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderErrorOccurredEventArgs]
  }
}

