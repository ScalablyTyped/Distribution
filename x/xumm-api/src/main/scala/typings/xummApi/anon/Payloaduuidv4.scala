package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payloaduuidv4 extends js.Object {
  var payload_uuidv4: String = js.native
  var reference_call_uuidv4: String = js.native
  var return_url: Web = js.native
  var signed: Boolean = js.native
  var user_token: Boolean = js.native
}

object Payloaduuidv4 {
  @scala.inline
  def apply(
    payload_uuidv4: String,
    reference_call_uuidv4: String,
    return_url: Web,
    signed: Boolean,
    user_token: Boolean
  ): Payloaduuidv4 = {
    val __obj = js.Dynamic.literal(payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], reference_call_uuidv4 = reference_call_uuidv4.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payloaduuidv4]
  }
  @scala.inline
  implicit class Payloaduuidv4Ops[Self <: Payloaduuidv4] (val x: Self) extends AnyVal {
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
    def setPayload_uuidv4(value: String): Self = this.set("payload_uuidv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference_call_uuidv4(value: String): Self = this.set("reference_call_uuidv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn_url(value: Web): Self = this.set("return_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_token(value: Boolean): Self = this.set("user_token", value.asInstanceOf[js.Any])
  }
  
}

