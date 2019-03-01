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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("assignedRequest")(assignedRequest)
    __obj.updateDynamic("authorization")(authorization)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("maxParallelism")(maxParallelism)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pendingUpdate")(pendingUpdate)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusChangedOn")(statusChangedOn)
    __obj.updateDynamic("systemCapabilities")(systemCapabilities)
    __obj.updateDynamic("userCapabilities")(userCapabilities)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskAgent]
  }
}

