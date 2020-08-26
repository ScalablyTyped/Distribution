package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentQueue extends js.Object {
  var groupScopeId: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var pool: TaskAgentPoolReference = js.native
  var projectId: String = js.native
  var provisioned: Boolean = js.native
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
  @scala.inline
  implicit class TaskAgentQueueOps[Self <: TaskAgentQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupScopeId(value: String): Self = this.set("groupScopeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisioned(value: Boolean): Self = this.set("provisioned", value.asInstanceOf[js.Any])
  }
  
}

