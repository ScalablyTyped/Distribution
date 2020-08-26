package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionGate extends js.Object {
  var tasks: js.Array[WorkflowTask] = js.native
}

object ReleaseDefinitionGate {
  @scala.inline
  def apply(tasks: js.Array[WorkflowTask]): ReleaseDefinitionGate = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGate]
  }
  @scala.inline
  implicit class ReleaseDefinitionGateOps[Self <: ReleaseDefinitionGate] (val x: Self) extends AnyVal {
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
    def setTasksVarargs(value: WorkflowTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[WorkflowTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
  
}

