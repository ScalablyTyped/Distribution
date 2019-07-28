package typings.winrtDashUwp.WindowsNs.MediaNs.TranscodingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
@JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
@js.native
abstract class PrepareTranscodeResult () extends js.Object {
  /** Indicates whether the trancode operation can be performed successfully. */
  var canTranscode: Boolean = js.native
  /** Specifies the reason for the transcode failure. */
  var failureReason: TranscodeFailureReason = js.native
  /**
    * Creates an object to perform an asynchronous media transcode operation on media data.
    * @return An object that is used to control the asynchronous operation.
    */
  def transcodeAsync(): IPromiseWithIAsyncActionWithProgress[Double] = js.native
}

