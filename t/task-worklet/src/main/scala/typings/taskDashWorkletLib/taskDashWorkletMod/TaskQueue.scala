package typings
package taskDashWorkletLib.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  def addModule(moduleURL: java.lang.String): js.Promise[scala.Unit]
  def postTask(taskName: java.lang.String, args: js.Any*): taskDashWorkletLib.taskDashWorkletMod.TaskQueueNs.Task[_]
}

object TaskQueue {
  @scala.inline
  def apply(
    addModule: java.lang.String => js.Promise[scala.Unit],
    postTask: (java.lang.String, /* repeated */ js.Any) => taskDashWorkletLib.taskDashWorkletMod.TaskQueueNs.Task[_]
  ): TaskQueue = {
    val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
  
    __obj.asInstanceOf[TaskQueue]
  }
}

