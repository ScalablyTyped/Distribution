package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  var id: String
  /**
  		* User display name
  		*/
  var name: String
  /**
  		* True if the user is owner/admin of the room
  		*/
  var owner: js.UndefOr[Boolean] = js.undefined
}

object ChatRoomParticipant {
  @scala.inline
  def apply(id: String, name: String, owner: js.UndefOr[Boolean] = js.undefined): ChatRoomParticipant = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ChatRoomParticipant]
  }
}

