package typings.twilioSync.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutor extends js.Object {
  def add(task: Task, context: js.Any, arg: js.Any, errorHandler: js.Any): js.Any = js.native
}

object JobExecutor {
  @scala.inline
  def apply(add: (Task, js.Any, js.Any, js.Any) => js.Any): JobExecutor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add))
    __obj.asInstanceOf[JobExecutor]
  }
  @scala.inline
  implicit class JobExecutorOps[Self <: JobExecutor] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Task, js.Any, js.Any, js.Any) => js.Any): Self = this.set("add", js.Any.fromFunction4(value))
  }
  
}

