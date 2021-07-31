package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙设备主 service 的 uuid 列表
    */
  var services: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ GetConnectedBluetoothDevicesSuccess, Unit]] = js.undefined
}
object GetConnectedBluetoothDevicesOptions {
  
  @scala.inline
  def apply(): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  
  @scala.inline
  implicit class GetConnectedBluetoothDevicesOptionsMutableBuilder[Self <: GetConnectedBluetoothDevicesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[js.Any]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: js.Any*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ GetConnectedBluetoothDevicesSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
