package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentMachine extends StObject {
  
  var agent: TaskAgentReference = js.native
  
  var tags: js.Array[String] = js.native
}
object DeploymentMachine {
  
  @scala.inline
  def apply(agent: TaskAgentReference, tags: js.Array[String]): DeploymentMachine = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachine]
  }
  
  @scala.inline
  implicit class DeploymentMachineMutableBuilder[Self <: DeploymentMachine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: TaskAgentReference): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
