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
    val __obj = js.Dynamic.literal(_links = _links, id = id, name = name, pool = pool, url = url)
  
    __obj.asInstanceOf[AgentPoolQueue]
  }
}

