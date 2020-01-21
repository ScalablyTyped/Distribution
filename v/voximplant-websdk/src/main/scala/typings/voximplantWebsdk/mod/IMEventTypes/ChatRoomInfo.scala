package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
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
  var info: ChatRoomInfo
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
  def apply(features: Double, info: ChatRoomInfo, room: String, room_name: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomInfo]
  }
}

