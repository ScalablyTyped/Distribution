package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for a MediaProtectionManager object when a service is requested. */
@js.native
trait ServiceRequestedEventArgs extends StObject {
  
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
  implicit class ServiceRequestedEventArgsMutableBuilder[Self <: ServiceRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaPlaybackItem(value: MediaPlaybackItem): Self = StObject.set(x, "mediaPlaybackItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IMediaProtectionServiceRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
