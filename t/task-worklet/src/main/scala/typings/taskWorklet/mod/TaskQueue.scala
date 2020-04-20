package typings.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  def addModule(moduleURL: String): js.Promise[Unit]
  def postTask(taskName: String, args: js.Any*): Task[_]
}

object TaskQueue {
  @scala.inline
  def apply(addModule: String => js.Promise[Unit], postTask: (String, /* repeated */ js.Any) => Task[_]): TaskQueue = {
    val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
    __obj.asInstanceOf[TaskQueue]
  }
}

