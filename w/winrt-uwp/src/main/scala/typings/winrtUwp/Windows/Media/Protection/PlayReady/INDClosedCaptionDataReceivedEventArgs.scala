package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies arguments for a PlayReady-ND ClosedCaptionDataReceived event. */
trait INDClosedCaptionDataReceivedEventArgs extends js.Object {
  /** Gets the closed caption data. */
  var closedCaptionData: Double
  /** Gets the format of the closed caption data. */
  var closedCaptionDataFormat: NDClosedCaptionFormat
  /** Gets the timestamp of the closed caption data. */
  var presentationTimestamp: Double
}

object INDClosedCaptionDataReceivedEventArgs {
  @scala.inline
  def apply(
    closedCaptionData: Double,
    closedCaptionDataFormat: NDClosedCaptionFormat,
    presentationTimestamp: Double
  ): INDClosedCaptionDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(closedCaptionData = closedCaptionData.asInstanceOf[js.Any], closedCaptionDataFormat = closedCaptionDataFormat.asInstanceOf[js.Any], presentationTimestamp = presentationTimestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDClosedCaptionDataReceivedEventArgs]
  }
}

