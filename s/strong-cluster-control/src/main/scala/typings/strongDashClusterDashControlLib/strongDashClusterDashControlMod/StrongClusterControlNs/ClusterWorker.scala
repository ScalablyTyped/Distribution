package typings
package strongDashClusterDashControlLib.strongDashClusterDashControlMod.StrongClusterControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterWorker extends ClusterMaster {
  var id: scala.Double
}

object ClusterWorker {
  @scala.inline
  def apply(
    id: scala.Double,
    pid: scala.Double,
    startTime: scala.Double,
    setSize: scala.Int | scala.Double = null
  ): ClusterWorker = {
    val __obj = js.Dynamic.literal(id = id, pid = pid, startTime = startTime)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterWorker]
  }
}

