package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentReference extends js.Object {
  var _links: js.Any
  /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
  var enabled: scala.Boolean
  /**
    * Gets the identifier of the agent.
    */
  var id: scala.Double
  /**
    * Gets the name of the agent.
    */
  var name: java.lang.String
  /**
    * Gets the current connectivity status of the agent.
    */
  var status: TaskAgentStatus
  /**
    * Gets the version of the agent.
    */
  var version: java.lang.String
}

object TaskAgentReference {
  @scala.inline
  def apply(
    _links: js.Any,
    enabled: scala.Boolean,
    id: scala.Double,
    name: java.lang.String,
    status: TaskAgentStatus,
    version: java.lang.String
  ): TaskAgentReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskAgentReference]
  }
}

