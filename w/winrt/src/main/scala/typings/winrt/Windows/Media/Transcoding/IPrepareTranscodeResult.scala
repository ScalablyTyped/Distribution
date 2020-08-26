package typings.winrt.Windows.Media.Transcoding

import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: Boolean = js.native
  var failureReason: TranscodeFailureReason = js.native
  def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
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
  @scala.inline
  implicit class IPrepareTranscodeResultOps[Self <: IPrepareTranscodeResult] (val x: Self) extends AnyVal {
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
    def setCanTranscode(value: Boolean): Self = this.set("canTranscode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureReason(value: TranscodeFailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranscodeAsync(value: () => IAsyncActionWithProgress[Double]): Self = this.set("transcodeAsync", js.Any.fromFunction0(value))
  }
  
}

