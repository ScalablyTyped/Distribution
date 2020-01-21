package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachineGroup extends DeploymentMachineGroupReference {
  var machines: js.Array[DeploymentMachine]
  var size: Double
}

object DeploymentMachineGroup {
  @scala.inline
  def apply(
    id: Double,
    machines: js.Array[DeploymentMachine],
    name: String,
    pool: TaskAgentPoolReference,
    project: ProjectReference,
    size: Double
  ): DeploymentMachineGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentMachineGroup]
  }
}

