package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Updates cost and usage information for a mobile broadband profile. */
@JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
@js.native
abstract class ProvisionedProfile () extends js.Object {
  /**
    * Called by the application to update the cost for a specific profile.
    * @param value Updates the cost for the profile.
    */
  def updateCost(value: NetworkCostType): Unit = js.native
  /**
    * Called by the application to update the usage for a specific profile.
    * @param value Updates the usage for a profile.
    */
  def updateUsage(value: ProfileUsage): Unit = js.native
}

