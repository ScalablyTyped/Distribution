package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedBluetoothDevicesSuccessCallbackResult extends StObject {
  
  /** 搜索到的设备列表 */
  var devices: js.Array[BluetoothDeviceInfo] = js.native
  
  var errMsg: String = js.native
}
object GetConnectedBluetoothDevicesSuccessCallbackResult {
  
  @scala.inline
  def apply(devices: js.Array[BluetoothDeviceInfo], errMsg: String): GetConnectedBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetConnectedBluetoothDevicesSuccessCallbackResultMutableBuilder[Self <: GetConnectedBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
