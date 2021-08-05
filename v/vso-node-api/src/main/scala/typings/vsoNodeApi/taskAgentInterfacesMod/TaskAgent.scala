package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgent
  extends StObject
     with TaskAgentReference {
  
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
  
  inline def apply(
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
  
  extension [Self <: TaskAgent](x: Self) {
    
    inline def setAssignedRequest(value: TaskAgentJobRequest): Self = StObject.set(x, "assignedRequest", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: TaskAgentAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelism(value: Double): Self = StObject.set(x, "maxParallelism", value.asInstanceOf[js.Any])
    
    inline def setPendingUpdate(value: TaskAgentUpdate): Self = StObject.set(x, "pendingUpdate", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setStatusChangedOn(value: Date): Self = StObject.set(x, "statusChangedOn", value.asInstanceOf[js.Any])
    
    inline def setSystemCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "systemCapabilities", value.asInstanceOf[js.Any])
    
    inline def setUserCapabilities(value: StringDictionary[String]): Self = StObject.set(x, "userCapabilities", value.asInstanceOf[js.Any])
  }
}
