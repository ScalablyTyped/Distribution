package typings.taskWorklet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskQueue extends js.Object {
  def addModule(moduleURL: String): js.Promise[Unit] = js.native
  def postTask(taskName: String, args: js.Any*): Task[_] = js.native
}

object TaskQueue {
  @scala.inline
  def apply(addModule: String => js.Promise[Unit], postTask: (String, /* repeated */ js.Any) => Task[_]): TaskQueue = {
    val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
    __obj.asInstanceOf[TaskQueue]
  }
  @scala.inline
  implicit class TaskQueueOps[Self <: TaskQueue] (val x: Self) extends AnyVal {
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
    def setAddModule(value: String => js.Promise[Unit]): Self = this.set("addModule", js.Any.fromFunction1(value))
    @scala.inline
    def setPostTask(value: (String, /* repeated */ js.Any) => Task[_]): Self = this.set("postTask", js.Any.fromFunction2(value))
  }
  
}

