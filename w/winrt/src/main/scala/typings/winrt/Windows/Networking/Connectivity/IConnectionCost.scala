package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionCost extends js.Object {
  var approachingDataLimit: Boolean = js.native
  var networkCostType: NetworkCostType = js.native
  var overDataLimit: Boolean = js.native
  var roaming: Boolean = js.native
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
  @scala.inline
  implicit class IConnectionCostOps[Self <: IConnectionCost] (val x: Self) extends AnyVal {
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
    def setNetworkCostType(value: NetworkCostType): Self = this.set("networkCostType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverDataLimit(value: Boolean): Self = this.set("overDataLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoaming(value: Boolean): Self = this.set("roaming", value.asInstanceOf[js.Any])
  }
  
}

