package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionCost extends js.Object {
  var approachingDataLimit: scala.Boolean
  var networkCostType: NetworkCostType
  var overDataLimit: scala.Boolean
  var roaming: scala.Boolean
}

object IConnectionCost {
  @scala.inline
  def apply(
    approachingDataLimit: scala.Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: scala.Boolean,
    roaming: scala.Boolean
  ): IConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit, networkCostType = networkCostType, overDataLimit = overDataLimit, roaming = roaming)
  
    __obj.asInstanceOf[IConnectionCost]
  }
}

