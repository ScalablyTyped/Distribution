package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides error information for the ErrorOccurred event. */
@js.native
trait MagneticStripeReaderErrorOccurredEventArgs extends js.Object {
  
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
  
  @scala.inline
  implicit class MagneticStripeReaderErrorOccurredEventArgsOps[Self <: MagneticStripeReaderErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorData(value: UnifiedPosErrorData): Self = this.set("errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialInputData(value: MagneticStripeReaderReport): Self = this.set("partialInputData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack1Status(value: MagneticStripeReaderTrackErrorType): Self = this.set("track1Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack2Status(value: MagneticStripeReaderTrackErrorType): Self = this.set("track2Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack3Status(value: MagneticStripeReaderTrackErrorType): Self = this.set("track3Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack4Status(value: MagneticStripeReaderTrackErrorType): Self = this.set("track4Status", value.asInstanceOf[js.Any])
  }
}
