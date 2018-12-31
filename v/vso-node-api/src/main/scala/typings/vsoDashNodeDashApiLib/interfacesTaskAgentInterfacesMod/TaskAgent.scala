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

