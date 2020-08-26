package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateChangeEvent extends js.Object {
  var newState: State = js.native
  var oldState: State = js.native
}

object StateChangeEvent {
  @scala.inline
  def apply(newState: State, oldState: State): StateChangeEvent = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeEvent]
  }
  @scala.inline
  implicit class StateChangeEventOps[Self <: StateChangeEvent] (val x: Self) extends AnyVal {
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
    def setNewState(value: State): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldState(value: State): Self = this.set("oldState", value.asInstanceOf[js.Any])
  }
  
}

