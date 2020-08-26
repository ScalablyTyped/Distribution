package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNavigationBarTitleOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 成功获取系统信息的回调 */
  var success: js.UndefOr[ResponseCallback] = js.native
  /** 页面标题 */
  var title: js.UndefOr[String] = js.native
}

object SetNavigationBarTitleOptions {
  @scala.inline
  def apply(): SetNavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNavigationBarTitleOptions]
  }
  @scala.inline
  implicit class SetNavigationBarTitleOptionsOps[Self <: SetNavigationBarTitleOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

