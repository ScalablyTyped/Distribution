package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat history received
		*/
trait ChatHistoryReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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
  var messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMHistoryMessage]
}

object ChatHistoryReceived {
  @scala.inline
  def apply(
    id: java.lang.String,
    message_id: java.lang.String,
    messages: js.Array[voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMHistoryMessage]
  ): ChatHistoryReceived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message_id")(message_id)
    __obj.updateDynamic("messages")(messages)
    __obj.asInstanceOf[ChatHistoryReceived]
  }
}

