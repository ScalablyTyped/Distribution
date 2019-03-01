package typings
package strongDashClusterDashControlLib.strongDashClusterDashControlMod.StrongClusterControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMaster extends js.Object {
  var pid: scala.Double
  var setSize: js.UndefOr[scala.Double] = js.undefined
  var startTime: scala.Double
}

object ClusterMaster {
  @scala.inline
  def apply(pid: scala.Double, startTime: scala.Double, setSize: scala.Int | scala.Double = null): ClusterMaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("startTime")(startTime)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMaster]
  }
}

