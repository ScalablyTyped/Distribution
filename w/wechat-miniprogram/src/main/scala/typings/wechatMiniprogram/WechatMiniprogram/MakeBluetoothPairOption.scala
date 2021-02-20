package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeBluetoothPairOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[MakeBluetoothPairCompleteCallback] = js.native
  
  /** 蓝牙设备 id */
  var deviceId: String = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[MakeBluetoothPairFailCallback] = js.native
  
  /** pin 码 */
  var pin: js.UndefOr[ArrayBuffer] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[MakeBluetoothPairSuccessCallback] = js.native
  
  /** 超时时间 */
  var timeout: js.UndefOr[Double] = js.native
}
object MakeBluetoothPairOption {
  
  @scala.inline
  def apply(deviceId: String): MakeBluetoothPairOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeBluetoothPairOption]
  }
  
  @scala.inline
  implicit class MakeBluetoothPairOptionMutableBuilder[Self <: MakeBluetoothPairOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPin(value: ArrayBuffer): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
