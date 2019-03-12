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
    updateCost: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType => scala.Unit,
    updateUsage: ProfileUsage => scala.Unit
  ): IProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
  
    __obj.asInstanceOf[IProvisionedProfile]
  }
}

