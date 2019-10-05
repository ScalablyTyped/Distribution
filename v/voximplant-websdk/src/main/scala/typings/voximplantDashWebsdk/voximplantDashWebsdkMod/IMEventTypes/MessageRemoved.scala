package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was removed by user
		*/
trait MessageRemoved extends VoxImplantIMEvent {
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

object MessageRemoved {
  @scala.inline
  def apply(id: String, message_id: String, to: String): MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id, message_id = message_id, to = to)
  
    __obj.asInstanceOf[MessageRemoved]
  }
}

