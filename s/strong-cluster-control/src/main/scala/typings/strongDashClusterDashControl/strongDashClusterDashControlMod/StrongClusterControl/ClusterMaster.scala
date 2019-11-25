package typings.strongDashClusterDashControl.strongDashClusterDashControlMod.StrongClusterControl

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
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMaster]
  }
}

