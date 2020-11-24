package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentReference extends js.Object {
  
  var _links: js.Any = js.native
  
  /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
  var enabled: Boolean = js.native
  
  /**
    * Gets the identifier of the agent.
    */
  var id: Double = js.native
  
  /**
    * Gets the name of the agent.
    */
  var name: String = js.native
  
  /**
    * Gets the current connectivity status of the agent.
    */
  var status: TaskAgentStatus = js.native
  
  /**
    * Gets the version of the agent.
    */
  var version: String = js.native
}
object TaskAgentReference {
  
  @scala.inline
  def apply(
    _links: js.Any,
    enabled: Boolean,
    id: Double,
    name: String,
    status: TaskAgentStatus,
    version: String
  ): TaskAgentReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentReference]
  }
  
  @scala.inline
  implicit class TaskAgentReferenceOps[Self <: TaskAgentReference] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskAgentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
