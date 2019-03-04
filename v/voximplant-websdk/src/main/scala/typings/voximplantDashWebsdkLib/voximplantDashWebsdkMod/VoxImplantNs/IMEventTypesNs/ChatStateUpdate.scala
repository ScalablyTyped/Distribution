package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatStateUpdate
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: java.lang.String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /**
  			*	Current chat session state. See VoxImplant.ChatStateType enum
  			*/
  var state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType
}

object ChatStateUpdate {
  @scala.inline
  def apply(
    id: java.lang.String,
    state: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.ChatStateType,
    resource: java.lang.String = null
  ): ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id, state = state)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ChatStateUpdate]
  }
}

