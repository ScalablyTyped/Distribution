package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when user joins chat room
		*/
trait ChatRoomInfo extends VoxImplantIMEvent {
  /**
  			* Room features
  			*/
  var features: Double
  /**
  			* Room info object
  			*/
  var info: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInfo
  /**
  			* Room id
  			*/
  var room: String
  /**
  			* Room name
  			*/
  var room_name: String
}

object ChatRoomInfo {
  @scala.inline
  def apply(
    features: Double,
    info: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInfo,
    room: String,
    room_name: String
  ): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features, info = info, room = room, room_name = room_name)
  
    __obj.asInstanceOf[ChatRoomInfo]
  }
}

