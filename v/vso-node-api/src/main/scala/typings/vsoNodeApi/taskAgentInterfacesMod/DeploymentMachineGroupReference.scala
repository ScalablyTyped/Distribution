package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentMachineGroupReference extends StObject {
  
  var id: Double
  
  var name: String
  
  var pool: TaskAgentPoolReference
  
  var project: ProjectReference
}
object DeploymentMachineGroupReference {
  
  @scala.inline
  def apply(id: Double, name: String, pool: TaskAgentPoolReference, project: ProjectReference): DeploymentMachineGroupReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachineGroupReference]
  }
  
  @scala.inline
  implicit class DeploymentMachineGroupReferenceMutableBuilder[Self <: DeploymentMachineGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
