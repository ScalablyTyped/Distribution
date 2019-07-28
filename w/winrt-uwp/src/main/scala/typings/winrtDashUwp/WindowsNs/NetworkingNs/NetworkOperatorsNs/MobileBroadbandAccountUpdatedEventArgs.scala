package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountUpdated event. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
@js.native
abstract class MobileBroadbandAccountUpdatedEventArgs () extends js.Object {
  /** Gets a value indicating whether the device information has changed for the account. */
  var hasDeviceInformationChanged: Boolean = js.native
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  var hasNetworkChanged: Boolean = js.native
  /** Gets the network account Id of the updated account. */
  var networkAccountId: String = js.native
}

