package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Updates cost and usage information for a mobile broadband profile. */
@js.native
trait ProvisionedProfile extends js.Object {
  
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
object ProvisionedProfile {
  
  @scala.inline
  def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): ProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
    __obj.asInstanceOf[ProvisionedProfile]
  }
  
  @scala.inline
  implicit class ProvisionedProfileOps[Self <: ProvisionedProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUpdateCost(value: NetworkCostType => Unit): Self = this.set("updateCost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUsage(value: ProfileUsage => Unit): Self = this.set("updateUsage", js.Any.fromFunction1(value))
  }
}
