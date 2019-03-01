package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentQueue extends js.Object {
  var groupScopeId: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var pool: TaskAgentPoolReference
  var projectId: java.lang.String
  var provisioned: scala.Boolean
}

object TaskAgentQueue {
  @scala.inline
  def apply(
    groupScopeId: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    pool: TaskAgentPoolReference,
    projectId: java.lang.String,
    provisioned: scala.Boolean
  ): TaskAgentQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupScopeId")(groupScopeId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("provisioned")(provisioned)
    __obj.asInstanceOf[TaskAgentQueue]
  }
}

