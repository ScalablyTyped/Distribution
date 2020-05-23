package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMaster extends js.Object {
  var pid: Double
  var setSize: js.UndefOr[Double] = js.undefined
  var startTime: Double
}

object ClusterMaster {
  @scala.inline
  def apply(pid: Double, startTime: Double, setSize: js.UndefOr[Double] = js.undefined): ClusterMaster = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(setSize)) __obj.updateDynamic("setSize")(setSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMaster]
  }
}

