package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if chat room participant presence status was updated
		*/

trait ChatRoomPresenceUpdate extends js.Object {
  /**
  			* Optional presence message
  			*/
  var message: java.lang.String
  /**
  			* Participant info
  			*/
  var participant: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ParticipantInfo
  /**
  			* Current presence status
  			*/
  var presence: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.UserStatuses
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

