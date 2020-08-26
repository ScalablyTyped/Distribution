package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandAccountUpdatedEventArgs extends js.Object {
  var hasDeviceInformationChanged: Boolean = js.native
  var hasNetworkChanged: Boolean = js.native
  var networkAccountId: String = js.native
}

object IMobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): IMobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccountUpdatedEventArgs]
  }
  @scala.inline
  implicit class IMobileBroadbandAccountUpdatedEventArgsOps[Self <: IMobileBroadbandAccountUpdatedEventArgs] (val x: Self) extends AnyVal {
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
    def setHasDeviceInformationChanged(value: Boolean): Self = this.set("hasDeviceInformationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasNetworkChanged(value: Boolean): Self = this.set("hasNetworkChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
  }
  
}

