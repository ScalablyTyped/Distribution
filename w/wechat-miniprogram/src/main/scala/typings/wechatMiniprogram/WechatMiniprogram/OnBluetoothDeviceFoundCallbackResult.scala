package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundCallbackResult extends StObject {
  
  /** 新搜索到的设备列表 */
  var devices: js.Array[BlueToothDevice]
}
object OnBluetoothDeviceFoundCallbackResult {
  
  inline def apply(devices: js.Array[BlueToothDevice]): OnBluetoothDeviceFoundCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothDeviceFoundCallbackResult]
  }
  
  extension [Self <: OnBluetoothDeviceFoundCallbackResult](x: Self) {
    
    inline def setDevices(value: js.Array[BlueToothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BlueToothDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
