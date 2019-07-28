package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvisionedProfile extends js.Object {
  def updateCost(value: NetworkCostType): Unit
  def updateUsage(value: ProfileUsage): Unit
}

object IProvisionedProfile {
  @scala.inline
  def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): IProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
  
    __obj.asInstanceOf[IProvisionedProfile]
  }
}

