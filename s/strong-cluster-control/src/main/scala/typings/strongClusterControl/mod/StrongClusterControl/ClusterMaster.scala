package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMaster extends js.Object {
  var pid: Double = js.native
  var setSize: js.UndefOr[Double] = js.native
  var startTime: Double = js.native
}

object ClusterMaster {
  @scala.inline
  def apply(pid: Double, startTime: Double): ClusterMaster = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMaster]
  }
  @scala.inline
  implicit class ClusterMasterOps[Self <: ClusterMaster] (val x: Self) extends AnyVal {
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
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSize(value: Double): Self = this.set("setSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
  }
  
}

