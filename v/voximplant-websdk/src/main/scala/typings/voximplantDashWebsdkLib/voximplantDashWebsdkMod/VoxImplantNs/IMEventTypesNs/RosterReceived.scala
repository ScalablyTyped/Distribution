package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster data received
		*/
trait RosterReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Array contains VoxImplant.RosterItem elements
  			*/
  var roster: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItem]
}

object RosterReceived {
  @scala.inline
  def apply(
    id: java.lang.String,
    roster: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.RosterItem]
  ): RosterReceived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("roster")(roster)
    __obj.asInstanceOf[RosterReceived]
  }
}

