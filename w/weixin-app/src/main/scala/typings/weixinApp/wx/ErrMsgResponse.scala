package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrMsgResponse extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}

object ErrMsgResponse {
  @scala.inline
  def apply(errMsg: ok | String): ErrMsgResponse = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsgResponse]
  }
  @scala.inline
  implicit class ErrMsgResponseOps[Self <: ErrMsgResponse] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: ok | String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

