package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentMachine extends StObject {
  
  var agent: TaskAgentReference
  
  var tags: js.Array[String]
}
object DeploymentMachine {
  
  inline def apply(agent: TaskAgentReference, tags: js.Array[String]): DeploymentMachine = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachine]
  }
  
  extension [Self <: DeploymentMachine](x: Self) {
    
    inline def setAgent(value: TaskAgentReference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
