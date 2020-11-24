package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.central
import typings.wechatMiniprogram.wechatMiniprogramStrings.peripheral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenBluetoothAdapterOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenBluetoothAdapterCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenBluetoothAdapterFailCallback] = js.native
  
  /** 蓝牙模式，可作为主/从设备，仅 iOS 需要。
    *
    * 可选值：
    * - 'central': 主机模式;
    * - 'peripheral': 从机模式;
    *
    * 最低基础库： `2.10.0` */
  var mode: js.UndefOr[central | peripheral] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenBluetoothAdapterSuccessCallback] = js.native
}
object OpenBluetoothAdapterOption {
  
  @scala.inline
  def apply(): OpenBluetoothAdapterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenBluetoothAdapterOption]
  }
  
  @scala.inline
  implicit class OpenBluetoothAdapterOptionOps[Self <: OpenBluetoothAdapterOption] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* res */ BluetoothError => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ BluetoothError => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMode(value: central | peripheral): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ BluetoothError => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
