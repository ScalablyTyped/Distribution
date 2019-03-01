package typings
package workerpoolLib.workerpoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolStats extends js.Object {
  var activeTasks: scala.Double
  var busyWorkers: scala.Double
  var idleWorkers: scala.Double
  var pendingTasks: scala.Double
  var totalWorkers: scala.Double
}

object WorkerPoolStats {
  @scala.inline
  def apply(
    activeTasks: scala.Double,
    busyWorkers: scala.Double,
    idleWorkers: scala.Double,
    pendingTasks: scala.Double,
    totalWorkers: scala.Double
  ): WorkerPoolStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeTasks")(activeTasks)
    __obj.updateDynamic("busyWorkers")(busyWorkers)
    __obj.updateDynamic("idleWorkers")(idleWorkers)
    __obj.updateDynamic("pendingTasks")(pendingTasks)
    __obj.updateDynamic("totalWorkers")(totalWorkers)
    __obj.asInstanceOf[WorkerPoolStats]
  }
}

