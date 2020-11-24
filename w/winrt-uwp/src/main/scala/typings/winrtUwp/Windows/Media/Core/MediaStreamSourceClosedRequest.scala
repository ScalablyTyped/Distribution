package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.closed event to provide information to the application. */
@js.native
trait MediaStreamSourceClosedRequest extends js.Object {
  
  /** Gets the reason why the media stream source was closed. */
  var reason: MediaStreamSourceClosedReason = js.native
}
object MediaStreamSourceClosedRequest {
  
  @scala.inline
  def apply(reason: MediaStreamSourceClosedReason): MediaStreamSourceClosedRequest = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedRequest]
  }
  
  @scala.inline
  implicit class MediaStreamSourceClosedRequestOps[Self <: MediaStreamSourceClosedRequest] (val x: Self) extends AnyVal {
    
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
    def setReason(value: MediaStreamSourceClosedReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
