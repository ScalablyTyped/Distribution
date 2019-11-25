package typings.winrt.Windows.Networking.Connectivity

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
    val __obj = js.Dynamic.literal(approachingDataLimit = approachingDataLimit.asInstanceOf[js.Any], networkCostType = networkCostType.asInstanceOf[js.Any], overDataLimit = overDataLimit.asInstanceOf[js.Any], roaming = roaming.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IConnectionCost]
  }
}

