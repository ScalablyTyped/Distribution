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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("machineCount")(machineCount)
    __obj.updateDynamic("machines")(machines)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[DeploymentGroup]
  }
}

