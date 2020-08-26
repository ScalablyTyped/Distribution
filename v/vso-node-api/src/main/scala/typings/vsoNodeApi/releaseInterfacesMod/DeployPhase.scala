package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployPhase extends js.Object {
  var name: String = js.native
  var phaseType: DeployPhaseTypes = js.native
  var rank: Double = js.native
  var workflowTasks: js.Array[WorkflowTask] = js.native
}

object DeployPhase {
  @scala.inline
  def apply(name: String, phaseType: DeployPhaseTypes, rank: Double, workflowTasks: js.Array[WorkflowTask]): DeployPhase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployPhase]
  }
  @scala.inline
  implicit class DeployPhaseOps[Self <: DeployPhase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseType(value: DeployPhaseTypes): Self = this.set("phaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkflowTasksVarargs(value: WorkflowTask*): Self = this.set("workflowTasks", js.Array(value :_*))
    @scala.inline
    def setWorkflowTasks(value: js.Array[WorkflowTask]): Self = this.set("workflowTasks", value.asInstanceOf[js.Any])
  }
  
}

