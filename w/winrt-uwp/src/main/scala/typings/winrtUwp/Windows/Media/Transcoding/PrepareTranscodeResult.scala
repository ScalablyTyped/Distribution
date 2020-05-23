package typings.winrtUwp.Windows.Media.Transcoding

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
trait PrepareTranscodeResult extends js.Object {
  /** Indicates whether the trancode operation can be performed successfully. */
  var canTranscode: Boolean
  /** Specifies the reason for the transcode failure. */
  var failureReason: TranscodeFailureReason
  /**
    * Creates an object to perform an asynchronous media transcode operation on media data.
    * @return An object that is used to control the asynchronous operation.
    */
  def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double]
}

object PrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: () => IPromiseWithIAsyncActionWithProgress[Double]
  ): PrepareTranscodeResult = {
    val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
    __obj.asInstanceOf[PrepareTranscodeResult]
  }
}

