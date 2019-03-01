package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatRoomStateUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
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
  var state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
}

object ChatRoomStateUpdate {
  @scala.inline
  def apply(
    from: java.lang.String,
    resource: java.lang.String,
    room: java.lang.String,
    state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
  ): ChatRoomStateUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ChatRoomStateUpdate]
  }
}

