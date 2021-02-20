package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedBluetoothDevicesSuccessData extends StObject {
  
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.native
}
object GetConnectedBluetoothDevicesSuccessData {
  
  @scala.inline
  def apply(): GetConnectedBluetoothDevicesSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessData]
  }
  
  @scala.inline
  implicit class GetConnectedBluetoothDevicesSuccessDataMutableBuilder[Self <: GetConnectedBluetoothDevicesSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
