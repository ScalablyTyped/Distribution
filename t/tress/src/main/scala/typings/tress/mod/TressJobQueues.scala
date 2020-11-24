package typings.tress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TressJobQueues extends js.Object {
  
  var failed: js.Array[TressJobData] = js.native
  
  var finished: js.Array[TressJobData] = js.native
  
  var waiting: js.Array[TressJobData] = js.native
}
object TressJobQueues {
  
  @scala.inline
  def apply(failed: js.Array[TressJobData], finished: js.Array[TressJobData], waiting: js.Array[TressJobData]): TressJobQueues = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TressJobQueues]
  }
  
  @scala.inline
  implicit class TressJobQueuesOps[Self <: TressJobQueues] (val x: Self) extends AnyVal {
    
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
    def setFailedVarargs(value: TressJobData*): Self = this.set("failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: js.Array[TressJobData]): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedVarargs(value: TressJobData*): Self = this.set("finished", js.Array(value :_*))
    
    @scala.inline
    def setFinished(value: js.Array[TressJobData]): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingVarargs(value: TressJobData*): Self = this.set("waiting", js.Array(value :_*))
    
    @scala.inline
    def setWaiting(value: js.Array[TressJobData]): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
