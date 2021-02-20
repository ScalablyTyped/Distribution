package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBluetoothAdapterStateSuccessCallbackResult extends StObject {
  
  /** 蓝牙适配器是否可用 */
  var available: Boolean = js.native
  
  /** 是否正在搜索设备 */
  var discovering: Boolean = js.native
  
  var errMsg: String = js.native
}
object GetBluetoothAdapterStateSuccessCallbackResult {
  
  @scala.inline
  def apply(available: Boolean, discovering: Boolean, errMsg: String): GetBluetoothAdapterStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBluetoothAdapterStateSuccessCallbackResultMutableBuilder[Self <: GetBluetoothAdapterStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
