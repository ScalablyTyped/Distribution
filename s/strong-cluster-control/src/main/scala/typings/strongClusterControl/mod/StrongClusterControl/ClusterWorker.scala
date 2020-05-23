package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterWorker extends ClusterMaster {
  var id: Double
}

object ClusterWorker {
  @scala.inline
  def apply(id: Double, pid: Double, startTime: Double, setSize: js.UndefOr[Double] = js.undefined): ClusterWorker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(setSize)) __obj.updateDynamic("setSize")(setSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterWorker]
  }
}

