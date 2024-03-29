package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkCostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProvisionedProfile extends StObject {
  
  def updateCost(value: NetworkCostType): Unit
  
  def updateUsage(value: ProfileUsage): Unit
}
object IProvisionedProfile {
  
  inline def apply(updateCost: NetworkCostType => Unit, updateUsage: ProfileUsage => Unit): IProvisionedProfile = {
    val __obj = js.Dynamic.literal(updateCost = js.Any.fromFunction1(updateCost), updateUsage = js.Any.fromFunction1(updateUsage))
    __obj.asInstanceOf[IProvisionedProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProvisionedProfile] (val x: Self) extends AnyVal {
    
    inline def setUpdateCost(value: NetworkCostType => Unit): Self = StObject.set(x, "updateCost", js.Any.fromFunction1(value))
    
    inline def setUpdateUsage(value: ProfileUsage => Unit): Self = StObject.set(x, "updateUsage", js.Any.fromFunction1(value))
  }
}
