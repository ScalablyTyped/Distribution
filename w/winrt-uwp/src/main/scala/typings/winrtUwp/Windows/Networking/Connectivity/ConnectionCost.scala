package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to property values that indicate the current cost of a network connection. */
@js.native
trait ConnectionCost extends js.Object {
  
  /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
  var approachingDataLimit: Boolean = js.native
  
  /** Gets a value that indicates whether background data usage has been restricted. */
  var backgroundDataUsageRestricted: Boolean = js.native
  
  /** Gets a value that indicates the current network cost for a connection. */
  var networkCostType: NetworkCostType = js.native
  
  /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
  var overDataLimit: Boolean = js.native
  
  /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
  var roaming: Boolean = js.native
}
object ConnectionCost {
  
  @scala.inline
  def apply(
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
  implicit class ConnectionCostOps[Self <: ConnectionCost] (val x: Self) extends AnyVal {
    
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
    def setApproachingDataLimit(value: Boolean): Self = this.set("approachingDataLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundDataUsageRestricted(value: Boolean): Self = this.set("backgroundDataUsageRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCostType(value: NetworkCostType): Self = this.set("networkCostType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverDataLimit(value: Boolean): Self = this.set("overDataLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoaming(value: Boolean): Self = this.set("roaming", value.asInstanceOf[js.Any])
  }
}
