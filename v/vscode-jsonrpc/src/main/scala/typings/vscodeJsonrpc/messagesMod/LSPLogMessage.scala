package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LSPLogMessage extends js.Object {
  var message: RequestMessage | ResponseMessage | NotificationMessage = js.native
  var timestamp: Double = js.native
  var `type`: LSPMessageType = js.native
}

object LSPLogMessage {
  @scala.inline
  def apply(
    message: RequestMessage | ResponseMessage | NotificationMessage,
    timestamp: Double,
    `type`: LSPMessageType
  ): LSPLogMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSPLogMessage]
  }
  @scala.inline
  implicit class LSPLogMessageOps[Self <: LSPLogMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: RequestMessage | ResponseMessage | NotificationMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LSPMessageType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

