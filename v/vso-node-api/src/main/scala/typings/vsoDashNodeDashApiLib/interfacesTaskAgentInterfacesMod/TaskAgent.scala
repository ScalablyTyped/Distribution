package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

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
  var createdOn: stdLib.Date
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: scala.Double
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate
  var properties: js.Any
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: stdLib.Date
  var systemCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var userCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object TaskAgent {
  @scala.inline
  def apply(
    _links: js.Any,
    assignedRequest: TaskAgentJobRequest,
    authorization: TaskAgentAuthorization,
    createdOn: stdLib.Date,
    enabled: scala.Boolean,
    id: scala.Double,
    maxParallelism: scala.Double,
    name: java.lang.String,
    pendingUpdate: TaskAgentUpdate,
    properties: js.Any,
    status: TaskAgentStatus,
    statusChangedOn: stdLib.Date,
    systemCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    userCapabilities: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    version: java.lang.String
  ): TaskAgent = {
    val __obj = js.Dynamic.literal(_links = _links, assignedRequest = assignedRequest, authorization = authorization, createdOn = createdOn, enabled = enabled, id = id, maxParallelism = maxParallelism, name = name, pendingUpdate = pendingUpdate, properties = properties, status = status, statusChangedOn = statusChangedOn, systemCapabilities = systemCapabilities, userCapabilities = userCapabilities, version = version)
  
    __obj.asInstanceOf[TaskAgent]
  }
}

