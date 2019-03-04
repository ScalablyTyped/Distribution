package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroup extends DeploymentGroupReference {
  var machineCount: scala.Double
  var machines: js.Array[DeploymentMachine]
}

object DeploymentGroup {
  @scala.inline
  def apply(
    id: scala.Double,
    machineCount: scala.Double,
    machines: js.Array[DeploymentMachine],
    name: java.lang.String,
    pool: TaskAgentPoolReference,
    project: ProjectReference
  ): DeploymentGroup = {
    val __obj = js.Dynamic.literal(id = id, machineCount = machineCount, machines = machines, name = name, pool = pool, project = project)
  
    __obj.asInstanceOf[DeploymentGroup]
  }
}

