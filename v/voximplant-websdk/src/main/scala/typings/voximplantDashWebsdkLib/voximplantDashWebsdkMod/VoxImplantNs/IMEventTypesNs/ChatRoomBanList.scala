package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about banned chat room participants received
		*/

trait ChatRoomBanList extends js.Object {
  /**
  			* Participants list
  			*/
  var participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

