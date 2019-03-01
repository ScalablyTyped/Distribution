package typings
package taskDashWorkletLib.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  def addModule(moduleURL: java.lang.String): js.Promise[scala.Unit]
  def postTask(taskName: java.lang.String, args: js.Any*): Task[_]
}

object TaskQueue {
  @scala.inline
  def apply(
    addModule: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    postTask: js.Function2[java.lang.String, /* repeated */ js.Any, Task[_]]
  ): TaskQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addModule")(addModule)
    __obj.updateDynamic("postTask")(postTask)
    __obj.asInstanceOf[TaskQueue]
  }
}

