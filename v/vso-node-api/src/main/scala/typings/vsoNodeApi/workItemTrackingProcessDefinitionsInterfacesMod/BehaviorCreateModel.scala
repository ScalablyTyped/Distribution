package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorCreateModel extends js.Object {
  /**
    * Color
    */
  var color: String = js.native
  /**
    * Parent behavior id
    */
  var inherits: String = js.native
  /**
    * Name of the behavior
    */
  var name: String = js.native
}

object BehaviorCreateModel {
  @scala.inline
  def apply(color: String, inherits: String, name: String): BehaviorCreateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorCreateModel]
  }
  @scala.inline
  implicit class BehaviorCreateModelOps[Self <: BehaviorCreateModel] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setInherits(value: String): Self = this.set("inherits", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

