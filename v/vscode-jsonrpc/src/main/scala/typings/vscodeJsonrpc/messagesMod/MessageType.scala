package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageType extends js.Object {
  val method: String = js.native
  val numberOfParams: Double = js.native
}

object MessageType {
  @scala.inline
  def apply(method: String, numberOfParams: Double): MessageType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], numberOfParams = numberOfParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  implicit class MessageTypeOps[Self <: MessageType] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfParams(value: Double): Self = this.set("numberOfParams", value.asInstanceOf[js.Any])
  }
  
}

