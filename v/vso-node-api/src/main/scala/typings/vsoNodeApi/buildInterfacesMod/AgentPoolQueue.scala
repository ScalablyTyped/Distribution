package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentPoolQueue extends js.Object {
  var _links: js.Any = js.native
  /**
    * The ID of the queue.
    */
  var id: Double = js.native
  /**
    * The name of the queue.
    */
  var name: String = js.native
  /**
    * The pool used by this queue.
    */
  var pool: TaskAgentPoolReference = js.native
  /**
    * The full http link to the resource.
    */
  var url: String = js.native
}

object AgentPoolQueue {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, pool: TaskAgentPoolReference, url: String): AgentPoolQueue = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPoolQueue]
  }
  @scala.inline
  implicit class AgentPoolQueueOps[Self <: AgentPoolQueue] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

