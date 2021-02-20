package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationOwner extends StObject {
  
  var _links: js.Any = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
}
object TaskOrchestrationOwner {
  
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String): TaskOrchestrationOwner = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationOwner]
  }
  
  @scala.inline
  implicit class TaskOrchestrationOwnerMutableBuilder[Self <: TaskOrchestrationOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
