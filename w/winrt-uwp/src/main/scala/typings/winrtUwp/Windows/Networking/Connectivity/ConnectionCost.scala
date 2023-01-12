package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to property values that indicate the current cost of a network connection. */
trait ConnectionCost extends StObject {
  
  /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
  var approachingDataLimit: Boolean
  
  /** Gets a value that indicates whether background data usage has been restricted. */
  var backgroundDataUsageRestricted: Boolean
  
  /** Gets a value that indicates the current network cost for a connection. */
  var networkCostType: NetworkCostType
  
  /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
  var overDataLimit: Boolean
  
  /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
  var roaming: Boolean
}
object ConnectionCost {
  
  inline def apply(
    approachingDataLimit: Boolean,
    backgroundDataUsageRestricted: Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: Boolean,
    roaming: Boolean
  ): ConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit.asInstanceOf[js.Any], backgroundDataUsageRestricted = backgroundDataUsageRestricted.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], overDataLimit = overDataLimit.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionCost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionCost] (val x: Self) extends AnyVal {
    
    inline def setApproachingDataLimit(value: Boolean): Self = StObject.set(x, "approachingDataLimit", value.asInstanceOf[js.Any])
    
    inline def setBackgroundDataUsageRestricted(value: Boolean): Self = StObject.set(x, "backgroundDataUsageRestricted", value.asInstanceOf[js.Any])
    
    inline def setNetworkCostType(value: NetworkCostType): Self = StObject.set(x, "networkCostType", value.asInstanceOf[js.Any])
    
    inline def setOverDataLimit(value: Boolean): Self = StObject.set(x, "overDataLimit", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Boolean): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
  }
}
