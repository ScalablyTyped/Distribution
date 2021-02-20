package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBLEPeripheralServerSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** [BLEPeripheralServer](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.html)
    *
    * 外围设备的服务端。 */
  var server: BLEPeripheralServer = js.native
}
object CreateBLEPeripheralServerSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, server: BLEPeripheralServer): CreateBLEPeripheralServerSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEPeripheralServerSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CreateBLEPeripheralServerSuccessCallbackResultMutableBuilder[Self <: CreateBLEPeripheralServerSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: BLEPeripheralServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
