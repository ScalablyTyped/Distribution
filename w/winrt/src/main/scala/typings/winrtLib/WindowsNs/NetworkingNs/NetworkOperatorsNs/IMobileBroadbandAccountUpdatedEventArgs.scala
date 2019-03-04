package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountUpdatedEventArgs extends js.Object {
  var hasDeviceInformationChanged: scala.Boolean
  var hasNetworkChanged: scala.Boolean
  var networkAccountId: java.lang.String
}

object IMobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(
    hasDeviceInformationChanged: scala.Boolean,
    hasNetworkChanged: scala.Boolean,
    networkAccountId: java.lang.String
  ): IMobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged, hasNetworkChanged = hasNetworkChanged, networkAccountId = networkAccountId)
  
    __obj.asInstanceOf[IMobileBroadbandAccountUpdatedEventArgs]
  }
}

