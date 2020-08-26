package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolReference extends js.Object {
  /**
    * The pool ID.
    */
  var id: Double = js.native
  /**
    * A value indicating whether or not this pool is managed by the service.
    */
  var isHosted: Boolean = js.native
  /**
    * The pool name.
    */
  var name: String = js.native
}

object TaskAgentPoolReference {
  @scala.inline
  def apply(id: Double, isHosted: Boolean, name: String): TaskAgentPoolReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolReference]
  }
  @scala.inline
  implicit class TaskAgentPoolReferenceOps[Self <: TaskAgentPoolReference] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHosted(value: Boolean): Self = this.set("isHosted", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

