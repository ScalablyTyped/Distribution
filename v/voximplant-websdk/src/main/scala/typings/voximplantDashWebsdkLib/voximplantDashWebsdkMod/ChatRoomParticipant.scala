package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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

object ChatRoomParticipant {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, owner: js.UndefOr[scala.Boolean] = js.undefined): ChatRoomParticipant = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ChatRoomParticipant]
  }
}

