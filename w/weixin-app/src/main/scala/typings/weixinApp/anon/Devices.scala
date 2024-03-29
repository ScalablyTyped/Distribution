package typings.weixinApp.anon

import typings.weixinApp.wx.BluetoothDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: js.Array[BluetoothDevice]
}
object Devices {
  
  inline def apply(devices: js.Array[BluetoothDevice]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: js.Array[BluetoothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BluetoothDevice*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
