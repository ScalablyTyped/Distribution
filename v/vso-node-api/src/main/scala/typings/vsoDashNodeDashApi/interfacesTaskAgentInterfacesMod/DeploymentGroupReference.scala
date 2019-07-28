package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupReference extends js.Object {
  var id: Double
  var name: String
  var pool: TaskAgentPoolReference
  var project: ProjectReference
}

object DeploymentGroupReference {
  @scala.inline
  def apply(id: Double, name: String, pool: TaskAgentPoolReference, project: ProjectReference): DeploymentGroupReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, pool = pool, project = project)
  
    __obj.asInstanceOf[DeploymentGroupReference]
  }
}

