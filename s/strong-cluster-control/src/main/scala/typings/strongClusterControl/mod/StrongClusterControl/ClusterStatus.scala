package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterStatus extends js.Object {
  
  var master: ClusterMaster = js.native
  
  var workers: js.Array[ClusterWorker] = js.native
}
object ClusterStatus {
  
  @scala.inline
  def apply(master: ClusterMaster, workers: js.Array[ClusterWorker]): ClusterStatus = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatus]
  }
  
  @scala.inline
  implicit class ClusterStatusOps[Self <: ClusterStatus] (val x: Self) extends AnyVal {
    
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
    def setMaster(value: ClusterMaster): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkersVarargs(value: ClusterWorker*): Self = this.set("workers", js.Array(value :_*))
    
    @scala.inline
    def setWorkers(value: js.Array[ClusterWorker]): Self = this.set("workers", value.asInstanceOf[js.Any])
  }
}
