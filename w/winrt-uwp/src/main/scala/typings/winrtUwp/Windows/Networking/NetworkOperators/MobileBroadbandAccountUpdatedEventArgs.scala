package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountUpdated event. */
trait MobileBroadbandAccountUpdatedEventArgs extends js.Object {
  /** Gets a value indicating whether the device information has changed for the account. */
  var hasDeviceInformationChanged: Boolean
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  var hasNetworkChanged: Boolean
  /** Gets the network account Id of the updated account. */
  var networkAccountId: String
}

object MobileBroadbandAccountUpdatedEventArgs {
  @scala.inline
  def apply(hasDeviceInformationChanged: Boolean, hasNetworkChanged: Boolean, networkAccountId: String): MobileBroadbandAccountUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(hasDeviceInformationChanged = hasDeviceInformationChanged.asInstanceOf[js.Any], hasNetworkChanged = hasNetworkChanged.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccountUpdatedEventArgs]
  }
}

