package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when info about chat room participants received
		*/
trait ChatRoomParticipants extends js.Object {
  /**
  			* Participants list
  			*/
  var participants: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatRoomParticipant]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

