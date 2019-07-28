package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentQueue extends js.Object {
  var groupScopeId: String
  var id: Double
  var name: String
  var pool: TaskAgentPoolReference
  var projectId: String
  var provisioned: Boolean
}

object TaskAgentQueue {
  @scala.inline
  def apply(
    groupScopeId: String,
    id: Double,
    name: String,
    pool: TaskAgentPoolReference,
    projectId: String,
    provisioned: Boolean
  ): TaskAgentQueue = {
    val __obj = js.Dynamic.literal(groupScopeId = groupScopeId, id = id, name = name, pool = pool, projectId = projectId, provisioned = provisioned)
  
    __obj.asInstanceOf[TaskAgentQueue]
  }
}

