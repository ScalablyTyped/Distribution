package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMessageParams extends js.Object {
  /**
    * The actual message
    */
  var message: String
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}

object LogMessageParams {
  @scala.inline
  def apply(message: String, `type`: MessageType): LogMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessageParams]
  }
}

