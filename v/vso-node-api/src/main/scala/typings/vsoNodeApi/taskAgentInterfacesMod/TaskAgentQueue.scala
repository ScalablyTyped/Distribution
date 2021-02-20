package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentQueue extends StObject {
  
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
  implicit class TaskAgentQueueMutableBuilder[Self <: TaskAgentQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupScopeId(value: String): Self = StObject.set(x, "groupScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioned(value: Boolean): Self = StObject.set(x, "provisioned", value.asInstanceOf[js.Any])
  }
}
