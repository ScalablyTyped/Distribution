package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentReference extends StObject {
  
  var _links: Any
  
  /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
  var enabled: Boolean
  
  /**
    * Gets the identifier of the agent.
    */
  var id: Double
  
  /**
    * Gets the name of the agent.
    */
  var name: String
  
  /**
    * Gets the current connectivity status of the agent.
    */
  var status: TaskAgentStatus
  
  /**
    * Gets the version of the agent.
    */
  var version: String
}
object TaskAgentReference {
  
  inline def apply(_links: Any, enabled: Boolean, id: Double, name: String, status: TaskAgentStatus, version: String): TaskAgentReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentReference]
  }
  
  extension [Self <: TaskAgentReference](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TaskAgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
