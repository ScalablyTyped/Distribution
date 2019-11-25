package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was modified by user
		*/
trait MessageModified extends VoxImplantIMEvent {
  /**
  			*	Message new content
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
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: String
}

object MessageModified {
  @scala.inline
  def apply(content: String, id: String, message_id: String, to: String): MessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageModified]
  }
}

