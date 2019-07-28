package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgent extends TaskAgentReference {
  /**
    * Gets the request which is currently assigned to this agent.
    */
  var assignedRequest: TaskAgentJobRequest
  /**
    * Gets or sets the authorization information for this agent.
    */
  var authorization: TaskAgentAuthorization
  /**
    * Gets the date on which this agent was created.
    */
  var createdOn: Date
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: Double
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate
  var properties: js.Any
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: Date
  var systemCapabilities: StringDictionary[String]
  var userCapabilities: StringDictionary[String]
}

object TaskAgent {
  @scala.inline
  def apply(
    _links: js.Any,
    assignedRequest: TaskAgentJobRequest,
    authorization: TaskAgentAuthorization,
    createdOn: Date,
    enabled: Boolean,
    id: Double,
    maxParallelism: Double,
    name: String,
    pendingUpdate: TaskAgentUpdate,
    properties: js.Any,
    status: TaskAgentStatus,
    statusChangedOn: Date,
    systemCapabilities: StringDictionary[String],
    userCapabilities: StringDictionary[String],
    version: String
  ): TaskAgent = {
    val __obj = js.Dynamic.literal(_links = _links, assignedRequest = assignedRequest, authorization = authorization, createdOn = createdOn, enabled = enabled, id = id, maxParallelism = maxParallelism, name = name, pendingUpdate = pendingUpdate, properties = properties, status = status, statusChangedOn = statusChangedOn, systemCapabilities = systemCapabilities, userCapabilities = userCapabilities, version = version)
  
    __obj.asInstanceOf[TaskAgent]
  }
}

