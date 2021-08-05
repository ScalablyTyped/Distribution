package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesSuccessData extends StObject {
  
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.undefined
}
object GetConnectedBluetoothDevicesSuccessData {
  
  inline def apply(): GetConnectedBluetoothDevicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessData]
  }
  
  extension [Self <: GetConnectedBluetoothDevicesSuccessData](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
