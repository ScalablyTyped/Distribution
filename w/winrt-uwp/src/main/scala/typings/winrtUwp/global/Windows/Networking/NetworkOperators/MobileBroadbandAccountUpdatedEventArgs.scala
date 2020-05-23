package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the AccountUpdated event. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
@js.native
abstract class MobileBroadbandAccountUpdatedEventArgs ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs {
  /** Gets a value indicating whether the device information has changed for the account. */
  /* CompleteClass */
  override var hasDeviceInformationChanged: Boolean = js.native
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  /* CompleteClass */
  override var hasNetworkChanged: Boolean = js.native
  /** Gets the network account Id of the updated account. */
  /* CompleteClass */
  override var networkAccountId: String = js.native
}

