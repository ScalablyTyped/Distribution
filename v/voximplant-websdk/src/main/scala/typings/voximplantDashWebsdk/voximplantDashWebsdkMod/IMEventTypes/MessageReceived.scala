package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message received
		*/
trait MessageReceived extends VoxImplantIMEvent {
  /**
  			*	Message content
  			*/
  var content: String
  /**
  			*	User id (of the user who sent the message)
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
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: String
}

object MessageReceived {
  @scala.inline
  def apply(content: String, id: String, message_id: String, to: String, resource: String = null): MessageReceived = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageReceived]
  }
}

