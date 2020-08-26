package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseBLEConnectionOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 蓝牙设备 id，参考 getDevices 接口
    */
  var deviceId: String = js.native
  @JSName("success")
  def success_MCloseBLEConnectionOptions(res: ErrMsgResponse): Unit = js.native
}

object CloseBLEConnectionOptions {
  @scala.inline
  def apply(deviceId: String, success: ErrMsgResponse => Unit): CloseBLEConnectionOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBLEConnectionOptions]
  }
  @scala.inline
  implicit class CloseBLEConnectionOptionsOps[Self <: CloseBLEConnectionOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

