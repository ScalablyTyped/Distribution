package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileBroadbandAccountUpdatedEventArgs extends IMobileBroadbandAccountUpdatedEventArgs

object MobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): MobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountUpdatedEventArgs]
  }
}

