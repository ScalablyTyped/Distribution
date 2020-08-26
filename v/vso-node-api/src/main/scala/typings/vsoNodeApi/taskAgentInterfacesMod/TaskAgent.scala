package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgent extends TaskAgentReference {
  /**
    * Gets the request which is currently assigned to this agent.
    */
  var assignedRequest: TaskAgentJobRequest = js.native
  /**
    * Gets or sets the authorization information for this agent.
    */
  var authorization: TaskAgentAuthorization = js.native
  /**
    * Gets the date on which this agent was created.
    */
  var createdOn: Date = js.native
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: Double = js.native
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate = js.native
  var properties: js.Any = js.native
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: Date = js.native
  var systemCapabilities: StringDictionary[String] = js.native
  var userCapabilities: StringDictionary[String] = js.native
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignedRequest = assignedRequest.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxParallelism = maxParallelism.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pendingUpdate = pendingUpdate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedOn = statusChangedOn.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any], userCapabilities = userCapabilities.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgent]
  }
  @scala.inline
  implicit class TaskAgentOps[Self <: TaskAgent] (val x: Self) extends AnyVal {
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
    def setAssignedRequest(value: TaskAgentJobRequest): Self = this.set("assignedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorization(value: TaskAgentAuthorization): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxParallelism(value: Double): Self = this.set("maxParallelism", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingUpdate(value: TaskAgentUpdate): Self = this.set("pendingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusChangedOn(value: Date): Self = this.set("statusChangedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemCapabilities(value: StringDictionary[String]): Self = this.set("systemCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserCapabilities(value: StringDictionary[String]): Self = this.set("userCapabilities", value.asInstanceOf[js.Any])
  }
  
}

