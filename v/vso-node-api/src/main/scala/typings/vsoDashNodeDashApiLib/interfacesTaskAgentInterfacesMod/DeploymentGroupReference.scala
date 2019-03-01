package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupReference extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var pool: TaskAgentPoolReference
  var project: ProjectReference
}

object DeploymentGroupReference {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, pool: TaskAgentPoolReference, project: ProjectReference): DeploymentGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[DeploymentGroupReference]
  }
}

