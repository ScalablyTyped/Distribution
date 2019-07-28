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
    val __obj = js.Dynamic.literal(activeTasks = activeTasks, busyWorkers = busyWorkers, idleWorkers = idleWorkers, pendingTasks = pendingTasks, totalWorkers = totalWorkers)
  
    __obj.asInstanceOf[WorkerPoolStats]
  }
}

