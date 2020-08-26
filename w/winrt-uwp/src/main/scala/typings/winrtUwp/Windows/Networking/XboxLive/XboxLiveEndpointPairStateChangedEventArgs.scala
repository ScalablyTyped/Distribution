package typings.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveEndpointPairStateChangedEventArgs extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var newState: XboxLiveEndpointPairState = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var oldState: XboxLiveEndpointPairState = js.native
}

object XboxLiveEndpointPairStateChangedEventArgs {
  @scala.inline
  def apply(newState: XboxLiveEndpointPairState, oldState: XboxLiveEndpointPairState): XboxLiveEndpointPairStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveEndpointPairStateChangedEventArgs]
  }
  @scala.inline
  implicit class XboxLiveEndpointPairStateChangedEventArgsOps[Self <: XboxLiveEndpointPairStateChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setNewState(value: XboxLiveEndpointPairState): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldState(value: XboxLiveEndpointPairState): Self = this.set("oldState", value.asInstanceOf[js.Any])
  }
  
}

