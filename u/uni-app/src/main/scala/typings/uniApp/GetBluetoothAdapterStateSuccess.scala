package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBluetoothAdapterStateSuccess extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object GetBluetoothAdapterStateSuccess {
  
  inline def apply(): GetBluetoothAdapterStateSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccess]
  }
  
  extension [Self <: GetBluetoothAdapterStateSuccess](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    inline def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
