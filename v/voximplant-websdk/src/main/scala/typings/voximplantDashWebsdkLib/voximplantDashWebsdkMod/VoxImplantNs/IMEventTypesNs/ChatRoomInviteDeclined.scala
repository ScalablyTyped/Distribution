package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if an invitation to chat room was declined by the invitee
		*/

trait ChatRoomInviteDeclined extends js.Object {
  /**
  			* User id (invitee)
  			*/
  var invitee: java.lang.String
  /**
  			* A reason of the invitation
  			*/
  var reason: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

