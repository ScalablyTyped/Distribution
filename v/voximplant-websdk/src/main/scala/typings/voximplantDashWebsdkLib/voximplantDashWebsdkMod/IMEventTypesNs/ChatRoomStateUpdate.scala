package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatRoomStateUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var from: java.lang.String
  /**
  			* Resource name
  			*/
  var resource: java.lang.String
  /**
  			* Room id
  			*/
  var room: java.lang.String
  /**
  			* Current chat session state
  			*/
  var state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
}

object ChatRoomStateUpdate {
  @scala.inline
  def apply(
    from: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.ChatStateType
  ): ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal(from = from, resource = resource, room = room, state = state)
  
    __obj.asInstanceOf[ChatRoomStateUpdate]
  }
}

