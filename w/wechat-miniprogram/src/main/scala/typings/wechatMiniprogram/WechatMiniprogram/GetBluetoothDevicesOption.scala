package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothDevicesOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBluetoothDevicesCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBluetoothDevicesFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBluetoothDevicesSuccessCallback] = js.undefined
}
object GetBluetoothDevicesOption {
  
  @scala.inline
  def apply(): GetBluetoothDevicesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothDevicesOption]
  }
  
  @scala.inline
  implicit class GetBluetoothDevicesOptionMutableBuilder[Self <: GetBluetoothDevicesOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ GetBluetoothDevicesSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
