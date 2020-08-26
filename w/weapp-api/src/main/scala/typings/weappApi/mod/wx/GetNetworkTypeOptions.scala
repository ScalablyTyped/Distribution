package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkTypeOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用成功，返回网络类型 networkType */
  def success(res: NetworkTypeData): Unit = js.native
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(success: NetworkTypeData => Unit): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
  @scala.inline
  implicit class GetNetworkTypeOptionsOps[Self <: GetNetworkTypeOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: NetworkTypeData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
  }
  
}

