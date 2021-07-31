package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskLogReference extends StObject {
  
  var id: Double
  
  var location: String
}
object TaskLogReference {
  
  @scala.inline
  def apply(id: Double, location: String): TaskLogReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLogReference]
  }
  
  @scala.inline
  implicit class TaskLogReferenceMutableBuilder[Self <: TaskLogReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
