package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachineGroupReference extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var pool: TaskAgentPoolReference
  var project: ProjectReference
}

object DeploymentMachineGroupReference {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, pool: TaskAgentPoolReference, project: ProjectReference): DeploymentMachineGroupReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, pool = pool, project = project)
  
    __obj.asInstanceOf[DeploymentMachineGroupReference]
  }
}

