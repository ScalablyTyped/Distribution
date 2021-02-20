package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBluetoothDevicesDiscoverySuccess extends StObject {
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object StopBluetoothDevicesDiscoverySuccess {
  
  @scala.inline
  def apply(): StopBluetoothDevicesDiscoverySuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBluetoothDevicesDiscoverySuccess]
  }
  
  @scala.inline
  implicit class StopBluetoothDevicesDiscoverySuccessMutableBuilder[Self <: StopBluetoothDevicesDiscoverySuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
