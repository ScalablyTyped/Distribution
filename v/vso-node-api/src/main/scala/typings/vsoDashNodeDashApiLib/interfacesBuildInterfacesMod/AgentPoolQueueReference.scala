package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueueReference extends ResourceReference {
  /**
    * The ID of the queue.
    */
  var id: scala.Double
}

object AgentPoolQueueReference {
  @scala.inline
  def apply(alias: java.lang.String, id: scala.Double): AgentPoolQueueReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AgentPoolQueueReference]
  }
}

