package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueueReference extends ResourceReference {
  /**
    * The ID of the queue.
    */
  var id: Double
}

object AgentPoolQueueReference {
  @scala.inline
  def apply(alias: String, id: Double): AgentPoolQueueReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentPoolQueueReference]
  }
}

