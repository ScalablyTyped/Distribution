package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectionCost extends StObject {
  
  var approachingDataLimit: Boolean
  
  var networkCostType: NetworkCostType
  
  var overDataLimit: Boolean
  
  var roaming: Boolean
}
object IConnectionCost {
  
  inline def apply(
    approachingDataLimit: Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: Boolean,
    roaming: Boolean
  ): IConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], overDataLimit = overDataLimit.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionCost]
  }
  
  extension [Self <: IConnectionCost](x: Self) {
    
    inline def setApproachingDataLimit(value: Boolean): Self = StObject.set(x, "approachingDataLimit", value.asInstanceOf[js.Any])
    
    inline def setNetworkCostType(value: NetworkCostType): Self = StObject.set(x, "networkCostType", value.asInstanceOf[js.Any])
    
    inline def setOverDataLimit(value: Boolean): Self = StObject.set(x, "overDataLimit", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Boolean): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
  }
}
