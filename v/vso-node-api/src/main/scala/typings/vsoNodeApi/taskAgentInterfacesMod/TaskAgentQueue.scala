package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provisioned = provisioned.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgentQueue]
  }
}

