package typings
package winrtLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: scala.Boolean
  var failureReason: TranscodeFailureReason
  def transcodeAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double]
}

object IPrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: scala.Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double]]
  ): IPrepareTranscodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canTranscode")(canTranscode)
    __obj.updateDynamic("failureReason")(failureReason)
    __obj.updateDynamic("transcodeAsync")(transcodeAsync)
    __obj.asInstanceOf[IPrepareTranscodeResult]
  }
}

