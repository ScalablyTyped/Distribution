package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when user joins chat room
		*/
trait ChatRoomInfo
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Room features
  			*/
  var features: scala.Double
  /**
  			* Room info object
  			*/
  var info: ChatRoomInfo
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Room name
  			*/
  var room_name: java.lang.String
}

object ChatRoomInfo {
  @scala.inline
  def apply(features: scala.Double, info: ChatRoomInfo, room: java.lang.String, room_name: java.lang.String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(features = features, info = info, room = room, room_name = room_name)
  
    __obj.asInstanceOf[ChatRoomInfo]
  }
}

