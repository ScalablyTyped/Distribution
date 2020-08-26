package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBLEConnectionOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CreateBLEConnectionCompleteCallback] = js.native
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CreateBLEConnectionFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CreateBLEConnectionSuccessCallback] = js.native
  /** 超时时间，单位ms，不填表示不会超时 */
  var timeout: js.UndefOr[Double] = js.native
}

object CreateBLEConnectionOption {
  @scala.inline
  def apply(deviceId: String): CreateBLEConnectionOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEConnectionOption]
  }
  @scala.inline
  implicit class CreateBLEConnectionOptionOps[Self <: CreateBLEConnectionOption] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ BluetoothError => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ BluetoothError => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ BluetoothError => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

