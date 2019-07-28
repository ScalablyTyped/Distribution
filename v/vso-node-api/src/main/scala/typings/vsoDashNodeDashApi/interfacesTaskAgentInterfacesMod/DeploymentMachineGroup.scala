package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id, machines = machines, name = name, pool = pool, project = project, size = size)
  
    __obj.asInstanceOf[DeploymentMachineGroup]
  }
}

