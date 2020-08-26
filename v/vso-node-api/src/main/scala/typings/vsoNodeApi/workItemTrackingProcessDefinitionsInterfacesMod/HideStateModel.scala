package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideStateModel extends js.Object {
  var hidden: Boolean = js.native
}

object HideStateModel {
  @scala.inline
  def apply(hidden: Boolean): HideStateModel = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideStateModel]
  }
  @scala.inline
  implicit class HideStateModelOps[Self <: HideStateModel] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
  }
  
}

