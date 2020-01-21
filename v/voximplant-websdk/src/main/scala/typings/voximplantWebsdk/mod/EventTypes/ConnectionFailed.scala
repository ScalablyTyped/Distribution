package typings.voximplantWebsdk.mod.EventTypes

import typings.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if connection to VoxImplant Cloud couldn't be established. See connect function
		*/
trait ConnectionFailed extends VoxImplantEvent {
  /**
  			*	Failure reason description
  			*/
  var message: String
}

object ConnectionFailed {
  @scala.inline
  def apply(message: String): ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionFailed]
  }
}

