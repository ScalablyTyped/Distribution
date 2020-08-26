package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItem
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when roster data received
  */
@js.native
trait RosterReceived extends VoxImplantIMEvent {
  /**
    *    User id
    */
  var id: String = js.native
  /**
    *    Array contains VoxImplant.RosterItem elements
    */
  var roster: js.Array[RosterItem] = js.native
}

object RosterReceived {
  @scala.inline
  def apply(id: String, roster: js.Array[RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterReceived]
  }
  @scala.inline
  implicit class RosterReceivedOps[Self <: RosterReceived] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRosterVarargs(value: RosterItem*): Self = this.set("roster", js.Array(value :_*))
    @scala.inline
    def setRoster(value: js.Array[RosterItem]): Self = this.set("roster", value.asInstanceOf[js.Any])
  }
  
}

