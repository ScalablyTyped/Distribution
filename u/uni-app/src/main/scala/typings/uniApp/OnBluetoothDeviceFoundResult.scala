package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothDeviceFoundResult extends StObject {
  
  /**
    * 设备列表信息
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.undefined
}
object OnBluetoothDeviceFoundResult {
  
  @scala.inline
  def apply(): OnBluetoothDeviceFoundResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundResult]
  }
  
  @scala.inline
  implicit class OnBluetoothDeviceFoundResultMutableBuilder[Self <: OnBluetoothDeviceFoundResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
