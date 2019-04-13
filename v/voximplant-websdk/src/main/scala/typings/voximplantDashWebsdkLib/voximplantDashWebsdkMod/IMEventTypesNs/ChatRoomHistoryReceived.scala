package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room history received
		*/
trait ChatRoomHistoryReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: java.lang.String
  /**
  			* List of messages
  			*/
  var messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMHistoryMessage]
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomHistoryReceived {
  @scala.inline
  def apply(
    message_id: java.lang.String,
    messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMHistoryMessage],
    room: java.lang.String
  ): ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id, messages = messages, room = room)
  
    __obj.asInstanceOf[ChatRoomHistoryReceived]
  }
}

