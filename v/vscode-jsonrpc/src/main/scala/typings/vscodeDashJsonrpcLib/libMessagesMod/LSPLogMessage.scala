package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LSPLogMessage extends js.Object {
  var message: RequestMessage | ResponseMessage | NotificationMessage
  var timestamp: scala.Double
  var `type`: LSPMessageType
}

object LSPLogMessage {
  @scala.inline
  def apply(
    message: RequestMessage | ResponseMessage | NotificationMessage,
    timestamp: scala.Double,
    `type`: LSPMessageType
  ): LSPLogMessage = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LSPLogMessage]
  }
}

