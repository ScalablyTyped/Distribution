package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothAdapterStateData
  extends StObject
     with ErrMsgResponse {
  
  /**
    * 蓝牙适配器信息
    */
  var adapterState: BluetoothAdapterState
}
object BluetoothAdapterStateData {
  
  inline def apply(adapterState: BluetoothAdapterState, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(adapterState = adapterState.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
  
  extension [Self <: BluetoothAdapterStateData](x: Self) {
    
    inline def setAdapterState(value: BluetoothAdapterState): Self = StObject.set(x, "adapterState", value.asInstanceOf[js.Any])
  }
}
