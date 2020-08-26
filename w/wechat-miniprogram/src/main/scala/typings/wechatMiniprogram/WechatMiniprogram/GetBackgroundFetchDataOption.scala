package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundFetchDataOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBackgroundFetchDataCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBackgroundFetchDataFailCallback] = js.native
  /** 取值为 periodic */
  var fetchType: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBackgroundFetchDataSuccessCallback] = js.native
}

object GetBackgroundFetchDataOption {
  @scala.inline
  def apply(fetchType: String): GetBackgroundFetchDataOption = {
    val __obj = js.Dynamic.literal(fetchType = fetchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundFetchDataOption]
  }
  @scala.inline
  implicit class GetBackgroundFetchDataOptionOps[Self <: GetBackgroundFetchDataOption] (val x: Self) extends AnyVal {
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
    def setFetchType(value: String): Self = this.set("fetchType", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

