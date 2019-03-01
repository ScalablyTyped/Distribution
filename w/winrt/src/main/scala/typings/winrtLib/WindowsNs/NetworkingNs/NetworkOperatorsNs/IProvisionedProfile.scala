package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisionedProfile extends js.Object {
  def updateCost(value: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType): scala.Unit
  def updateUsage(value: ProfileUsage): scala.Unit
}

object IProvisionedProfile {
  @scala.inline
  def apply(
    updateCost: js.Function1[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType, scala.Unit],
    updateUsage: js.Function1[ProfileUsage, scala.Unit]
  ): IProvisionedProfile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("updateCost")(updateCost)
    __obj.updateDynamic("updateUsage")(updateUsage)
    __obj.asInstanceOf[IProvisionedProfile]
  }
}

