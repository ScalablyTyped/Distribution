package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesSuccessCallbackResult extends StObject {
  
  /** 搜索到的设备列表 */
  var devices: js.Array[BluetoothDeviceInfo]
  
  var errMsg: String
}
object GetConnectedBluetoothDevicesSuccessCallbackResult {
  
  inline def apply(devices: js.Array[BluetoothDeviceInfo], errMsg: String): GetConnectedBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessCallbackResult]
  }
  
  extension [Self <: GetConnectedBluetoothDevicesSuccessCallbackResult](x: Self) {
    
    inline def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
