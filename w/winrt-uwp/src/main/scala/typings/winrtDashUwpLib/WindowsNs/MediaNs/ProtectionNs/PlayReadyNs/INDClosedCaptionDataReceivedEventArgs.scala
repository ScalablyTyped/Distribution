package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies arguments for a PlayReady-ND ClosedCaptionDataReceived event. */
trait INDClosedCaptionDataReceivedEventArgs extends js.Object {
  /** Gets the closed caption data. */
  var closedCaptionData: scala.Double
  /** Gets the format of the closed caption data. */
  var closedCaptionDataFormat: NDClosedCaptionFormat
  /** Gets the timestamp of the closed caption data. */
  var presentationTimestamp: scala.Double
}

object INDClosedCaptionDataReceivedEventArgs {
  @scala.inline
  def apply(
    closedCaptionData: scala.Double,
    closedCaptionDataFormat: NDClosedCaptionFormat,
    presentationTimestamp: scala.Double
  ): INDClosedCaptionDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closedCaptionData")(closedCaptionData)
    __obj.updateDynamic("closedCaptionDataFormat")(closedCaptionDataFormat)
    __obj.updateDynamic("presentationTimestamp")(presentationTimestamp)
    __obj.asInstanceOf[INDClosedCaptionDataReceivedEventArgs]
  }
}

