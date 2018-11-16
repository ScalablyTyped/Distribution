package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when a service is requested. */
@JSGlobal("Windows.Media.Protection.ServiceRequestedEventArgs")
@js.native
abstract class ServiceRequestedEventArgs () extends js.Object {
  /** Returns an indication of the completion of the service request. */
  var completion: MediaProtectionServiceCompletion = js.native
  /** Gets the MediaPlaybackItem associated with the service request. */
  var mediaPlaybackItem: winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.MediaPlaybackItem = js.native
  /** Contains the service request. */
  var request: IMediaProtectionServiceRequest = js.native
}

