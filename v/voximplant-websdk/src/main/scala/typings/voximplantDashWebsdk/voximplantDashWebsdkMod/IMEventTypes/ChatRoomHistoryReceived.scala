package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMHistoryMessage
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat room history received
		*/
trait ChatRoomHistoryReceived extends VoxImplantIMEvent {
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: String
  /**
  			* List of messages
  			*/
  var messages: js.Array[IMHistoryMessage]
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomHistoryReceived {
  @scala.inline
  def apply(message_id: String, messages: js.Array[IMHistoryMessage], room: String): ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id, messages = messages, room = room)
  
    __obj.asInstanceOf[ChatRoomHistoryReceived]
  }
}

