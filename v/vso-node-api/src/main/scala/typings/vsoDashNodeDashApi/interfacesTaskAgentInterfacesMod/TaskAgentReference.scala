package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentReference extends js.Object {
  var _links: js.Any
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
}

