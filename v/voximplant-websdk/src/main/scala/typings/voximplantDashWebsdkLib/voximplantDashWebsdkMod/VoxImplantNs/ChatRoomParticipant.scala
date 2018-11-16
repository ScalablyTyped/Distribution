package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Chat room participant
	*/

trait ChatRoomParticipant extends js.Object {
  /**
  		* User id
  		*/
  var id: java.lang.String
  /**
  		* User display name
  		*/
  var name: java.lang.String
  /**
  		* True if the user is owner/admin of the room
  		*/
  var owner: js.UndefOr[scala.Boolean] = js.undefined
}

