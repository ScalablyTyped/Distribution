package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployPhase extends js.Object {
  var name: String
  var phaseType: DeployPhaseTypes
  var rank: Double
  var workflowTasks: js.Array[WorkflowTask]
}

object DeployPhase {
  @scala.inline
  def apply(name: String, phaseType: DeployPhaseTypes, rank: Double, workflowTasks: js.Array[WorkflowTask]): DeployPhase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeployPhase]
  }
}

