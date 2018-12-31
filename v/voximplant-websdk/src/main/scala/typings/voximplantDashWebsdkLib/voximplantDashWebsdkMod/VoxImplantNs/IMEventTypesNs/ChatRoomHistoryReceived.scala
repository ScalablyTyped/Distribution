package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room history received
		*/
trait ChatRoomHistoryReceived extends js.Object {
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: java.lang.String
  /**
  			* List of messages
  			*/
  var messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMHistoryMessage]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

