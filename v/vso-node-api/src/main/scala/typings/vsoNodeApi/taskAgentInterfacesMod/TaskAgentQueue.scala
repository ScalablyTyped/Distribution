package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentQueue extends StObject {
  
  var groupScopeId: String
  
  var id: Double
  
  var name: String
  
  var pool: TaskAgentPoolReference
  
  var projectId: String
  
  var provisioned: Boolean
}
object TaskAgentQueue {
  
  inline def apply(
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
  
  extension [Self <: TaskAgentQueue](x: Self) {
    
    inline def setGroupScopeId(value: String): Self = StObject.set(x, "groupScopeId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProvisioned(value: Boolean): Self = StObject.set(x, "provisioned", value.asInstanceOf[js.Any])
  }
}
