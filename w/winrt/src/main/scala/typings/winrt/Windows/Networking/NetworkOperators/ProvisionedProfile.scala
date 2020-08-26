package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProfile extends IProvisionedProfile

object ProvisionedProfile {
  @scala.inline
  def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): ProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
    __obj.asInstanceOf[ProvisionedProfile]
  }
}

