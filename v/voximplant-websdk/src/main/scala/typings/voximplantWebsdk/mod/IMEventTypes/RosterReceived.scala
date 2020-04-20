package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItem
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster data received
		*/
trait RosterReceived extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Array contains VoxImplant.RosterItem elements
  			*/
  var roster: js.Array[RosterItem]
}

object RosterReceived {
  @scala.inline
  def apply(id: String, roster: js.Array[RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterReceived]
  }
}

