package typings.twilioSync.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var arg: js.Any = js.native
  var context: js.Any = js.native
  var task: Task = js.native
  def handle(arg: js.Any): js.Any = js.native
  def reject(arg: js.Any): js.Any = js.native
  def resolve(arg: js.Any): js.Any = js.native
}

object Job {
  @scala.inline
  def apply(
    arg: js.Any,
    context: js.Any,
    handle: js.Any => js.Any,
    reject: js.Any => js.Any,
    resolve: js.Any => js.Any,
    task: Task
  ): Job = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], handle = js.Any.fromFunction1(handle), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve), task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: js.Any => js.Any): Self = this.set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def setReject(value: js.Any => js.Any): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: js.Any => js.Any): Self = this.set("resolve", js.Any.fromFunction1(value))
    @scala.inline
    def setTask(value: Task): Self = this.set("task", value.asInstanceOf[js.Any])
  }
  
}

