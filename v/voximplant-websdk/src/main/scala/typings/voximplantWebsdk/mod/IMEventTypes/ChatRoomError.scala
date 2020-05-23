package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event dispatched in case of error while chat room operation
  */
trait ChatRoomError extends VoxImplantIMEvent {
  /**
    * Error code
    */
  var code: String
  /**
    * Operation name
    */
  var operation: String
  /**
    * Room id
    */
  var room: String
  /**
    * Error description
    */
  var text: String
}

object ChatRoomError {
  @scala.inline
  def apply(code: String, operation: String, room: String, text: String): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomError]
  }
}

