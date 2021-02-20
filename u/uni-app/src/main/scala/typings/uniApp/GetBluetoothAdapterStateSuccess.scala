package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothAdapterStateSuccess extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.native
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object GetBluetoothAdapterStateSuccess {
  
  @scala.inline
  def apply(): GetBluetoothAdapterStateSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccess]
  }
  
  @scala.inline
  implicit class GetBluetoothAdapterStateSuccessMutableBuilder[Self <: GetBluetoothAdapterStateSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveringUndefined: Self = StObject.set(x, "discovering", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
