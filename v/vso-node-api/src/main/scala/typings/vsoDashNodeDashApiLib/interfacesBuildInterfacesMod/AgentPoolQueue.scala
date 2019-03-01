package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueue extends js.Object {
  var _links: js.Any
  /**
    * The ID of the queue.
    */
  var id: scala.Double
  /**
    * The name of the queue.
    */
  var name: java.lang.String
  /**
    * The pool used by this queue.
    */
  var pool: TaskAgentPoolReference
  /**
    * The full http link to the resource.
    */
  var url: java.lang.String
}

object AgentPoolQueue {
  @scala.inline
  def apply(
    _links: js.Any,
    id: scala.Double,
    name: java.lang.String,
    pool: TaskAgentPoolReference,
    url: java.lang.String
  ): AgentPoolQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AgentPoolQueue]
  }
}

