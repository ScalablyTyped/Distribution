package typings
package winrtLib.WindowsNs.MediaNs.TranscodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
@js.native
class PrepareTranscodeResult () extends IPrepareTranscodeResult {
  /* CompleteClass */
  override var canTranscode: scala.Boolean = js.native
  /* CompleteClass */
  override var failureReason: TranscodeFailureReason = js.native
  /* CompleteClass */
  override def transcodeAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncActionWithProgress[scala.Double] = js.native
}

