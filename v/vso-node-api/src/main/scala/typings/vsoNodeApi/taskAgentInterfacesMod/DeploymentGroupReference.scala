package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentGroupReference]
  }
}

