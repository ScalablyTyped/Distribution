package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBluetoothDevicesDiscoveryOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ StopBluetoothDevicesDiscoverySuccess, Unit]] = js.native
}

object StopBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(): StopBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBluetoothDevicesDiscoveryOptions]
  }
  @scala.inline
  implicit class StopBluetoothDevicesDiscoveryOptionsOps[Self <: StopBluetoothDevicesDiscoveryOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ StopBluetoothDevicesDiscoverySuccess => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

