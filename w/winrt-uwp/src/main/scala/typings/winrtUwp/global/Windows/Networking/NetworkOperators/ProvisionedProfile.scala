package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType
import typings.winrtUwp.Windows.Networking.NetworkOperators.ProfileUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Updates cost and usage information for a mobile broadband profile. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
@js.native
abstract class ProvisionedProfile ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.ProvisionedProfile {
  /**
    * Called by the application to update the cost for a specific profile.
    * @param value Updates the cost for the profile.
    */
  /* CompleteClass */
  override def updateCost(value: NetworkCostType): Unit = js.native
  /**
    * Called by the application to update the usage for a specific profile.
    * @param value Updates the usage for a profile.
    */
  /* CompleteClass */
  override def updateUsage(value: ProfileUsage): Unit = js.native
}

