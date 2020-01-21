package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if error happened during instant message modification
		*/
trait MessageNotModified extends VoxImplantIMEvent {
  /**
  			*	Message new content
  			*/
  var code: Double
  /**
  			*	Message id
  			*/
  var message_id: String
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: String
}

object MessageNotModified {
  @scala.inline
  def apply(code: Double, message_id: String, to: String): MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageNotModified]
  }
}

