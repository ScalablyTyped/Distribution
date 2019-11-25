package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMHistoryMessage
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat history received
		*/
trait ChatHistoryReceived extends VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var id: String
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: String
  /**
  			* List of messages
  			*/
  var messages: js.Array[IMHistoryMessage]
}

object ChatHistoryReceived {
  @scala.inline
  def apply(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatHistoryReceived]
  }
}

