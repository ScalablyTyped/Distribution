package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachineGroup extends DeploymentMachineGroupReference {
  var machines: js.Array[DeploymentMachine]
  var size: scala.Double
}

object DeploymentMachineGroup {
  @scala.inline
  def apply(
    id: scala.Double,
    machines: js.Array[DeploymentMachine],
    name: java.lang.String,
    pool: TaskAgentPoolReference,
    project: ProjectReference,
    size: scala.Double
  ): DeploymentMachineGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("machines")(machines)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[DeploymentMachineGroup]
  }
}

