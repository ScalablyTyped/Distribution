package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountUpdatedEventArgs extends js.Object {
  var hasDeviceInformationChanged: Boolean
  var hasNetworkChanged: Boolean
  var networkAccountId: String
}

object IMobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): IMobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged, hasNetworkChanged = hasNetworkChanged, networkAccountId = networkAccountId)
  
    __obj.asInstanceOf[IMobileBroadbandAccountUpdatedEventArgs]
  }
}

