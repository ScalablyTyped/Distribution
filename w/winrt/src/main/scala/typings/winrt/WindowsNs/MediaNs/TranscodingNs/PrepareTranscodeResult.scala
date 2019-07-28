package typings.winrt.WindowsNs.MediaNs.TranscodingNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
@js.native
class PrepareTranscodeResult () extends IPrepareTranscodeResult {
  /* CompleteClass */
  override var canTranscode: Boolean = js.native
  /* CompleteClass */
  override var failureReason: TranscodeFailureReason = js.native
  /* CompleteClass */
  override def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
}

