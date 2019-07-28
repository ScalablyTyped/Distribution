package typings.strongDashClusterDashControl.strongDashClusterDashControlMod.StrongClusterControlNs

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
  def apply(pid: Double, startTime: Double, setSize: Int | Double = null): ClusterMaster = {
    val __obj = js.Dynamic.literal(pid = pid, startTime = startTime)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMaster]
  }
}

