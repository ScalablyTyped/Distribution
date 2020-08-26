package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when a service is requested. */
@js.native
trait ServiceRequestedEventArgs extends js.Object {
  /** Returns an indication of the completion of the service request. */
  var completion: MediaProtectionServiceCompletion = js.native
  /** Gets the MediaPlaybackItem associated with the service request. */
  var mediaPlaybackItem: MediaPlaybackItem = js.native
  /** Contains the service request. */
  var request: IMediaProtectionServiceRequest = js.native
}

object ServiceRequestedEventArgs {
  @scala.inline
  def apply(
    completion: MediaProtectionServiceCompletion,
    mediaPlaybackItem: MediaPlaybackItem,
    request: IMediaProtectionServiceRequest
  ): ServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], mediaPlaybackItem = mediaPlaybackItem.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceRequestedEventArgs]
  }
  @scala.inline
  implicit class ServiceRequestedEventArgsOps[Self <: ServiceRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setCompletion(value: MediaProtectionServiceCompletion): Self = this.set("completion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaPlaybackItem(value: MediaPlaybackItem): Self = this.set("mediaPlaybackItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IMediaProtectionServiceRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

