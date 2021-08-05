package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBluetoothAdapterStateChangeResult extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
}
object OnBluetoothAdapterStateChangeResult {
  
  inline def apply(): OnBluetoothAdapterStateChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeResult]
  }
  
  extension [Self <: OnBluetoothAdapterStateChangeResult](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    inline def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
  }
}
