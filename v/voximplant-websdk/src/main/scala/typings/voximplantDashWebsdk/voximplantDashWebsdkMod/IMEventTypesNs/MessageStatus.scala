package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.MessageEventType
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when sent message status changed
		*/
trait MessageStatus extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String
  /**
  			*	Message id
  			*/
  var message_id: String
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
  /**
  			*	Message event type. See VoxImplant.MessageEventType enum
  			*/
  var `type`: MessageEventType
}

object MessageStatus {
  @scala.inline
  def apply(id: String, message_id: String, `type`: MessageEventType, resource: String = null): MessageStatus = {
    val __obj = js.Dynamic.literal(id = id, message_id = message_id)
    __obj.updateDynamic("type")(`type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[MessageStatus]
  }
}

