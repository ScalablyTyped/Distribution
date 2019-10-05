package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
@js.native
class ProvisionedProfile () extends IProvisionedProfile {
  /* CompleteClass */
  override def updateCost(value: NetworkCostType): Unit = js.native
  /* CompleteClass */
  override def updateUsage(value: ProfileUsage): Unit = js.native
}

