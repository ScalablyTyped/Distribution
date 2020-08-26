package typings.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveInboundEndpointPairCreatedEventArgs extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPair: XboxLiveEndpointPair = js.native
}

object XboxLiveInboundEndpointPairCreatedEventArgs {
  @scala.inline
  def apply(endpointPair: XboxLiveEndpointPair): XboxLiveInboundEndpointPairCreatedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPair = endpointPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveInboundEndpointPairCreatedEventArgs]
  }
  @scala.inline
  implicit class XboxLiveInboundEndpointPairCreatedEventArgsOps[Self <: XboxLiveInboundEndpointPairCreatedEventArgs] (val x: Self) extends AnyVal {
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
    def setEndpointPair(value: XboxLiveEndpointPair): Self = this.set("endpointPair", value.asInstanceOf[js.Any])
  }
  
}

