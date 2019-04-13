package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when instant message was modified by user
		*/
trait MessageModified
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantIMEvent {
  /**
  			*	Message new content
  			*/
  var content: java.lang.String
  /**
  			*	User id (of the user who sent the message)
  			*/
  var id: java.lang.String
  /**
  			*	Message id
  			*/
  var message_id: java.lang.String
  /**
  			*	User id (of the user to whom the message was sent)
  			*/
  var to: java.lang.String
}

object MessageModified {
  @scala.inline
  def apply(
    content: java.lang.String,
    id: java.lang.String,
    message_id: java.lang.String,
    to: java.lang.String
  ): MessageModified = {
    val __obj = js.Dynamic.literal(content = content, id = id, message_id = message_id, to = to)
  
    __obj.asInstanceOf[MessageModified]
  }
}

