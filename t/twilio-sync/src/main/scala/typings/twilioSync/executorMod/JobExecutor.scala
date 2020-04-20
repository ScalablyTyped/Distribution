package typings.twilioSync.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutor extends js.Object {
  def add(task: Task, context: js.Any, arg: js.Any, errorHandler: js.Any): js.Any
}

object JobExecutor {
  @scala.inline
  def apply(add: (Task, js.Any, js.Any, js.Any) => js.Any): JobExecutor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add))
    __obj.asInstanceOf[JobExecutor]
  }
}

