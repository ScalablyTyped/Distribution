package typings.workerpool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPoolStats extends js.Object {
  var activeTasks: Double = js.native
  var busyWorkers: Double = js.native
  var idleWorkers: Double = js.native
  var pendingTasks: Double = js.native
  var totalWorkers: Double = js.native
}

object WorkerPoolStats {
  @scala.inline
  def apply(
    activeTasks: Double,
    busyWorkers: Double,
    idleWorkers: Double,
    pendingTasks: Double,
    totalWorkers: Double
  ): WorkerPoolStats = {
    val __obj = js.Dynamic.literal(activeTasks = activeTasks.asInstanceOf[js.Any], busyWorkers = busyWorkers.asInstanceOf[js.Any], idleWorkers = idleWorkers.asInstanceOf[js.Any], pendingTasks = pendingTasks.asInstanceOf[js.Any], totalWorkers = totalWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolStats]
  }
  @scala.inline
  implicit class WorkerPoolStatsOps[Self <: WorkerPoolStats] (val x: Self) extends AnyVal {
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
    def setActiveTasks(value: Double): Self = this.set("activeTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusyWorkers(value: Double): Self = this.set("busyWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdleWorkers(value: Double): Self = this.set("idleWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingTasks(value: Double): Self = this.set("pendingTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalWorkers(value: Double): Self = this.set("totalWorkers", value.asInstanceOf[js.Any])
  }
  
}

