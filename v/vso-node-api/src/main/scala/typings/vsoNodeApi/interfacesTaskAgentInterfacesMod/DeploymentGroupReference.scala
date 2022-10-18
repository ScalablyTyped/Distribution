package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupReference extends StObject {
  
  var id: Double
  
  var name: String
  
  var pool: TaskAgentPoolReference
  
  var project: ProjectReference
}
object DeploymentGroupReference {
  
  inline def apply(id: Double, name: String, pool: TaskAgentPoolReference, project: ProjectReference): DeploymentGroupReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupReference]
  }
  
  extension [Self <: DeploymentGroupReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
