package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat history received
		*/
trait ChatHistoryReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var id: java.lang.String
  /**
  			* Message id specified in getInstantMessagingHistory method
  			*/
  var message_id: java.lang.String
  /**
  			* List of messages
  			*/
  var messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMHistoryMessage]
}

object ChatHistoryReceived {
  @scala.inline
  def apply(
    id: java.lang.String,
    message_id: java.lang.String,
    messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMHistoryMessage]
  ): ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id, message_id = message_id, messages = messages)
  
    __obj.asInstanceOf[ChatHistoryReceived]
  }
}

