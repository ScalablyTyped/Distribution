package typings.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveInboundEndpointPairCreatedEventArgs extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPair: XboxLiveEndpointPair
}

object XboxLiveInboundEndpointPairCreatedEventArgs {
  @scala.inline
  def apply(endpointPair: XboxLiveEndpointPair): XboxLiveInboundEndpointPairCreatedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPair = endpointPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveInboundEndpointPairCreatedEventArgs]
  }
}

