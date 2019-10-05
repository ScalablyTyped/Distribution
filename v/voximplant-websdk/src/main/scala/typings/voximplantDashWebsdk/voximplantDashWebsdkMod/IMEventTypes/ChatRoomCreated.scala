package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched if chat room was created successfully
		*/
trait ChatRoomCreated extends VoxImplantIMEvent {
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomCreated {
  @scala.inline
  def apply(room: String): ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room)
  
    __obj.asInstanceOf[ChatRoomCreated]
  }
}

