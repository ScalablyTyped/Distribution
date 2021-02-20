package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBluetoothAdapterStateChangeResult extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.native
}
object OnBluetoothAdapterStateChangeResult {
  
  @scala.inline
  def apply(): OnBluetoothAdapterStateChangeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeResult]
  }
  
  @scala.inline
  implicit class OnBluetoothAdapterStateChangeResultMutableBuilder[Self <: OnBluetoothAdapterStateChangeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
  }
}
