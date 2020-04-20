package typings.winrt.Windows.Media.Transcoding

import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: Boolean
  var failureReason: TranscodeFailureReason
  def transcodeAsync(): IAsyncActionWithProgress[Double]
}

object IPrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: () => IAsyncActionWithProgress[Double]
  ): IPrepareTranscodeResult = {
    val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
    __obj.asInstanceOf[IPrepareTranscodeResult]
  }
}

