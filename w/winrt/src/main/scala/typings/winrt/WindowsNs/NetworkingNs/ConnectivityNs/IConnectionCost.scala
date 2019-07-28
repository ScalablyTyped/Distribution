package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionCost extends js.Object {
  var approachingDataLimit: Boolean
  var networkCostType: NetworkCostType
  var overDataLimit: Boolean
  var roaming: Boolean
}

object IConnectionCost {
  @scala.inline
  def apply(
    approachingDataLimit: Boolean,
    networkCostType: NetworkCostType,
    overDataLimit: Boolean,
    roaming: Boolean
  ): IConnectionCost = {
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit, networkCostType = networkCostType, overDataLimit = overDataLimit, roaming = roaming)
  
    __obj.asInstanceOf[IConnectionCost]
  }
}

