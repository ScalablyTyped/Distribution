package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedBluetoothDevicesSuccess extends StObject {
  
  /**
    * 搜索到的设备列表
    */
  var devices: js.UndefOr[js.Array[GetConnectedBluetoothDevicesSuccessData]] = js.undefined
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object GetConnectedBluetoothDevicesSuccess {
  
  inline def apply(): GetConnectedBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectedBluetoothDevicesSuccess] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: js.Array[GetConnectedBluetoothDevicesSuccessData]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: GetConnectedBluetoothDevicesSuccessData*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
