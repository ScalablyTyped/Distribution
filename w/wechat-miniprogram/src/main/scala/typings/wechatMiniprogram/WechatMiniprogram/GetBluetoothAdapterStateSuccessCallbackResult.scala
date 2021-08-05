package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothAdapterStateSuccessCallbackResult extends StObject {
  
  /** 蓝牙适配器是否可用 */
  var available: Boolean
  
  /** 是否正在搜索设备 */
  var discovering: Boolean
  
  var errMsg: String
}
object GetBluetoothAdapterStateSuccessCallbackResult {
  
  inline def apply(available: Boolean, discovering: Boolean, errMsg: String): GetBluetoothAdapterStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccessCallbackResult]
  }
  
  extension [Self <: GetBluetoothAdapterStateSuccessCallbackResult](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
