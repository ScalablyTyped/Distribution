package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMessageParams extends js.Object {
  /**
    * The actual message
    */
  var message: String = js.native
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType = js.native
}

object LogMessageParams {
  @scala.inline
  def apply(message: String, `type`: MessageType): LogMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessageParams]
  }
  @scala.inline
  implicit class LogMessageParamsOps[Self <: LogMessageParams] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MessageType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

