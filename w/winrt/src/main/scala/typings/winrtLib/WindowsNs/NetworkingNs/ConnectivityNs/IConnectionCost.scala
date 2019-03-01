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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approachingDataLimit")(approachingDataLimit)
    __obj.updateDynamic("networkCostType")(networkCostType)
    __obj.updateDynamic("overDataLimit")(overDataLimit)
    __obj.updateDynamic("roaming")(roaming)
    __obj.asInstanceOf[IConnectionCost]
  }
}

