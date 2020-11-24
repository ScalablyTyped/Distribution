package typings.winrtUwp.Windows.Media.Transcoding

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous media transcode deferral operation which can be used to start the transcode operation. */
@js.native
trait PrepareTranscodeResult extends js.Object {
  
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
  
  @scala.inline
  implicit class PrepareTranscodeResultOps[Self <: PrepareTranscodeResult] (val x: Self) extends AnyVal {
    
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
    def setTranscodeAsync(value: () => IPromiseWithIAsyncActionWithProgress[Double]): Self = this.set("transcodeAsync", js.Any.fromFunction0(value))
  }
}
