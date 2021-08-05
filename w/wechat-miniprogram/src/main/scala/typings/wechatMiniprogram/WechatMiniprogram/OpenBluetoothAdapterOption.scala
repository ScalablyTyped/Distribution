package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.central
import typings.wechatMiniprogram.wechatMiniprogramStrings.peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenBluetoothAdapterOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenBluetoothAdapterCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenBluetoothAdapterFailCallback] = js.undefined
  
  /** 蓝牙模式，可作为主/从设备，仅 iOS 需要。
    *
    * 可选值：
    * - 'central': 主机模式;
    * - 'peripheral': 从机模式;
    *
    * 最低基础库： `2.10.0` */
  var mode: js.UndefOr[central | peripheral] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenBluetoothAdapterSuccessCallback] = js.undefined
}
object OpenBluetoothAdapterOption {
  
  inline def apply(): OpenBluetoothAdapterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenBluetoothAdapterOption]
  }
  
  extension [Self <: OpenBluetoothAdapterOption](x: Self) {
    
    inline def setComplete(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMode(value: central | peripheral): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSuccess(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
