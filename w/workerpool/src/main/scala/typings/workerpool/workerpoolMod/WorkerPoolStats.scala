package typings.workerpool.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolStats extends js.Object {
  var activeTasks: Double
  var busyWorkers: Double
  var idleWorkers: Double
  var pendingTasks: Double
  var totalWorkers: Double
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
}

