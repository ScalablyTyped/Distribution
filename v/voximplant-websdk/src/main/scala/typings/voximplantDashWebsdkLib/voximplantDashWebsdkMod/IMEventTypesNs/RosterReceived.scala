package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster data received
		*/
trait RosterReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Array contains VoxImplant.RosterItem elements
  			*/
  var roster: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItem]
}

object RosterReceived {
  @scala.inline
  def apply(id: java.lang.String, roster: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id, roster = roster)
  
    __obj.asInstanceOf[RosterReceived]
  }
}

