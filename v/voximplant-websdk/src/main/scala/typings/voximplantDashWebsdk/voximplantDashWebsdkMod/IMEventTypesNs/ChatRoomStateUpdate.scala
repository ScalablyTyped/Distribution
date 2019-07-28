package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatRoomStateUpdate extends VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var from: String
  /**
  			* Resource name
  			*/
  var resource: String
  /**
  			* Room id
  			*/
  var room: String
  /**
  			* Current chat session state
  			*/
  var state: ChatStateType
}

object ChatRoomStateUpdate {
  @scala.inline
  def apply(from: String, resource: String, room: String, state: ChatStateType): ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal(from = from, resource = resource, room = room, state = state)
  
    __obj.asInstanceOf[ChatRoomStateUpdate]
  }
}

