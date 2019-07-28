package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.ChatStateType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when chat session state updated
		*/
trait ChatStateUpdate extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
  /**
  			*	Current chat session state. See VoxImplant.ChatStateType enum
  			*/
  var state: ChatStateType
}

object ChatStateUpdate {
  @scala.inline
  def apply(id: String, state: ChatStateType, resource: String = null): ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id, state = state)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ChatStateUpdate]
  }
}

