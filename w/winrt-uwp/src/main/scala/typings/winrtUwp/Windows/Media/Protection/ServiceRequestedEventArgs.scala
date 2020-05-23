package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when a service is requested. */
trait ServiceRequestedEventArgs extends js.Object {
  /** Returns an indication of the completion of the service request. */
  var completion: MediaProtectionServiceCompletion
  /** Gets the MediaPlaybackItem associated with the service request. */
  var mediaPlaybackItem: MediaPlaybackItem
  /** Contains the service request. */
  var request: IMediaProtectionServiceRequest
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
}

