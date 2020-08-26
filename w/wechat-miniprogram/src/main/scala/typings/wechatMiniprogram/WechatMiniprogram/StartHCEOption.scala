package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHCEOption extends js.Object {
  /** 需要注册到系统的 AID 列表 */
  var aid_list: js.Array[String] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartHCECompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartHCEFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartHCESuccessCallback] = js.native
}

object StartHCEOption {
  @scala.inline
  def apply(aid_list: js.Array[String]): StartHCEOption = {
    val __obj = js.Dynamic.literal(aid_list = aid_list.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHCEOption]
  }
  @scala.inline
  implicit class StartHCEOptionOps[Self <: StartHCEOption] (val x: Self) extends AnyVal {
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
    def setAid_listVarargs(value: String*): Self = this.set("aid_list", js.Array(value :_*))
    @scala.inline
    def setAid_list(value: js.Array[String]): Self = this.set("aid_list", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ NFCError => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ NFCError => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ NFCError => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

