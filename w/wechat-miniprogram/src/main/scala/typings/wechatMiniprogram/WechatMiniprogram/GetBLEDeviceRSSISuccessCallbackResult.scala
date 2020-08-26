package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBLEDeviceRSSISuccessCallbackResult extends js.Object {
  /** 信号强度 */
  var RSSI: Double = js.native
  var errMsg: String = js.native
}

object GetBLEDeviceRSSISuccessCallbackResult {
  @scala.inline
  def apply(RSSI: Double, errMsg: String): GetBLEDeviceRSSISuccessCallbackResult = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceRSSISuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBLEDeviceRSSISuccessCallbackResultOps[Self <: GetBLEDeviceRSSISuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setRSSI(value: Double): Self = this.set("RSSI", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

