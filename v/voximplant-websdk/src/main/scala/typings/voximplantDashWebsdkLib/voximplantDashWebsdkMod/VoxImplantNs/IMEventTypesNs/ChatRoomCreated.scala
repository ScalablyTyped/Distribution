package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched if chat room was created successfully
		*/
trait ChatRoomCreated
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			* Room id
  			*/
  var room: java.lang.String
}

object ChatRoomCreated {
  @scala.inline
  def apply(room: java.lang.String): ChatRoomCreated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[ChatRoomCreated]
  }
}

