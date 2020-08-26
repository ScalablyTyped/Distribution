package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveToLocationOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[MoveToLocationCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[MoveToLocationFailCallback] = js.native
  /** 纬度
    *
    * 最低基础库： `2.8.0` */
  var latitude: js.UndefOr[Double] = js.native
  /** 经度
    *
    * 最低基础库： `2.8.0` */
  var longitude: js.UndefOr[Double] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[MoveToLocationSuccessCallback] = js.native
}

object MoveToLocationOption {
  @scala.inline
  def apply(): MoveToLocationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToLocationOption]
  }
  @scala.inline
  implicit class MoveToLocationOptionOps[Self <: MoveToLocationOption] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

