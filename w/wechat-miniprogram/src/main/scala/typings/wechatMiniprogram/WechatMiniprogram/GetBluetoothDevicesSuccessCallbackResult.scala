package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothDevicesSuccessCallbackResult extends StObject {
  
  /** uuid 对应的的已连接设备列表 */
  var devices: js.Array[BlueToothDevice]
  
  var errMsg: String
}
object GetBluetoothDevicesSuccessCallbackResult {
  
  inline def apply(devices: js.Array[BlueToothDevice], errMsg: String): GetBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResult]
  }
  
  extension [Self <: GetBluetoothDevicesSuccessCallbackResult](x: Self) {
    
    inline def setDevices(value: js.Array[BlueToothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BlueToothDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
