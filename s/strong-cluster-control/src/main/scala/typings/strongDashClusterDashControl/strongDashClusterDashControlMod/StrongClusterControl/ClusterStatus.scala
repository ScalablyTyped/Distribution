package typings.strongDashClusterDashControl.strongDashClusterDashControlMod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStatus extends js.Object {
  var master: ClusterMaster
  var workers: js.Array[ClusterWorker]
}

object ClusterStatus {
  @scala.inline
  def apply(master: ClusterMaster, workers: js.Array[ClusterWorker]): ClusterStatus = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterStatus]
  }
}

