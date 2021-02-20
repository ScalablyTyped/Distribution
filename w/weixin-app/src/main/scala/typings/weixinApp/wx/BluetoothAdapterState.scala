package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothAdapterState extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: Boolean = js.native
  
  /**
    * 蓝牙适配器是否处于搜索状态
    */
  var discovering: Boolean = js.native
}
object BluetoothAdapterState {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): BluetoothAdapterState = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterState]
  }
  
  @scala.inline
  implicit class BluetoothAdapterStateMutableBuilder[Self <: BluetoothAdapterState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
