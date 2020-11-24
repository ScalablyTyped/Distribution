package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import typings.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of the creation of a AdaptiveMediaSource object. */
@js.native
trait AdaptiveMediaSourceCreationResult extends js.Object {
  
  /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
  var httpResponseMessage: HttpResponseMessage = js.native
  
  /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
  var mediaSource: AdaptiveMediaSource = js.native
  
  /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
  var status: AdaptiveMediaSourceCreationStatus = js.native
}
object AdaptiveMediaSourceCreationResult {
  
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    mediaSource: AdaptiveMediaSource,
    status: AdaptiveMediaSourceCreationStatus
  ): AdaptiveMediaSourceCreationResult = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceCreationResult]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceCreationResultOps[Self <: AdaptiveMediaSourceCreationResult] (val x: Self) extends AnyVal {
    
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
    def setHttpResponseMessage(value: HttpResponseMessage): Self = this.set("httpResponseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSource(value: AdaptiveMediaSource): Self = this.set("mediaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AdaptiveMediaSourceCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
