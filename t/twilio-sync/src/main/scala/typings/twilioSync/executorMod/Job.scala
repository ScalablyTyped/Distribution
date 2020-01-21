package typings.twilioSync.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var arg: js.Any
  var context: js.Any
  var task: Task
  def handle(arg: js.Any): js.Any
  def reject(arg: js.Any): js.Any
  def resolve(arg: js.Any): js.Any
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
}

