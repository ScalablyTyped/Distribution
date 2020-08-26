package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraMsg extends js.Object {
  var extraMsg: js.UndefOr[String] = js.native
  var failedPermid: js.UndefOr[Double] = js.native
  var id: String = js.native
  var message: String = js.native
  var msg: String = js.native
}

object ExtraMsg {
  @scala.inline
  def apply(id: String, message: String, msg: String): ExtraMsg = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraMsg]
  }
  @scala.inline
  implicit class ExtraMsgOps[Self <: ExtraMsg] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraMsg(value: String): Self = this.set("extraMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraMsg: Self = this.set("extraMsg", js.undefined)
    @scala.inline
    def setFailedPermid(value: Double): Self = this.set("failedPermid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedPermid: Self = this.set("failedPermid", js.undefined)
  }
  
}

