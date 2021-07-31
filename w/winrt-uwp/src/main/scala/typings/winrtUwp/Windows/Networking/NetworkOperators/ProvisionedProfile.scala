package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Updates cost and usage information for a mobile broadband profile. */
trait ProvisionedProfile extends StObject {
  
  /**
    * Called by the application to update the cost for a specific profile.
    * @param value Updates the cost for the profile.
    */
  def updateCost(value: NetworkCostType): Unit
  
  /**
    * Called by the application to update the usage for a specific profile.
    * @param value Updates the usage for a profile.
    */
  def updateUsage(value: ProfileUsage): Unit
}
object ProvisionedProfile {
  
  @scala.inline
  def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): ProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
    __obj.asInstanceOf[ProvisionedProfile]
  }
  
  @scala.inline
  implicit class ProvisionedProfileMutableBuilder[Self <: ProvisionedProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateCost(value: NetworkCostType => Unit): Self = StObject.set(x, "updateCost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUsage(value: ProfileUsage => Unit): Self = StObject.set(x, "updateUsage", js.Any.fromFunction1(value))
  }
}
